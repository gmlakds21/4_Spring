package seunghee.spring.mvc._01_15_02_SungJuk;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

public class SungJuk_Main {

    public static void main(String[] args) {

        // _01_15_08_SunkJukInterService sjsrv = new _01_15_08_SunkJukInterService();

        ApplicationContext ctx = new ClassPathXmlApplicationContext("01_15_08_SungJuk.xml");
        SunkJuk_InterSer sjsrv = (SunkJuk_Service)ctx.getBean("sjsrv");

        Scanner sc = new Scanner(System.in);
        String menu = "";

        while(true) { // 메뉴 띄우고 작업번호 입력을 반복
            ((SunkJuk_Service)sjsrv).displayMenu();
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
