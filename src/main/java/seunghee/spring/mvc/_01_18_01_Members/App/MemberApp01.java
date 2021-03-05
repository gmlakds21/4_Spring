package seunghee.spring.mvc._01_18_01_Members.App;

import seunghee.spring.mvc._01_18_01_Members.service.MemberService01;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/* 스프링4 data 를 이용한 프로젝트
 * 기존 JDBC API 이용시 문제점
 * JDBC 는 데이터베이스에 접근하기 위한 자바 표준 API
 *
 * 하지만, JDBC 표준 API 를 사용하면서 발생하는 문제가 있다.
 * 1. Connection/PreparedStatement/ResultSet 객체관리
 * 2. 복잡한 예외/SQLException 처리문제 = 원인 파악 모호
 * 3. DriverManager/JNDI 를 이용한 Connection 객체 취득 문제
 *
 * 하지만, 스프링 프레임 워크의 JDBC 기능을 이용하면
 * 위의 문제는 대부분이 해결된다.
 *
 * persistence API
 * JDBC         : 자바 표준 API
 * Hibernate    : ORM 기반 persistence API
 * JPA          : J2EE 표준 API, hibernate 를 기반으로 제작
 * myBatis      : SQL Mapping 기반 persistence API
 *
 * 필요 라이브러리
 * spring-jdbc
 *
 * 회원정보를 다루는 프로그램 : CRUD
 * App01 -> MemberService -> MemberDAO
 *                      MemberVO
 */
public class MemberApp01 {
    public static void main(String[] args) {

        ApplicationContext ctx = new ClassPathXmlApplicationContext("01_18_01_member1.xml");

        MemberService01 msrv01 = (MemberService01) ctx.getBean("msrv01");

        // 회원정보 생성
        System.out.println(msrv01.newMember());

        // 회원정보 조회 (아아디, 등급, 가입일)
        System.out.println(msrv01.readMember());

        // 회원정보 상세 조회 ( * )
        System.out.println(msrv01.readOneMember());

        // 회원정보 수정
        System.out.println(msrv01.modifyMember());

        // 회원정보 삭제
        System.out.println(msrv01.removeMember());

    }
}