package _01_15_03_Employee;

import java.util.ArrayList;

interface _01_15_09_Employee_InterDAO {

    String insertEmp( _01_15_09_Employee_VO employee);

    ArrayList<_01_15_09_Employee_VO> selectEmp( );

    _01_15_09_Employee_VO selectOneEmp ( String target );

    String updateEmp ( _01_15_09_Employee_VO employee );

    String deleteEmp( String target);
}
