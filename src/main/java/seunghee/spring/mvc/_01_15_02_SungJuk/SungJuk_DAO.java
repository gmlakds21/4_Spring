package seunghee.spring.mvc._01_15_02_SungJuk;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

@Repository("sjdao")
public class SungJuk_DAO implements SungJuk_InterDAO {

    // 넘겨받은 성적데이터를 sungjuk테이블에 저장
    @Override
    public String insertSungJuk(SunkJuk_VO sj) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        String result = "성적데이터 처리중...?!?";

        conn = SungJuk_JDBC.makeConn();
        try {
            pstmt = conn.prepareStatement(SungJuk_JDBC.insertSungJuk);
            pstmt.setString(1, sj.getName());
            pstmt.setInt(2, sj.getKor());
            pstmt.setInt(3, sj.getEng());
            pstmt.setInt(4, sj.getMat());
            pstmt.setInt(5, sj.getSum());
            pstmt.setDouble(6, sj.getMean());
            pstmt.setString(7, sj.getGrd()+"");
            int cnt = pstmt.executeUpdate();
            if (cnt > 0) result = "성적데이터 저장완료!";
        } catch (SQLException se) {
            System.out.println("insertSQL에서 오류발생!!");
        }
        SungJuk_JDBC.destoryConn(conn, pstmt);

        return result;
    }

    // 번호,이름,국어,영어,수학,등록일을 조회하고
    // 그 결과들을 ArrayList에 담아서 넘김
    @Override
    public ArrayList<SunkJuk_VO> selectSungJuk() {
        ArrayList<SunkJuk_VO> sjs = new ArrayList<>();
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        conn = SungJuk_JDBC.makeConn();
        try {
            pstmt = conn.prepareStatement(SungJuk_JDBC.selectSungJuk);
            rs = pstmt.executeQuery();
            while(rs.next()){
                SunkJuk_VO sj = new SunkJuk_VO(
                        rs.getInt(1),       // sjno
                        rs.getString(2),    // name
                        rs.getInt(3),       // kor
                        rs.getInt(4),       // eng
                        rs.getInt(5),       // mat
                        0,0.0,' ',
                        rs.getString(6));   // regdate
                sjs.add(sj);
            }
        } catch (SQLException se) {
            System.out.println("selectSungJuk에서 오류발생!!");
            se.printStackTrace();
        }
        SungJuk_JDBC.destoryConn(conn,pstmt,rs);

        return sjs;
    }

    // 성적번호로 성적데이터를 조회하고
    // 그 결과를 SungJukVO에 담아서 넘김
    @Override
    public SunkJuk_VO selectOneSungJuk(String sjno) {
        SunkJuk_VO sj = null;
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        conn = SungJuk_JDBC.makeConn();
        try {
            pstmt = conn.prepareStatement(SungJuk_JDBC.selectOneSungJuk);
            pstmt.setString(1, sjno);
            rs = pstmt.executeQuery();
            if (rs.next()) {
                sj = new SunkJuk_VO(rs.getInt(1),
                        rs.getString(2),
                        rs.getInt(3),
                        rs.getInt(4),
                        rs.getInt(5),
                        rs.getInt(6),
                        rs.getDouble(7),
                        rs.getString(8).charAt(0),
                        rs.getString(9) );
            }
        } catch (SQLException se) {
            System.out.println("selectOneSungJuk에서 오류발생!!");
            se.printStackTrace();
        }
        SungJuk_JDBC.destoryConn(conn,pstmt,rs);

        return sj;
    }

    // 수정할 성적데이터를 매개변수로 넘겨주면
    // sungjuk테이블에서 해당 데이터를 수정함
    @Override
    public String updateSungJuk(SunkJuk_VO sj) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        String result = "성적데이터 수정처리중...?!?";

        conn = SungJuk_JDBC.makeConn();
        try {
            pstmt = conn.prepareStatement(SungJuk_JDBC.updateSungJuk);
            pstmt.setInt(1, sj.getKor());
            pstmt.setInt(2, sj.getEng());
            pstmt.setInt(3, sj.getMat());
            pstmt.setInt(4, sj.getSum());
            pstmt.setDouble(5, sj.getMean());
            pstmt.setString(6, sj.getGrd()+"");
            pstmt.setInt(7, sj.getSjno());

            int cnt = pstmt.executeUpdate();
            if (cnt > 0) result = "성적데이터 수정완료!!";
        } catch (SQLException se) {
            System.out.println("updateSungJuk에서 오류발생!!");
            se.printStackTrace();
        }
        SungJuk_JDBC.destoryConn(conn, pstmt);

        return result;
    }

    // 삭제할 성적번호를 매개변수로 넘겨주면
    // sungjuk테이블에서 해당 데이터를 삭제함

    @Override
    public String deleteSungJuk(int sjno) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        String result = "성적데이터 삭제처리중...?!?";

        conn = SungJuk_JDBC.makeConn();
        try {
            pstmt = conn.prepareStatement(SungJuk_JDBC.deleteSungJuk);
            pstmt.setInt(1, sjno);

            int cnt = pstmt.executeUpdate();
            if (cnt > 0) result = "성적데이터 삭제완료!!";
        } catch (SQLException se) {
            System.out.println("deleteSungJuk에서 오류!!");
            se.printStackTrace();
        }
        SungJuk_JDBC.destoryConn(conn, pstmt);

        return result;
    }
}

