
public class OperatorLogical {

	public static void main(String[] args) {
		boolean b1, b2, b3, b4;
		boolean result;
		
		b1  = true;
		b2  = true;
		b3  = false;
		b4  = false;
		
		/*
		 *  || 논리합(logical or) --> false || false인경우에만 false를 반환
		 */
		result = b1||b2;
		System.out.println("true||true -> " + result);

		result = b1||b3;
		System.out.println("true||false -> " + result);
		
		result = b3||b1;
		System.out.println("false||true -> " + result);

		result = b3||b4;
		System.out.println("false||false -> " + result);
		
		
		
		result = b1&&b2;
		System.out.println("true&&true -> " + result);

		result = b1&&b3;
		System.out.println("true&&false -> " + result);
		
		result = b3&&b1;
		System.out.println("false&&true -> " + result);

		result = b3&&b4;
		System.out.println("false&&false -> " + result);
		
		//점수의 유효성체크[0~100사이의 점수]
		int kor = 89;
		int eng = 90;
		boolean condition1 = kor>=0;
		boolean condition2 = kor<=100;
		boolean isValidScore = condition1 && condition2;
		System.out.println("국어점수의 유효성 야부 " + isValidScore);
		
		//A대학 : 국어,영어 점수중에서 하나라도 90점 이상이면 합격
		boolean isPass1 = (kor>=90)||(eng>=90);
		System.out.println("\t A대학 합격 여부 " + isPass1);
		System.out.printf("A대학 합격 여부 : %b \n",isPass1 );
		//b대학 : 국어, 영어 점수 모두 90점 이상이어야 합격
		boolean isPass2 = (kor>=90)&&(eng>=90);
		System.out.println("\t B대학 합격 여부 " + isPass2);
		
		//배수판별
		int number = 12;
		boolean isMultiple3 = (number%3)==0;//3의 배수여부
		System.out.println(isMultiple3);
		boolean isMultiple4 = (number%4)==0;//3의 배수여부
		System.out.println(isMultiple4);
		boolean isMultiple34 = isMultiple3&& isMultiple4;//3과 4의 배수여부
		System.out.println(isMultiple34);
		
		/*
		 * Quiz: 윤년여부판단 
		 * - 4의배수(4로나누어떨어지는수)이면서 
		 * - 100의배수가아닌수(100로나누어떨어지는않는수) 이거나
		 * - 400의배수(400로나누어떨어지는수)가 윤년
		 */
		int year = 2025;
		boolean isLeapYear = true;
		isLeapYear = ((year%4==0)&&(year%100!=0)) || ((year%4==0) && (year%4100==0));
		System.out.println("윤년 -- " + isLeapYear);

		/*
		 * 영문대문자여부
		 *  A ~ Z
		 */
		char c = 's';
		boolean isCapitalLetter = (c >= 'A') && (c <= 'Z');
		System.out.println("영문대문자여부: "+isCapitalLetter);
		/*
		 * Quiz: 한글여부판단
		 * '가'~'힣'
		 */
		c='홍';
		boolean isHangul=true;
		isHangul = (c >= '가') && (c <= '힣');
		System.out.println("한글여부:"+isHangul);
		/*
		 * Quiz: 아이디의첫글자는영문대문자나 소문자이여야한다.
		 * 'A'~'Z' 'a'~'z'
		 */
		char idFirstLetter='8';
		boolean isValidId = true;
		isValidId = (((c >= 'A') && (c <= 'Z')) || ((c >= 'a') && (c <= 'b')));
		System.out.println("아이디의 적합성여부:"+isValidId);
	}

}
