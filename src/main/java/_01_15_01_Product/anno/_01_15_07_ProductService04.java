package _01_15_01_Product.anno;

import _01_15_01_Product._interface._01_15_07_ProductInterDAO04;
import _01_15_01_Product._interface._01_15_07_ProductInterSer04;
import _01_15_01_Product.vo._01_15_07_ProductVO04;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("ps04")
public class _01_15_07_ProductService04 implements _01_15_07_ProductInterSer04 {

    @Autowired
    private _01_15_07_ProductInterDAO04 pd04;
    /*
     * 이전 예제에서는 setter 메서드를 통해 DI 되었음
     * 지금은 annotation 을 선언해서 setter 메서드 정의 없이
     * DI 받음
     *
     *  public void setPd04(_01_15_07_ProductDAO04 pd04) {
     *      this.pd04 = pd04;
     *  }
     */


    public void newProduct() {
        System.out.println("새로운 상품을 등록합니다.");

        _01_15_07_ProductVO04 pvo = new _01_15_07_ProductVO04();
        pvo.setPname("수지로션");
        pvo.setPrice(35000);

        /* 입력받은 상품 정보에 영속성을 부여하기 위해 DAO 호출
         * 마찬가지로 new 연산자로 해당 객체를 생성하고
         * insertProduct 메서드 호출함
         * _01_15_05_ProductDAO03 pd03 = new _01_15_05_ProductDAO03();
         */
        pd04.insertProduct(pvo);

        System.out.println("새로운 상품이 등록되었습니다!");
    }


}
