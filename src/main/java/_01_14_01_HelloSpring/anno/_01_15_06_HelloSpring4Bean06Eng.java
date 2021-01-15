package _01_14_01_HelloSpring.anno;

import _01_14_01_HelloSpring._interface._01_15_06_HelloSpring4Interface06;
import org.springframework.stereotype.Component;

@Component("Eng")
public class _01_15_06_HelloSpring4Bean06Eng implements _01_15_06_HelloSpring4Interface06 {

    @Override
    public void sayHello(String msg) {
        System.out.println("Hello, "+msg);
    }
}
