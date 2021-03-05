package seunghee.spring.mvc._01_14_01_HelloSpring.anno;

import seunghee.spring.mvc._01_14_01_HelloSpring._interface._01_15_06_HelloSpring4Interface06;
import org.springframework.stereotype.Component;

@Component("Jpn")
class _01_15_06_HelloSpring4Bean06Jpn implements _01_15_06_HelloSpring4Interface06 {

    @Override
    public void sayHello(String msg) {
        System.out.println("こんにちは, "+msg);
    }
}
