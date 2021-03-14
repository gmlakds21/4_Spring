package seunghee.spring.mvc._01_18_01_Members.anno01;

import seunghee.spring.mvc._01_18_01_Members.vo.MemberVO01;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service("msrv01")
public class MemberService01 {

    @Autowired
    private MemberDAO01 mdao01;

    // 회원 정보 생성
    public String newMember() {

        String result ="회원 정보 생성 실패";

        MemberVO01 mvo01 = new MemberVO01();
        mvo01.setUserid("spring4");
        mvo01.setPasswd("123456");
        mvo01.setName("홍길동");
        mvo01.setGrade("Gold");
        mvo01.setPoints("1000");
        mvo01.setRegdate("2021-01-18 10:55:00");

        if(mdao01.insertMember(mvo01) > 0)
            result = "회원 정보 생성 성공!";

        return result;
    }

    // 회원 정보 수정 (이름, 등급, 포인트)
    public String modifyMember() {
        String result = "회원 정보 수정 실패";

        MemberVO01 mvo01 = new MemberVO01();
        mvo01.setName("일지매");
        mvo01.setGrade("Bronze");;
        mvo01.setPoints("0");
        mvo01.setUserid("spring4");

        if (mdao01.updateMember(mvo01) > 0)
            result = "회원 정보 수정 성공!";

        return result;
    }

    // 회원 정보 삭제 (이름)
    public String removeMember() {
        String result = "회원 정보 삭제 실패";

        String name = "일지매";

        if (mdao01.removeMember(name) > 0)
            result = "회원 정보 삭제 성공!";

        return result;
    }

    // 회원 정보 조회 (아이디, 등급, 가입일)
    public String readMember() {
        StringBuilder sb = new StringBuilder();
        String fmt = "%10s %10s %10s\n";

        List<MemberVO01> mvo01s = mdao01.selectMember();

        for (MemberVO01 m : mvo01s) {
            sb.append(String.format(fmt, m.getUserid(), m.getGrade(), m.getRegdate()));
        }

        return sb.toString();
    }

    // 회원정보 조회 (아이디로 검색)
    public String readOneMember() {
        String result = "";
        String fmt = "%10s %10s %10s %10s %10s\n";
        String userid = "spring4";

        MemberVO01 mvo01 = mdao01.selectOneMember(userid);

        result = String.format(fmt,mvo01.getUserid(),
                    mvo01.getName(), mvo01.getGrade(),
                    mvo01.getPoints(), mvo01.getRegdate());

        return result;
    }
}
