package _01_18_02_SungJuk2;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("sjdao")
public class SungJuk_DAO implements SungJuk_InterDAO {

    @Autowired
    private SqlSession sqlSession;

    @Override
    public int insertSungJuk(SunkJuk_VO sj) {
        return sqlSession.insert("sungjuk2.insertSungJuk", sj);
    }

    @Override
    public List<SunkJuk_VO> selectSungJuk() {
        return sqlSession.selectList("sungjuk2.selectSungJuk");
    }

    @Override
    public SunkJuk_VO selectOneSungJuk(String sjno) {
        return sqlSession.selectOne("sungjuk2.selectOneSungJuk");
    }

    @Override
    public int updateSungJuk(SunkJuk_VO sj) {
        return sqlSession.update("sungjuk2.updateSungJuk");
    }

    @Override
    public int deleteSungJuk(int sjno) {
        return sqlSession.delete("sungjuk2.deleteSungJuk", sjno);
    }
}

