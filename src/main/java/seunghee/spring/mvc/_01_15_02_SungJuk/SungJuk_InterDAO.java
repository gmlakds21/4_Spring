package seunghee.spring.mvc._01_15_02_SungJuk;

import java.util.ArrayList;

interface SungJuk_InterDAO {

    String insertSungJuk(SunkJuk_VO sj);

    ArrayList<SunkJuk_VO> selectSungJuk();

    SunkJuk_VO selectOneSungJuk(String sjno);

    String updateSungJuk(SunkJuk_VO sj);

    String deleteSungJuk(int sjno);

}
