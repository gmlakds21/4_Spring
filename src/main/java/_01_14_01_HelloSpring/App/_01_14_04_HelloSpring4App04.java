package _01_14_01_HelloSpring.App;
import _01_14_01_HelloSpring._interface._01_14_04_HelloSpring4Interface04;
import _01_14_01_HelloSpring.bean._01_14_04_HelloSpring4Bean04Eng;
import _01_14_01_HelloSpring.bean._01_14_04_HelloSpring4Bean04Jpn;
import _01_14_01_HelloSpring.bean._01_14_04_HelloSpring4Bean04Kor;
/* 네번째 사례
 * 인삿말을 한국어, 영어, 일본어로 출력하도록 기능 개선
 * 인터페이스를 도입
 *
 * 확장성이 높고 유연한 코드를 작성할 수 있음
 * 또한, 객체간의 tightly coupled 도 피할 수 있음
 * 객체간의 의존성도 낮출 수 있음
 * tightly coupled 라면 한클래스당 한개의 객체를 각각 선언해야 한다.
 *
 * 하지만, new 연산자로 객체를 생성하는 코드가 노출
 * 다시말해, HelloSpring4Bean04 는
 * HelloSpring4Bean04Kor, HelloSpring4Bean04Eng, HelloSpring4Bean04Jpn 에
 * 의존적이라는 의미가 된다.
 *
 * 해결 : factory 패턴을 이용해서 객체생성을 전담하는
 *       클래스를 만들어 객체 생성과정을 캡슐화함
 */
public class _01_14_04_HelloSpring4App04 {
    public static void main(String[] args) {

        _01_14_04_HelloSpring4Interface04 bean04;

        bean04 = new _01_14_04_HelloSpring4Bean04Kor();
        bean04.sayHello("스프링4");

        bean04 = new _01_14_04_HelloSpring4Bean04Eng();
        bean04.sayHello("Spring4");

        bean04 = new _01_14_04_HelloSpring4Bean04Jpn();
        bean04.sayHello("スプリング\n4");

    }
}
