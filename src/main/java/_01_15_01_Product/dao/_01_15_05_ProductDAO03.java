package _01_15_01_Product.dao;

import _01_15_01_Product.vo._01_15_05_ProductVO03;
import _01_15_01_Product._interface._01_15_05_ProductInterDAO03;

public class _01_15_05_ProductDAO03 implements _01_15_05_ProductInterDAO03 {

    @Override
    public void insertProduct(_01_15_05_ProductVO03 pvo) {

        System.out.printf("입력하신 %s제품이 성공적으로 저장되었습니다.\n", pvo.getPname());
    }

}
