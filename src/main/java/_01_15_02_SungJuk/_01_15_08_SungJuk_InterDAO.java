package _01_15_02_SungJuk;

import java.util.ArrayList;

interface _01_15_08_SungJuk_InterDAO {

    String insertSungJuk(_01_15_08_SunkJuk_VO sj);

    ArrayList<_01_15_08_SunkJuk_VO> selectSungJuk();

    _01_15_08_SunkJuk_VO selectOneSungJuk(String sjno);

    String updateSungJuk(_01_15_08_SunkJuk_VO sj);

    String deleteSungJuk(int sjno);

}
