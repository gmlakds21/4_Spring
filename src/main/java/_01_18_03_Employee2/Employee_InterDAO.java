package _01_18_03_Employee2;

import java.util.ArrayList;

interface Employee_InterDAO {

    String insertEmp( Employee_VO employee);

    ArrayList<Employee_VO> selectEmp( );

    Employee_VO selectOneEmp (String target );

    String updateEmp ( Employee_VO employee );

    String deleteEmp( String target);
}
