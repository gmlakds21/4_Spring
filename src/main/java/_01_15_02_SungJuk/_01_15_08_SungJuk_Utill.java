package _01_15_02_SungJuk;

import java.sql.*;

public class _01_15_08_SungJuk_Utill {

    // JDBC 드라이버 초기화 및 Connection 객체 생성
    public static Connection makeConn() {
        String DRV = "org.mariadb.jdbc.Driver";
        String URL = "jdbc:mariadb://maria-db.coqecfviusin.ap-northeast-2.rds.amazonaws.com:3306/Sungjuk";
        String USR = "Sungjuk";
        String PWD = "Sungjuk2020";

        Connection conn = null;
        try {
            Class.forName(DRV);
            conn = DriverManager.getConnection(URL,USR,PWD);
        } catch (ClassNotFoundException e) {
            System.out.println("JDBC 드라이버가 없어요!");
        } catch (SQLException e) {
            System.out.println("JDBC 연결 실패!");
        }
        return conn;
    }

    // JDBC 관련 객체 해제
    public static void destoryConn(Connection conn, PreparedStatement pstmt) {
        if (pstmt != null) try {
            pstmt.close();
        } catch (SQLException ex) { }

        if (conn != null) try {
            conn.close();
        } catch (SQLException ex) { }
    }

    public static void destoryConn(Connection conn, PreparedStatement pstmt, ResultSet rs) {
        if (rs != null) try {
            rs.close();
        } catch (SQLException ex) { }

        destoryConn(conn, pstmt);
    }
}
