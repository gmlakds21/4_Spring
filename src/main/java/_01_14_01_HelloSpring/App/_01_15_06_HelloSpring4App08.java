package _01_14_01_HelloSpring.App;
import _01_14_01_HelloSpring._interface._01_15_06_HelloSpring4Interface06;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/* 스프링 프레임 워크를 사용하는 세번째 사례
 * 각 모듈간 의존성을 낮추기 위해 인터페이스를 기반으로 코드 작성
 * 스프링에 의해 객체를 주입받는 방법은
 * setter 를 이용하거나 생성자를 이용하는 것임
 *
 * IoC를 통해 객체를 주입받으려면
 * DI할 bean 객체를 IoC 컨테이너에 등록 -  xml bean 정의
 * 등록된 객체를 필요한 곳에 DI - autowiring
 * xml bean 정의 최소화
 * DI를 사용하려면 먼저 bean 정의파일에 <bean>으로 선언
 * 하지만, DI를 적용할 bean 의 갯수가 늘어나며
 * bean 정의파일에 작성할 태그도 늘어남 - 엄청 귀찮음
 * 1. autowiring : property 태그 생략 가능
 * 2. annotation1 : <context:annotation-config>를 사용하면
 *                  bean 태그도 간략화 가능
 * 3. annotation2 : <context:component-scan>를 사용하면
 *                  아예 bean 태그를 사용하지 않아도 됨
 *
 * 스프링 프레임워크에 어노테이션을 도입하게 된 계기
 * 구글의 '밥리' 라는 사람이 'xml 만으로 DI를 설정하는 스프링을 비난하고
 * annotation 기반의 초경량 DI 프레임워크를 만듬
 * 결국, 스프링 2.5부터 annotation 을 지원하기 시작함
 *
 * 스프링 프레임워크 핵심 annotation
 * @Resource    : 나중에
 * @Qualifier   : 나중에
 *
 * @Autowired   : DI 적용시 사용, 스프링 표준 (!)
 * @inject      : DI 적용시 사용, 자바 표준
 * @Component   : 외부 라이브러리 객체에 사용
 * @Service     : 주로 Service 객체에 사용 (!)
 * @Repository  : 주로 DAO 객체에 사용 (!)
 * @Controller  : 주로 MVC 객체에 사용 (!)
 *
 * 라이브러리
 * spring-beans (repo.spring.io)
 * spring-core
 * spring-context
 * spring-expression
 * spring-aop
 * commons-logging (commons.apache.org)
 */
class _01_15_06_HelloSpring4App08 {
    public static void main(String[] args) {

        // 스프링 컨테이너의 관리를 받는 객체들이 정의된 설정파일 읽기
        ApplicationContext ctx =
                new ClassPathXmlApplicationContext("_01_15_06_HelloSpring08.xml");

        // 스프링 컨테이너를 통해 지정한 객체를 주입받음
        _01_15_06_HelloSpring4Interface06 bean = null;

        bean = (_01_15_06_HelloSpring4Interface06) ctx.getBean("Kor");
        bean.sayHello("스프링4");
        bean = (_01_15_06_HelloSpring4Interface06) ctx.getBean("Eng");
        bean.sayHello("Spring4");
        bean = (_01_15_06_HelloSpring4Interface06) ctx.getBean("Jpn");
        bean.sayHello("スプリング4");

    }
}
