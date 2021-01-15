package _01_15_01_Product.App;

import _01_15_01_Product.service._01_15_03_ProductService01;

/* 상품 등록 프로그램
 * ProductApp01 -> productService01 -> productDAO01
 * Main 클래스에서 상품 등록기능을 실행하기 위해
 * New 연산자를 이용해서 ProductService01의 객체를 만들고
 * 그 객체를 이용해서 newProduct()를 호출함
 *
 */
public class _01_15_03_ProductApp01 {
    public static void main(String[] args) {

        _01_15_03_ProductService01 ps = new _01_15_03_ProductService01();
        ps.newProduct();


    }
}
