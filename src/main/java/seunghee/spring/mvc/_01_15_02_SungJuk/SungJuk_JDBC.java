package seunghee.spring.mvc._01_15_02_SungJuk;

public class SungJuk_JDBC extends SungJuk_Utill {

    public static String insertSungJuk =
            " insert into Sungjuk (name,kor,eng,mat, tot,mean,grd) " +
                    " values (?,?,?,?, ?,?,?)";

    public static String selectSungJuk =
            "select sjno,name,kor,eng,mat,regdate from Sungjuk order by sjno desc";

    public static String selectOneSungJuk =
            "select * from Sungjuk where sjno = ?";

    public static String updateSungJuk =
            " update Sungjuk " +
                    " set kor = ?,eng = ?,mat = ?,tot = ?,mean = ?,grd = ?, " +
                    " regdate = sysdate() where sjno = ? ";

    public static String deleteSungJuk =
            "delete from Sungjuk where sjno = ?";

}
