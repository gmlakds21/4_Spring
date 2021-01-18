package _01_18_02_SungJuk2;

import java.util.List;

interface SungJuk_InterDAO {

    int insertSungJuk(SunkJuk_VO sj);

    List<SunkJuk_VO> selectSungJuk();

    SunkJuk_VO selectOneSungJuk(String sjno);

    int updateSungJuk(SunkJuk_VO sj);

    int deleteSungJuk(int sjno);

}
