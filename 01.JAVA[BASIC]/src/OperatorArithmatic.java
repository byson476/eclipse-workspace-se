
public class OperatorArithmatic {

	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		int result = 0;
 
		result = a + b;
		System.out.println(result);
		
		result = a - b;
		System.out.println(result);
		
		result = a * b;
		System.out.println(result);
		
		result = a / b;
		System.out.println(result);
		double dReuslt  = a / b;
		System.out.println("dReuslt : " + dReuslt);
		//0.5가 나오게 하려면
		dReuslt  = (double)a / b;
		System.out.println("dReuslt : " + dReuslt);
		
		//나머지 연산자
		int number = 13;
		result = number % 4;
		System.out.println(result);
		
		/*
		 * 윤년계산
		 * 연도가 4로 나누어 떨어지면서 
		 * 100으로 나누어 떨어지지 않거나, 400으로 나누어 떨어지면 윤년
		 */
		int year = 2025;
		result = year%4;
		System.out.println(result);

		result = year%100;
		System.out.println(result);
		

		result = year%400;
		System.out.println(result);

		int no = 34;
		result = no%2;
		System.out.println(result);	
		
		//문자 연산
		char ca = 'A';
		char cz = 'Z';
		int numOfAlphabet = cz - ca + 1; //알팝[ㅅ 대문지수
		System.out.println(numOfAlphabet);
		
		int numOfHangul = '힣' - '가' + 1;
		System.out.println(numOfHangul);
		
		char cb = 'A' +1;
		System.out.println(cb);
		
		int kor, eng, math;
		kor = 89;
		eng = 90;
		math = 96;
		int tot = kor + eng + math;
		double avg = tot /3.0;  //%10.2f->소수점 포함해서 10자리 소수점 아래 2자리
		System.out.printf("%2d %-8s %d %d %d %d %6.2f \n", 1,"홍길동", kor, eng, math, tot, avg);
		System.out.printf("%2d %-8s %d %d %d %d %6.2f \n", 10,"홍길동", kor, eng, math, tot, avg);
		
	}

}
