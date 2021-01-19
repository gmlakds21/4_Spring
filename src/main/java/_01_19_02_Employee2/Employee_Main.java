package _01_19_02_Employee2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

public class Employee_Main {
    public static void main ( String [] args ) {

        Scanner sc = new Scanner(System.in);
        ApplicationContext ctx = new ClassPathXmlApplicationContext("01_19_02_Employee2.xml");
        Employee_InterSer ser = (Employee_Service)ctx.getBean("ser");


        String check = "";
        while ( !check.equals("0")) {
            ser.displayMenu();
            check = sc.nextLine();
            System.out.println();

            switch (check) {
                case "1" : ser.readInfo(); break;
                case "2" : ser.showInfo(); break;
                case "3" : ser.showAllInfo(); break;
                case "4" : ser.modifyInfo(); break;
                case "5" : ser.removeInfo(); break;
                case "0" : System.out.println("프로그램을 종료합니다."); break;
                default : System.out.println("번호를 다시 확인해주세요."); break;
            }
        }
    }
}