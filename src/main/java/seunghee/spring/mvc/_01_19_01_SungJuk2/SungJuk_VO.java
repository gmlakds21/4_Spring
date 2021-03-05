package seunghee.spring.mvc._01_19_01_SungJuk2;

public class SungJuk_VO {

    private int sjno;
    private String name;
    private int kor;
    private int eng;
    private int mat;
    private int tot;
    private double mean;
    private char grd;
    private String regdate;


    public SungJuk_VO() {
    }

    public SungJuk_VO(
            String name, int kor, int eng, int mat,
            int tot, double mean, char grd) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.mat = mat;
        this.tot = tot;
        this.mean = mean;
        this.grd = grd;
    }

    public SungJuk_VO(int sjno, String name, int kor, int eng, int mat,
                      int tot, double mean, char grd, String regdate) {
        this.sjno = sjno;
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.mat = mat;
        this.tot = tot;
        this.mean = mean;
        this.grd = grd;
        this.regdate = regdate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getKor() {
        return kor;
    }

    public void setKor(int kor) {
        this.kor = kor;
    }

    public int getEng() {
        return eng;
    }

    public void setEng(int eng) {
        this.eng = eng;
    }

    public int getMat() {
        return mat;
    }

    public void setMat(int mat) {
        this.mat = mat;
    }

    public int getSum() {
        return tot;
    }

    public void setSum(int sum) {
        this.tot = tot;
    }

    public double getMean() {
        return mean;
    }

    public void setMean(double mean) {
        this.mean = mean;
    }

    public char getGrd() {
        return grd;
    }

    public void setGrd(char grd) {
        this.grd = grd;
    }

    public int getSjno() {
        return sjno;
    }

    public void setSjno(int sjno) {
        this.sjno = sjno;
    }

    public String getRegdate() {
        return regdate;
    }

    public void setRegdate(String regdate) {
        this.regdate = regdate;
    }
}