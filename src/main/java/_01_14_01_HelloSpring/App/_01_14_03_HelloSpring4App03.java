package _01_14_01_HelloSpring.App;
import _01_14_01_HelloSpring.bean._01_14_03_HelloSpring4Bean03;
/* 세번째 사례
 * 인삿말을 한국어, 영어, 일본어로 출력하도록 기능 개선
 * 해당 기능을 제각각의 이름으로 호출하는 경우
 * 지나치게 복잡해지고 기능에 따라 이름을 일일이
 * 외워야 하는 불편함이 존재함
 *
 * 인터페이스를 도입해서 기능을 개선해 봄
 */
public class _01_14_03_HelloSpring4App03 {
    public static void main(String[] args) {

        _01_14_03_HelloSpring4Bean03 bean03 = new _01_14_03_HelloSpring4Bean03();
        bean03.sayHelloKor("스프링4");
        bean03.sayHelloEng("Spring4");
        bean03.sayHelloJpn("スプリング4");
    }
}
