package _01_15_01_Product.App;

import _01_15_01_Product._interface._01_15_07_ProductInterSer04;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/* 상품 등록 프로그램 v3
 * ProductApp03 -> productService03 -> productDAO03
 *
 * Main 클래스에서 상품 등록기능을 실행하기 위해
 * 스프링 컨테이너가 만들어준 객체를 이용함
 * 빈 설정 대신 간단하게 어노테이션 DI를 함
 */
public class _01_15_07_ProductApp04 {
    public static void main(String[] args) {

        ApplicationContext ctx = new ClassPathXmlApplicationContext("_01_15_07_Product04.xml");

        _01_15_07_ProductInterSer04 ps = (_01_15_07_ProductInterSer04) ctx.getBean("ps04");

        ps.newProduct();


    }
}
