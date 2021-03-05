package seunghee.spring.mvc._01_19_02_Employee2;

import java.util.List;

interface Employee_InterDAO {

    int insertEmp(Employee_VO employee);

    List<Employee_VO> selectEmp( );

    Employee_VO selectOneEmp (String target );

    int updateEmp (Employee_VO employee );

    int deleteEmp(String target);
}
