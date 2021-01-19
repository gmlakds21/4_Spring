package _01_19_02_Employee2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Scanner;

@Service("ser")
public class Employee_Service implements Employee_InterSer {

    @Autowired
    private Employee_InterDAO dao;

    @Override
    public void displayMenu() {

        StringBuilder sb = new StringBuilder();
        sb.append("----------------------\n")
                .append(" 1. 직원 데이터 입력\n")
                .append(" 2. 직원 데이터 조회\n")
                .append(" 3. 직원 데이터 상제 조회\n")
                .append(" 4. 직원 데이터 수정\n")
                .append(" 5. 직원 데이터 삭제\n")
                .append(" 0. 프로그램 종료\n")
                .append("----------------------\n")
                .append("원하시는 작업은 ? ");
        System.out.print(sb);
    }

    @Override
    public void readInfo() {
        Scanner sc = new Scanner(System.in);
        String result = "사원 정보 생성 실패";

        System.out.println("FIRST_NAME 를 입력해 주세요");
        String fname = sc.nextLine();
        System.out.println("LAST_NAME 를 입력해 주세요");
        String lname = sc.nextLine();
        System.out.println("EMAIL 를 입력해 주세요");
        String email = sc.nextLine();
        System.out.println("PHONE_NUMBER 를 입력해 주세요 (000-0000-0000)");
        String phone = sc.nextLine();
        System.out.println("HIRE_DATE 를 입력해 주세요 (0000-00-00)");
        String hdata = sc.nextLine();

        Employee_VO employee = new Employee_VO(fname, lname, email, phone, hdata);

        if(dao.insertEmp(employee)>0);
            result = "사원 정보 생성 성공";
        System.out.println(result);
    }

    @Override
    public void showInfo() {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        String fmt = "employee_id : %d, First_name : %s, last_name : %s, email : %s, phone_number : %s, hire_date : %s\n";

        List<Employee_VO> employees = dao.selectEmp();
        for ( Employee_VO employee : employees  ) {
            String result = String.format(fmt, employee.getEmpno(), employee.getFname(), employee.getLname(),
                    employee.getEmail(), employee.getPhone(), employee.getHdate());
            sb.append(result);
        }
        System.out.println(sb.toString());
    }

    @Override
    public void showAllInfo() {

        Scanner sc = new Scanner(System.in);
        System.out.println("검색하시려는 employee_id를 입력해 주세요 : ");
        String target = sc.nextLine();

        Employee_VO employee = dao.selectOneEmp( target );

        String fmt = "employee_id : %d, First_name : %s, last_name : %s, email : %s, phone_number : %s, hire_date : %s" +
                "job_id : %s, salay : %d, commission_pct : %.2f, manager_id : %d, department_id : %d\n";
        String result = String.format(fmt, employee.getEmpno(), employee.getFname(), employee.getLname(),
                employee.getEmail(), employee.getPhone(), employee.getHdate(), employee.getJobid(),
                employee.getSal(), employee.getComm(), employee.getMgrid(), employee.getDeptid());
        System.out.println(result);
    }

    @Override
    public void modifyInfo() {

        Scanner sc = new Scanner(System.in);
        String result = "사원 정보 수정 실패";
        Employee_VO employee = new Employee_VO();


        System.out.println("수정하시려는 employee_id를 입력해 주세요 : ");
        employee.setEmpno( sc.nextInt() );
        String blink = sc.nextLine();
        System.out.println("first_name 를 입력해 주세요");
        employee.setFname(sc.nextLine());
        System.out.println("last_name 를 입력해 주세요");
        employee.setLname(sc.nextLine());
        System.out.println("email 를 입력해 주세요");
        employee.setEmail(sc.nextLine());
        System.out.println("phone_number 를 입력해 주세요 (000-0000-0000)");
        employee.setPhone(sc.nextLine());

        if (dao.updateEmp( employee ) > 0 );
            result = "사원 정보 수정 성공";

        System.out.println(result);
    }

    @Override
    public void removeInfo() {
        Scanner sc = new Scanner(System.in);
        String result = "사원 정보 삭제 실패";

        System.out.println("삭제하시려는 employee_id를 입력해 주세요 : ");
        String target = sc.nextLine();

        if(dao.deleteEmp( target ) >0 )
            result = "사원 정보 삭제 성공";

        System.out.println(result);
    }
}