package com.itwill01.method;

public class StudentMemberMethodMain {
	public static void main(String[] args) {
		/*
		학생객체생성(3명)
		*/
		Student student1 = new Student();
		Student student2 = new Student();
		Student student3 = new Student();
		/*
		 학생객체기본데이타(번호, 이름, 국어, 영어, 수학) 입력메쏘드호출(3명)
		 */
		student1.setBasicData(1, "홍길동", 100, 90, 80);
		student2.setBasicData(2, "고길동", 70, 90, 60);
		student3.setBasicData(3, "김길동", 80, 90, 80);
		
		/*
		 학생총점계산 메쏘드 호출(3명)
		 학생평균계산 메쏘드 호출(3명)
		 학생평점계산 메쏘드 호출(3명)
		 */
		//총점
		student1.calTotal();
		student2.calTotal();
		student3.calTotal();
		//평균
		student1.calAvg();
		student2.calAvg();
		student3.calAvg();
		//학생평점계산
		student1.calGrade();
		student2.calGrade();
		student3.calGrade();
		/*
		 * 학생데이타 출력메쏘드 호출(3명)
		 */
		student1.headerPrint();
		student1.print();
		student2.print();
		student3.print();
	}
}
