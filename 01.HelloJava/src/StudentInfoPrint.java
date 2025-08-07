
public class StudentInfoPrint {

	public static void main(String[] args) {
		/*
		 * 1.변수선언
		 */
		int    studentNo1;
		String name1;
		int    korean1;
		int    eng1;
		int    math1;
		int    total1;
		double average1;
		char   level1;
		char   grade1;
		
		int    studentNo2;
		String name2;
		int    korean2;
		int    eng2;
		int    math2;
		int    total2;
		double average2;
		char   level2;
		char   grade2;
		/*
		 * 2.변수에 데이타(리터럴)대입
		 */
		studentNo1  = 1;
		name1   = "김경호";
		korean1 = 42;
		eng1    = 56;
		math1   = 78;
		total1  = 334;
		average1=34.8;
		level1  = 'A';
		grade1  = '3';
		
		studentNo2  = 2;
		name2   = "김경수";
		korean2 = 45;
		eng2    = 53;
		math2   = 76;
		total2  = 334;
		average2= 34.8;
		level2  = 'A';
		grade2  = '2';
		
		/*
		 * 3.변수 데이타 출력
		 */
		
		System.out.println("------------------학생성적출력-----------------");
		System.out.println("학번  이름   국어 영어 수학 총점 평균 평점 석차");
		System.out.println("-----------------------------------------------");   
		System.out.println(studentNo1 + "     " + name1 + "  " + korean1 + "   " +   eng1 + "   " + math1 + "  " + total1 + "  " + average1 + "  " + level1 + "    " + grade1);
		System.out.println(studentNo2 + "     " + name2 + "  " + korean2 + "   " +   eng2 + "   " + math2 + "  " + total2 + "  " + average2 + "  " + level2 + "    " + grade2);
		System.out.println("-----------------------------------------------");
	}

}
