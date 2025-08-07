package com.itwill00.variable;
public class DuoMemberInfoPrint{
	public static void main(String[] args) {
		/*
		 * 1.변수선언
		 */
		int     memberNo;
		String  name;
		String  regNo;
		char    gender;
		int     marrageCnt;
		boolean isSmoke;
		double  height;
		char    grade;
		char    apperance;
		
		/*
		 * 2.변수에 데이타(리터럴)대입
		 */
		memberNo   = 236514;
		name       = "홍길동";
		regNo      = "201212-3495039";
		gender     = '남';
		marrageCnt = 0;
		isSmoke    = true;
		height     = 178.3;
		grade      = 'A';
		apperance  = '상';
		
		/*
		 * 3.변수 데이타 출력
		 */
		System.out.println("*************************");
		System.out.println("회원번호 : " + memberNo);
		System.out.println("이    름 : " + name);
		System.out.println("주민번호 : " + regNo);
		System.out.println("성    별 : " + gender);
		System.out.println("결혼횟수 : " + marrageCnt);
		System.out.println("흡연여부 : " + isSmoke);
		System.out.println("키       : " + height);
		System.out.println("학    점 : " + grade);
		System.out.println("용    모 : " + apperance);
		System.out.println("*************************");
		
	}
}
