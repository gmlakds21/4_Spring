package _01_19_02_Employee2;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("dao")
public class Employee_DAO implements Employee_InterDAO {

    @Autowired
    private SqlSession sqlSession;

    @Override
    public int insertEmp(Employee_VO employee) {
        return sqlSession.insert("Employee2.insertEmp", employee);
    }

    @Override
    public List<Employee_VO> selectEmp( ) {
        return sqlSession.selectList("Employee2.selectEmp");
    }

    @Override
    public Employee_VO selectOneEmp (String target ) {
        return sqlSession.selectOne("Employee2.selectOneEmp", target);
    }

    @Override
    public int updateEmp (Employee_VO employee ) {
        return sqlSession.update("Employee2.updateEmp", employee);
    }

    @Override
    public int deleteEmp(String target) {
        return sqlSession.update("Employee2.deleteEmp", target);
    }
}
