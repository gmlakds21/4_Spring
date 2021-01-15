package _01_15_01_Product.dao;

import _01_15_01_Product._interface._01_15_07_ProductInterDAO04;
import _01_15_01_Product.vo._01_15_07_ProductVO04;

public class _01_15_07_ProductDAO04 implements _01_15_07_ProductInterDAO04 {

    @Override
    public void insertProduct(_01_15_07_ProductVO04 pvo) {

        System.out.printf("입력하신 %s제품이 성공적으로 저장되었습니다.\n", pvo.getPname());
    }

}
