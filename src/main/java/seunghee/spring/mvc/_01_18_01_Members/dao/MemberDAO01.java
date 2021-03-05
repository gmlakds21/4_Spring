package seunghee.spring.mvc._01_18_01_Members.dao;

import seunghee.spring.mvc._01_18_01_Members.vo.MemberVO01;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository("mdao01")
public class MemberDAO01 {

    @Autowired
    private JdbcTemplate jdbcTemplate;
    // MemberDAO 에서 사용할 JdbcTemplate 객체를
    // DI 받기 위해 @Autowired 로 선언


    // insert, update, delete 문 실행시
    // jdbcTemplate.update 메서드를 이용함
    public int insertMember(MemberVO01 mvo01) {

        // 실행할 SQL 문 정의
        String sql = "insert into member values (?,?,?,?,?,?)";

        // SQL 문에 전달할 매개변수 값 선언
        Object[] params = new Object[] {
                mvo01.getUserid(), mvo01.getPasswd(), mvo01.getName(),
                mvo01.getGrade(), mvo01.getPoints(), mvo01.getRegdate()
        };

        // SQL 문에 전달할 매개변수 값들의 유형 (생략)

        return jdbcTemplate.update(sql, params);
    }

    public int updateMember(MemberVO01 mvo01) {

        String sql = "update member set name=?, grade=?, points=? where userid=?";

        Object[] params = new Object[] {
                mvo01.getName(), mvo01.getGrade(), mvo01.getPoints(), mvo01.getUserid()
        };

        return jdbcTemplate.update(sql, params);
    }

    public int removeMember(String name) {

        String sql = "delete from member where name=?";

        return jdbcTemplate.update(sql, name);
    }

    //select all 문 실행시 jdbcTemplate.query 매서드를 이용함
    public List<MemberVO01> selectMember() {

        String sql = "select userid, grade, regdate from member";

        RowMapper<MemberVO01> mapper = new MemberRowMapper();
        // 콜백 클래스 등록만 하고 호출/실행은 따로 하지 않음
        // 단, query 메서드가 실행하는 도중
        // rs.next 가 참인 경우에 하해 IoC 컨테이너가
        // mapper 객체의 mapRow 메서드를 호출함

        return jdbcTemplate.query(sql, mapper);
    }
        // MemverRowMapper() 클래스를 내부 클래스로 생성시 이렇게 나옴
        // 회원 정보를 출력하는 RowMapper 클래스, Alt + Enter 로 매소드 구현시켜줌
        private class MemberRowMapper implements RowMapper<MemberVO01> {
            @Override
            public MemberVO01 mapRow(ResultSet rs, int num) throws SQLException {
                MemberVO01 mvo01 = new MemberVO01();
                mvo01.setUserid(rs.getString("userid"));
                mvo01.setGrade(rs.getString("grade"));
                mvo01.setRegdate(rs.getString("regdate"));
                return mvo01;
            }
        }

    // select one 문을 실행시 jdbc.Template.queryForObject 매서드를 이용함
    public MemberVO01 selectOneMember(String userid) {

        String sql = "select userid, name, grade, points, regdate from member where userid =?";

        Object[] params = new Object[] { userid };

        RowMapper<MemberVO01> mapper = new MemberOneRowMapper();

        return jdbcTemplate.queryForObject(sql, params, mapper);
    }

        private class MemberOneRowMapper implements RowMapper<MemberVO01> {
            @Override
            public MemberVO01 mapRow(ResultSet rs, int i) throws SQLException {
                MemberVO01 mvo01 = new MemberVO01();
                mvo01.setUserid(rs.getString("userid"));
                mvo01.setName(rs.getString("name"));
                mvo01.setGrade(rs.getString("grade"));
                mvo01.setPoints(rs.getString("points"));
                mvo01.setRegdate(rs.getString("regdate"));
                return mvo01;
            }
        }

}
