package _01_14_01_HelloSpring.App;
import _01_14_01_HelloSpring._interface._01_14_05_HelloSpring4Interface05;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/* 스프링 프레임 워크를 사용하는 두번째 사례
 *
 * 라이브러리
 * spring-beans (repo.spring.io)
 * spring-core
 * spring-context
 * spring-expression
 * commons-logging (commons.apache.org)
 *
 * 스프링 컨테이너
 * 스프링 프레임워크에서 제공하는 컨테이너는 2가지
 * BeanFactory
 * ApplicationContext
 */
public class _01_15_02_HelloSpring4App07 {
    public static void main(String[] args) {

        // 스프링 컨테이너의 관리를 받는 객체들이 정의된 설정파일 읽기
        ApplicationContext ctx =
                new FileSystemXmlApplicationContext("src/main/java/_01_14_01_HelloSpring/factory/_01_15_01_Bean06.xml");

        // 스프링 컨테이너를 통해 지정한 객체를 주입받음
        _01_14_05_HelloSpring4Interface05 bean = null;

        bean = (_01_14_05_HelloSpring4Interface05) ctx.getBean("Kor");
        bean.sayHello("스프링4");
        bean = (_01_14_05_HelloSpring4Interface05) ctx.getBean("Eng");
        bean.sayHello("Spring4");
        bean = (_01_14_05_HelloSpring4Interface05) ctx.getBean("Jpn");
        bean.sayHello("スプリング4");

    }
}
