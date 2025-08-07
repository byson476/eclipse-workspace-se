package com.itwill02.constructor;

public class StudentConstructorMain {

	public static void main(String[] args) {
		/*
		 학생객체생성(3명)
		  - 1명은 기본생성자사용
		      학생객체기본데이타(번호, 이름, 국어, 영어, 수학) 입력메쏘드호출
		  - 2명은 인자5개 생성자사용
		 */
		Student student1 = new Student();
		student1.setNo(1);;
		student1.setName("나길동");
		student1.setKor(100);
		student1.setEng(90);
		student1.setMath(100);
		
		Student student2 = new Student(2, "고길동", 90, 80, 70);
		Student student3 = new Student(3, "막길동", 10, 80, 70);
		
		/*
		 학생총점계산 메쏘드 호출(3명)
		 학생평균계산 메쏘드 호출(3명)
		 학생평점계산 메쏘드 호출(3명)
		 */
		student1.calculateTotal();
		student2.calculateTotal();
		student3.calculateTotal();
		student1.calculateAvg();
		student2.calculateAvg();
		student3.calculateAvg();
		student1.calculateGrade();
		student2.calculateGrade();
		student3.calculateGrade();
		
		/*
		 * 학생데이타 출력메쏘드 호출(3명)
		 */
		Student.headerPrint();
		student1.print();
		student2.print();
		student3.print();
		
		/*
		 * 학생 student1 의 이름변경메쏘드호출후 student1학생객체출력
		 * 학생 student1 의 총점데이타 반환받은후 메인블록에서출력
		 * 학생 student1 의 학점데이타 반환받은후 메인블록에서출력
		 */
		student1.setName("홍길동");
		Student.headerPrint();
		student1.print();
		
		int tempTot = student1.getTot();
		char tempGrade = student1.getGrade();
		System.out.println("총점 : " + tempTot);
		System.out.println("학점 : " + tempGrade);
	}

}
