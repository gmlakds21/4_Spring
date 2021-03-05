package seunghee.spring.mvc._01_18_01_Members.App;

import seunghee.spring.mvc._01_18_01_Members.service.MemberService01;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/* 스프링4 data 를 이용한 프로젝트
 * database connection pool 을 이용함
 * 단순 xml 연결 방식의 차이
 *
 * 회원정보를 다루는 프로그램 : CRUD
 * App01 -> MemberService -> MemberDAO
 *                      MemberVO
 */
public class MemberApp02 {
    public static void main(String[] args) {

        ApplicationContext ctx = new ClassPathXmlApplicationContext("01_18_02_member2.xml");

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