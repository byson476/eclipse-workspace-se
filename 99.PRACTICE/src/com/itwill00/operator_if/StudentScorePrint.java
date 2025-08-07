package com.itwill00.operator_if;

public class StudentScorePrint {

	public static void main(String[] args) {
		/*
		 * 성적관리에서 학생2명 데이타를 담을 변수선언
		 * 	- 번호, 이름, 국어, 영어, 수학, 총점, 평균, 평점(A(90~100),B(80~89),C(70~79),D(60~69),F(0~59)), 석차
		 */
		int no1;
		String name1;
		int kor1;
		int eng1;
		int math1;
		int tot1;
		double avg1;
		char charGrade1;
		int grade1;
		
		int no2;
		String name2;
		int kor2;
		int eng2;
		int math2;
		int tot2;
		double avg2;
		char charGrade2;
		int grade2;
		
		/*
		 * 학생 2명의 기본데이터(번호, 이름, 국어, 영어, 수학) 입력 
		 */
		no1  = 1;
		name1 = "김경호";
		kor1 = 42;
		eng1 = 56;
		math1 = 78;
		tot1 = 0;
		avg1 = 0;
		charGrade1 = 'F';
		grade1 = 0;
		
		no2 = 2;
		name2 = "김경수";
		kor2 = 45;
		eng2 = 53;
		math2 = 76;
		tot2 = 0;
		avg2 = 0;
		charGrade2 = 'F';
		grade2 = 0;
		/*
		 * 학생2명의 국어, 영어, 수학점수의 유효성체크
		 *   - 100점이 넘는 수나 음수가 입력되면 메세지를 출력하고 return(프로그램종료)한다.
		 */
		if (kor1 < 0 || kor1 > 100) {
			System.out.printf("%d는 유효한 점수가 아닙니다\n", kor1);
			return; 
		}
		if (eng1 < 0 || eng1 > 100) {
			System.out.printf("%d는 유효한 점수가 아닙니다\n", eng1);
			return; 
		}
		if (math1 < 0 || math1 > 100) {
			System.out.printf("%d는 유효한 점수가 아닙니다\n", math1);
			return; 
		}
		if (kor2 < 0 || kor2 > 100) {
			System.out.printf("%d는 유효한 점수가 아닙니다\n", kor2);
			return; 
		}
		if (eng2 < 0 || eng2 > 100) {
			System.out.printf("%d는 유효한 점수가 아닙니다\n", eng2);
			return; 
		}
		if (math2 < 0 || math2 > 100) {
			System.out.printf("%d는 유효한 점수가 아닙니다\n", math2);
			return; 
		}
		/*
		 * 학생 2명의 기본데이터(번호, 이름, 국어, 영어, 수학)를 이용해서
		 * 총점, 평균, 평점, 계산 후 대입 (석차는 0을 대입)
		 */
		tot1 = kor1 + eng1 + math1;
		avg1 = tot1 / 3.0;
		if (avg1 >= 90)
			charGrade1 = 'A';
		else if (avg1 >= 80)
			charGrade1 = 'B';
		else if (avg1 >= 70)
			charGrade1 = 'C';
		else if (avg1 >= 60)
			charGrade1 = 'D';
		else
			charGrade1 = 'F';
		
		tot2 = kor2 + eng2 + math2;
		avg2 = tot2 / 3.0;
		if (avg2 >= 90)
			charGrade2 = 'A';
		else if (avg2 >= 80)
			charGrade2 = 'B';
		else if (avg2 >= 70)
			charGrade2 = 'C';
		else if (avg2 >= 60)
			charGrade2 = 'D';
		else
			charGrade2 = 'F';
		
		if(avg1>avg2)
		{
			grade1 = 1;
			grade2 = 2;
		}
		else {
			grade1 = 2;
			grade2 = 1;
		}
			
		/*
		- 출력포맷
 		- 평균은 소수점이하 첫째자리까지출력(반올림)
 		- 석차는 구하지마세요
		--------------학생 성적출력-------------------
		학번  이름   국어 영어 수학 총점 평균 평점 석차
		-----------------------------------------------
		 1   김경호   42   56   78   334  34.8  A   3  
		 2   김경수   45   53   76   334  34.8  A   2  
		-----------------------------------------------
		*/	
		System.out.printf("--------------학생 성적출력-------------------\n");
		System.out.printf("학번  이름   국어 영어 수학 총점 평균 평점 석차\n");
		System.out.printf("-----------------------------------------------\n");
		System.out.printf("%2d  %5s %3d %4d %4d %4d %5.1f %2c %5d \n", no1, name1, kor1, eng1, math1, tot1, avg1, charGrade1, grade1);
		System.out.printf("%2d  %5s %3d %4d %4d %4d %5.1f %2c %5d \n", no2, name2, kor2, eng2, math2, tot2, avg2, charGrade2, grade2);
		System.out.printf("-----------------------------------------------\n");
		
	}

}
