package seunghee.spring.mvc._01_15_03_Employee;

import java.util.ArrayList;

interface Employee_InterDAO {

    String insertEmp( Employee_VO employee);

    ArrayList<Employee_VO> selectEmp( );

    Employee_VO selectOneEmp (String target );

    String updateEmp ( Employee_VO employee );

    String deleteEmp( String target);
}
