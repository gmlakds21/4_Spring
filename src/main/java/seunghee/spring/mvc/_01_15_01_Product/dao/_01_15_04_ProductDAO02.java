package seunghee.spring.mvc._01_15_01_Product.dao;

import seunghee.spring.mvc._01_15_01_Product.vo._01_15_04_ProductVO02;
import seunghee.spring.mvc._01_15_01_Product._interface._01_15_04_ProductInterDAO02;

public class _01_15_04_ProductDAO02 implements _01_15_04_ProductInterDAO02 {

    @Override
    public void insertProduct(_01_15_04_ProductVO02 pvo) {

        System.out.printf("입력하신 %s제품이 성공적으로 저장되었습니다.\n", pvo.getPname());
    }
}