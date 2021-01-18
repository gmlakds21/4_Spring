package _01_18_01_Members.App;

import _01_18_01_Members.service.MemberService03;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/* mybatis 를 이용한 프로젝트
 * spring JDBC API 를 좀 더 편하게 사용하기 위해
 * 개발된 퍼시스턴스 계층 프레임워크
 * 자바 객체와 SQL 문 사이의 자동 Mapping 기능을 지원
 *
 * 코드 생산성 증대 : JDBC 관련 코드를 60% 정도 줄여줌
 * hibernate 나 JPA 보다 익히기 쉬움 (러닝 커브 낮음)
 *
 * mybatis 주요 컴퍼넌트
 * sqlMapConfig.xml         : 디비 접속정보등 환경설정 파일
 * SqlSessionFactoryBuilder : 설정파일을 통해 myBatis 객체 생성
 * SqlSessionFactory        : SqlSession 객체 생성
 * SqlSession               : SQL 실행 또는 트랜잭션 관리 명령 실행
 * Mapping 파일              : SQL 문과 OR Mapping 설정
 *
 * myBatis.org 사이트 들어감
 * https://mybatis.org/mybatis-3/ko/configuration.html
 * <!DOCTYPE mapper
    PUBLIC "-//mybatis.org//DTD Mapper 3.0//EN"
    "http://mybatis.org/dtd/mybatis-3-mapper.dtd">
 * 이걸 복사해서 xml 파일을 새로 만들어서 붙임
 *
 *
 * 회원정보를 다루는 프로그램 : CRUD
 * App01 -> MemberService -> MemberDAO
 *                      MemberVO
 */
public class MemberApp03 {
    public static void main(String[] args) {

        ApplicationContext ctx = new ClassPathXmlApplicationContext("01_18_03_member3.xml");

        MemberService03 msrv03 = (MemberService03) ctx.getBean("msrv03");

        System.out.println(msrv03.removeMember());

        // 회원정보 생성
        System.out.println(msrv03.newMember());

        // 회원정보 조회 (아아디, 등급, 가입일)
        System.out.println(msrv03.readMember());

        // 회원정보 상세 조회 ( * )
        System.out.println(msrv03.readOneMember());

        // 회원정보 수정
        System.out.println(msrv03.modifyMember());

        // 회원정보 삭제
        System.out.println(msrv03.removeMember());

    }
}