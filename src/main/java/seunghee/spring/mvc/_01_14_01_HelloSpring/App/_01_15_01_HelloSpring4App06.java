package seunghee.spring.mvc._01_14_01_HelloSpring.App;
import seunghee.spring.mvc._01_14_01_HelloSpring._interface._01_14_05_HelloSpring4Interface05;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

/* 스프링 프레임 워크
 * DI, IoC, AOP 를 적용한 콘솔/GUI/웹 응용 프로그램 개발에
 * 사용하는 오픈소스 프레임 워크
 * 복잡한 절차를 요구하고 비용이 많이 드는 EJB 에 비해
 * 사용이 간단하고, 무료 서블릿 컨테이너에도 무난히 실행됨
 *
 * 스프링 프레임워크를 이용한 개발의 필수요건은
 * 인터페이스 기반 설계임!
 *
 * Maven 을 사용하지 않으면 각 홈페이지에 가서 다운로드 하고 라이브러리에 추가해야 함
 * 라이브러리
 * spring-beans (repo.spring.io)
 * spring-core
 * commons-logging (commons.apache.org)
 *
 * 실행 원리
 * 예제에서 보듯 객체 생성시 new 연산자를 사용하지 않고
 * 스프링이 대신 객체를 생성하고 프로그램에서는 DI를 통해 사용함
 *
 * 1. .xml 에 스프링 컨테이너가 미리 생성해둬야 할 객체와 이름을 정의해 둠
 * 2. 프로그램이 시작되면 .xml 에 작성한 객체정보를 스프링 컨테이너가 읽어서 객체를 만들어 둠
 * 3. Factory 에서 getBean 메서드로 해당 객체를 가져와 Interface 타입의 변수에 주입함
 * 4. 주입된 변수를 통해 sayHello 메서드를 호출하면 인삿말이 출력됨
 *
 * 스프링 컨테이너
 * 스프링 프레임워크에서 제공하는 컨테이너는 2가지
 * BeanFactory
 * ApplicationContext
 */
public class _01_15_01_HelloSpring4App06 {
    public static void main(String[] args) {

        // 스프링 컨테이너의 관리를 받는 객체들이 정의된 설정파일 읽기
        BeanFactory bf = new XmlBeanFactory(
                new FileSystemResource("src/main/java/seunghee/spring/mvc/_01_14_01_HelloSpring/factory/_01_15_01_Bean06.xml"));

        // 스프링 컨테이너를 통해 지정한 객체를 주입받음
        _01_14_05_HelloSpring4Interface05 bean = null;

        bean = (_01_14_05_HelloSpring4Interface05) bf.getBean("Kor");
        bean.sayHello("스프링4");
        bean = (_01_14_05_HelloSpring4Interface05) bf.getBean("Eng");
        bean.sayHello("Spring4");
        bean = (_01_14_05_HelloSpring4Interface05) bf.getBean("Jpn");
        bean.sayHello("スプリング4");

    }
}
