package _01_19_01_SungJuk2;

import java.util.List;

interface SungJuk_InterDAO {

    int insertSungJuk(SungJuk_VO sj);

    List<SungJuk_VO> selectSungJuk();

    SungJuk_VO selectOneSungJuk(String sjno);

    int updateSungJuk(SungJuk_VO sj);

    int deleteSungJuk(int sjno);

}
