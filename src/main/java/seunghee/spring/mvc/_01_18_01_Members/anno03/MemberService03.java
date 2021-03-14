package seunghee.spring.mvc._01_18_01_Members.anno03;

import seunghee.spring.mvc._01_18_01_Members.vo.MemberVO03;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


@Service("msrv03")
public class MemberService03 {

    @Autowired
    private MemberDAO03 mdao03;

    // 회원 정보 생성
    public String newMember() {

        String result ="회원 정보 생성 실패";

        MemberVO03 mvo03 = new MemberVO03();
        mvo03.setUserid("spring4");
        mvo03.setPasswd("123456");
        mvo03.setName("홍길동");
        mvo03.setGrade("Gold");
        mvo03.setPoints("1000");
        mvo03.setRegdate("2021-01-18 10:55:00");

        if(mdao03.insertMember(mvo03) > 0)
            result = "회원 정보 생성 성공!";

        return result;
    }

    // 회원 정보 수정 (이름, 등급, 포인트)
    public String modifyMember() {
        String result = "회원 정보 수정 실패";

        MemberVO03 mvo03 = new MemberVO03();
        mvo03.setName("일지매");
        mvo03.setGrade("Bronze");;
        mvo03.setPoints("0");
        mvo03.setUserid("spring4");

        if (mdao03.updateMember(mvo03) > 0)
            result = "회원 정보 수정 성공!";

        return result;
    }

    // 회원 정보 삭제 (이름)
    public String removeMember() {
        String result = "회원 정보 삭제 실패";

        String name = "일지매";

        if (mdao03.removeMember(name) > 0)
            result = "회원 정보 삭제 성공!";

        return result;
    }

    // 회원 정보 조회 (아이디, 등급, 가입일)
    public String readMember() {
        StringBuilder sb = new StringBuilder();
        String fmt = "%10s %10s %10s\n";

        List<MemberVO03> mvo03s = mdao03.selectMember();

        for (MemberVO03 m : mvo03s) {
            sb.append(String.format(fmt, m.getUserid(), m.getGrade(), m.getRegdate()));
        }

        return sb.toString();
    }

    // 회원정보 조회 (아이디로 검색)
    public String readOneMember() {
        String result = "";
        String fmt = "%10s %10s %10s %10s %10s\n";
        String userid = "spring4";

        MemberVO03 mvo03 = mdao03.selectOneMember(userid);

        result = String.format(fmt,mvo03.getUserid(),
                mvo03.getName(), mvo03.getGrade(),
                mvo03.getPoints(), mvo03.getRegdate());

        return result;
    }
}
