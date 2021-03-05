package seunghee.spring.mvc._01_15_03_Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;
/* 인사 관리 프로그램 v3
 * -------------------
 * 1. 인사 정보 입력
 * 2. 인사 정보 조회      (사번, 성, 이메일, 직책, 상사번호, 부서번호)
 * 3. 인사 정보 상세조회  (사번조회 -> 전부 다)
 * 4. 인사 정보 수정
 * 5. 인사 정보 삭제
 * 0. 프로그램 종료
 */
public class Employee_Main {
    public static void main ( String [] args ) {

        Scanner sc = new Scanner(System.in);
        //_01_15_09_Employee_Service ser = new _01_15_09_Employee_Service();
        ApplicationContext ctx = new ClassPathXmlApplicationContext("01_15_09_Employee.xml");
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