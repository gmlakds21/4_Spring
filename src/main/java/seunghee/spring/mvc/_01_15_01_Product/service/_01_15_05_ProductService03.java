package seunghee.spring.mvc._01_15_01_Product.service;

import seunghee.spring.mvc._01_15_01_Product.dao._01_15_05_ProductDAO03;
import seunghee.spring.mvc._01_15_01_Product.vo._01_15_05_ProductVO03;
import seunghee.spring.mvc._01_15_01_Product._interface._01_15_04_ProductInterSer02;

public class _01_15_05_ProductService03 implements _01_15_04_ProductInterSer02 {

    private _01_15_05_ProductDAO03 pd03;

    public void setPd03(_01_15_05_ProductDAO03 pd03) {
        this.pd03 = pd03;
    }

    public void newProduct() {
        System.out.println("새로운 상품을 등록합니다.");

        _01_15_05_ProductVO03 pvo = new _01_15_05_ProductVO03();
        pvo.setPname("수지로션");
        pvo.setPrice(35000);

        /* 입력받은 상품 정보에 영속성을 부여하기 위해 DAO 호출
         * 마찬가지로 new 연산자로 해당 객체를 생성하고
         * insertProduct 메서드 호출함
         * _01_15_05_ProductDAO03 pd03 = new _01_15_05_ProductDAO03();
         */
        pd03.insertProduct(pvo);

        System.out.println("새로운 상품이 등록되었습니다!");
    }
}