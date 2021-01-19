package _01_19_01_SungJuk2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

public class SungJuk_Main {
    public static void main(String[] args) {


        ApplicationContext ctx = new ClassPathXmlApplicationContext("01_19_01_SungJuk2.xml");
        SungJuk_InterSer sjsrv = (SungJuk_Service)ctx.getBean("sjsrv");

        Scanner sc = new Scanner(System.in);
        String menu = "";

        while(true) {
            ((SungJuk_Service)sjsrv).displayMenu();
            menu = sc.nextLine();

            switch(menu) {
                case "1": sjsrv.newSungJuk(); break;
                case "2": sjsrv.readSungJuk(); break;
                case "3": sjsrv.readOneSungJuk(); break;
                case "4": sjsrv.modifySungJuk(); break;
                case "5": sjsrv.removeSungJuk(); break;
                case "0": System.exit(0); break;
                default:
                    System.out.println("잘못입력!!");
            }
        }
    }
}
