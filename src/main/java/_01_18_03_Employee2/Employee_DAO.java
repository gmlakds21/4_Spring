package _01_18_03_Employee2;
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

        return result;
    }

    @Override
    public ArrayList<Employee_VO> selectEmp( ) {

        ArrayList<Employee_VO> employees = new ArrayList<>();

        return employees;
    }

    @Override
    public Employee_VO selectOneEmp (String target ) {


        Employee_VO employee = null;


        return employee;
    }

    @Override
    public String updateEmp ( Employee_VO employee ) {
        String result = "업데이트 실패";

        return result;
    }

    @Override
    public String deleteEmp( String target) {

        String result = "삭제 실패";


        return result;
    }
}
