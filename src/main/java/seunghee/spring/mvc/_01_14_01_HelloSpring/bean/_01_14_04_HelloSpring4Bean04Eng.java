package seunghee.spring.mvc._01_14_01_HelloSpring.bean;

import seunghee.spring.mvc._01_14_01_HelloSpring._interface._01_14_04_HelloSpring4Interface04;

public class _01_14_04_HelloSpring4Bean04Eng implements _01_14_04_HelloSpring4Interface04 {

    @Override
    public void sayHello(String msg) {
        System.out.println("Hello, "+msg);
    }
}
