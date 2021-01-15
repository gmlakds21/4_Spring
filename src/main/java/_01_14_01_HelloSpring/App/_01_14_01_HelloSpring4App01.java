package _01_14_01_HelloSpring.App;
/* 첫번째 사례
 * 간단한 인삿말을 출력하는 프로그램 작성
 * 메세지를 출력하는 sayHello 메서드를 만들어 호출
 * 단, sayHello 메서드 호출시 먼저, class 에 해당하는 객체를 생성해야함
 *
 * 인삿말을 출력하는 메서드가 현재 클래스에 있기 때문에
 * 프로그램 확장성 측면에서 봤을 때 제약이 존재
 * 즉, 유지보수/업무분담의 어려움이 발생
 *
 * 해결 : 인삿말 출력기능을 담당하는 별도의 클래스 작성
 */
public class _01_14_01_HelloSpring4App01 {
    public static void main(String[] args) {



        _01_14_01_HelloSpring4App01 app = new _01_14_01_HelloSpring4App01();
        app.sayHello("World!!");
    }

    private void sayHello(String msg) {
        System.out.println("Hello, "+msg);
    }
}
