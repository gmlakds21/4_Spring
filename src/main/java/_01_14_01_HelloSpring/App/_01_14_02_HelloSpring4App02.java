package _01_14_01_HelloSpring.App;
import _01_14_01_HelloSpring.bean._01_14_02_HelloSpring4Bean02;
/* 두번째 사례
 * 외부 클래스를 통해 인삿말을 출력하는 기능 구현
 * 인삿말을 출력하려면 외부 클래스를 객체화한 뒤
 * sayHello 메서드 호출
 *
 * 한편, HelloSpring4App02 를 실핼하려면
 * HelloSpring4BEan02 라는 클래스가 있어야 함
 * 즉, 클래스간의 의존성이 생김
 * 의존성이 커짐으로서 발생하는 부수적인 단점은
 * 코드변경시 그것과 연관되는 다른 클래스에도 영향을 미침
 *
 * 헤결 :  인터페이스를 도입해서 객체간의 의존성을 낮춤
 */
public class _01_14_02_HelloSpring4App02 {
    public static void main(String[] args) {

        _01_14_02_HelloSpring4Bean02 bean2 = new _01_14_02_HelloSpring4Bean02();
        bean2.sayHello("World!!");

    }
}
