package seunghee.spring.mvc._01_18_01_Members.anno03;

import seunghee.spring.mvc._01_18_01_Members.vo.MemberVO03;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository("mdao03")
public class MemberDAO03 {

    @Autowired
    private SqlSession sqlSession;
    // mybatis 사용하기 위해
    // SqlSession 객체를 MemberDAO03 에 DI함

    public int insertMember(MemberVO03 mvo03) {
        return sqlSession.insert("member.insertMember", mvo03);
    }

    public int updateMember(MemberVO03 mvo03) {
        return sqlSession.update("member.updateMember", mvo03);
    }

    public int removeMember(String name) {
        return sqlSession.delete("member.deleteMember", name);
    }

    public List<MemberVO03> selectMember() {
        return sqlSession.selectList("member.selectList");
    }

    public MemberVO03 selectOneMember(String userid) {
        return sqlSession.selectOne("member.selectOne",userid);
    }

}