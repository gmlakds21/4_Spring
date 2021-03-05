package seunghee.spring.mvc._01_15_01_Product.service;

import seunghee.spring.mvc._01_15_01_Product.dao._01_15_03_ProductDAO01;
import seunghee.spring.mvc._01_15_01_Product.vo._01_15_03_ProductVO01;

public class _01_15_03_ProductService01 {
    public void newProduct() {
        System.out.println("새로운 상품을 등록합니다.");

        _01_15_03_ProductVO01 pvo = new _01_15_03_ProductVO01();
        pvo.setPname("수지로션");
        pvo.setPrice(35000);

        /* 입력받은 상품 정보에 영속성을 부여하기 위해 DAO 호출
         * 마찬가지로 new 연산자로 해당 객체를 생성하고
         * insertProduct 메서드 호출함
         */
        _01_15_03_ProductDAO01 pdao = new _01_15_03_ProductDAO01();
        pdao.insertProduct(pvo);

        System.out.println("새로운 상품이 등록되었습니다!");
    }
}