package _01_15_03_Employee;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

@Repository("dao")
public class Employee_DAO implements Employee_InterDAO {

    @Override
    public String insertEmp( Employee_VO employee) {

        String result = "직원 정보 입력 실패\n";
        Connection conn = Employee_JDBC.makeconn();
        PreparedStatement pstmt = null;

        try {
            pstmt = conn.prepareStatement(Employee_JDBC.insertEmp);
            pstmt.setString(1, employee.getFname());
            pstmt.setString(2, employee.getLname());
            pstmt.setString(3, employee.getEmail());
            pstmt.setString(4, employee.getPhone());
            pstmt.setString(5, employee.getHdata());
            int cnt = pstmt.executeUpdate();
            if ( cnt > 0 ) result = "직원 정보 입력 완료\n";
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        Employee_JDBC.desconn(conn, pstmt);
        return result;
    }

    @Override
    public ArrayList<Employee_VO> selectEmp( ) {

        ArrayList<Employee_VO> employees = new ArrayList<>();

        Connection conn = Employee_JDBC.makeconn();
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            pstmt = conn.prepareStatement(Employee_JDBC.selectEmp);
            rs = pstmt.executeQuery();

            while ( rs.next() ) {
                Employee_VO eployee = new Employee_VO(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6),
                        "", 0, 0, 0, 0);
                employees.add(eployee);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        Employee_JDBC.desconn(conn,pstmt,rs);
        return employees;
    }

    @Override
    public Employee_VO selectOneEmp (String target ) {

        Connection conn = Employee_JDBC.makeconn();
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        Employee_VO employee = null;

        try {
            pstmt = conn.prepareStatement(Employee_JDBC.selecetOneEmp);
            pstmt.setString(1,target);
            rs = pstmt.executeQuery();
            if ( rs.next() ) {
                employee = new Employee_VO(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getString(7),
                        rs.getInt(8),
                        rs.getDouble(9),
                        rs.getInt(10),
                        rs.getInt(11)
                );
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return employee;
    }

    @Override
    public String updateEmp ( Employee_VO employee ) {
        String result = "업데이트 실패";

        Connection conn = null;
        PreparedStatement pstmt = null;

        conn = Employee_JDBC.makeconn();
        try {
            pstmt = conn.prepareStatement(Employee_JDBC.updateEmp);
            pstmt.setString(1, employee.getFname());
            pstmt.setString(2, employee.getLname());
            pstmt.setString(3, employee.getEmail());
            pstmt.setString(4, employee.getPhone());
            pstmt.setInt(5, employee.getEmpno());
            int cnt = pstmt.executeUpdate();
            if ( cnt > 0 ) { result = "업데이트 성공"; }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        Employee_JDBC.desconn(conn, pstmt);

        return result;
    }

    @Override
    public String deleteEmp( String target) {

        String result = "삭제 실패";

        Connection conn = null;
        PreparedStatement pstmt = null;

        conn = Employee_JDBC.makeconn();
        try {
            pstmt = conn.prepareStatement(Employee_JDBC.deleteEmp);
            pstmt.setString(1, target);
            int cnt = pstmt.executeUpdate();
            if ( cnt > 0 ) { result = "삭제 성공"; }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        Employee_JDBC.desconn(conn, pstmt);

        return result;
    }
}
