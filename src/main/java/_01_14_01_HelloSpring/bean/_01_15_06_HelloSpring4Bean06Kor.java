package _01_14_01_HelloSpring.bean;

import _01_14_01_HelloSpring._interface._01_15_06_HelloSpring4Interface06;

class _01_15_06_HelloSpring4Bean06Kor implements _01_15_06_HelloSpring4Interface06 {

    @Override
    public void sayHello(String msg) {
        System.out.println("안녕하세요, "+msg);
    }
}

