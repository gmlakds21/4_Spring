package _01_15_01_Product.App;

import _01_15_01_Product.service._01_15_05_ProductService03;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/* 상품 등록 프로그램 v3
 * ProductApp03 -> productService03 -> productDAO03
 *
 * Main 클래스에서 상품 등록기능을 실행하기 위해
 * 스프링 컨테이너가 만들어준 객체를 이용함
 * 이때 setter 메서드를 이용해서 객체를 주입 받음
 *
 * bean 설정파일에는 property 라는 태그에 정의해 둠
 * ProductDAO03 pd03 = new ProductDAO03();
 * ps.setPd03(pdo3);
 * ProductDAO03 에 대한 객체를 사용하려면
 * new 연산자로 해당 객체를 생성해야 하는데
 * 이러한 작업을 스프링 컨테이너에 의해 대신 처리함
 * 단, bean.xml 에 이러한 내뇽이 미리 선언되어 있어야 함.
 *
 * resources 폴더에 넣어둔다면, 경로를 다 설정하지 않고
 * 파일명만 입력하는 방식으로 호출 할 수 있다.
 */
public class _01_15_05_ProductApp03 {
    public static void main(String[] args) {

        ApplicationContext ctx = new ClassPathXmlApplicationContext("_01_15_05_product.xml");

        _01_15_05_ProductService03 ps = (_01_15_05_ProductService03) ctx.getBean("ps03");

        ps.newProduct();


    }
}
