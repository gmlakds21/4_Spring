package _01_15_01_Product.dao;

import _01_15_01_Product.vo._01_15_03_ProductVO01;

public class _01_15_03_ProductDAO01 {
    public void insertProduct(_01_15_03_ProductVO01 pvo) {

        System.out.printf("입력하신 %s제품이 성공적으로 저장되었습니다.\n", pvo.getPname());
    }
}
