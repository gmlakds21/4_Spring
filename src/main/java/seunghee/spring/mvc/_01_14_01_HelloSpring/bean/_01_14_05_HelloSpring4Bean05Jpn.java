package seunghee.spring.mvc._01_14_01_HelloSpring.bean;

import seunghee.spring.mvc._01_14_01_HelloSpring._interface._01_14_05_HelloSpring4Interface05;

public class _01_14_05_HelloSpring4Bean05Jpn implements _01_14_05_HelloSpring4Interface05 {

    @Override
    public void sayHello(String msg) {
        System.out.println("こんにちは, "+msg);
    }
}
