package seunghee.spring.mvc._01_15_01_Product.App;

import seunghee.spring.mvc._01_15_01_Product.service._01_15_04_ProductService02;

/* 상품 등록 프로그램 v2
 * ProductApp02 -> productService02 -> productDAO02
 * Main 클래스에서 상품 등록기능을 실행하기 위해
 * New 연산자를 이용해서 ProductService01의 객체를 만들고
 * 그 객체를 이용해서 newProduct()를 호출함
 *
 * 인터페이스 기반으로 코드 재작성
 *
 */
public class _01_15_04_ProductApp02 {
    public static void main(String[] args) {

        _01_15_04_ProductService02 ps = new _01_15_04_ProductService02();
        ps.newProduct();


    }
}
