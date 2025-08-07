
public class IfUse {

	public static void main(String[] args) {
		int no1 = 11;
		if (no1 % 2 == 0)
			System.out.printf("%d는 짝수\n", no1);
		else
			System.out.printf("%d는 홀수\n", no1);

		int no2 = 23452;
		if (no2 % 4 == 0)
			System.out.printf("%d는 4의 배수\n", no2);
		else
			System.out.printf("%d는 4의 배수아님\n", no2);

		int year = 2028;
		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
			System.out.printf("%d는 윤년\n", year);
		else
			System.out.printf("%d는 평년\n", year);

		char c = '꿈';
		if (c >= 'A' && c <= 'Z')
			System.out.printf("%c는 알파벳 대문자입니다.\n", c);
		else if (c >= 'a' && c <= 'z')
			System.out.printf("%c는 알파벳 소문자입니다.\n", c);
		else if (c >= '0' && c <= '9')
			System.out.printf("%c는 숫자형태의 문자입니다.\n", c);
		else if (c >= '가' && c <= '힣')
			System.out.printf("%c는 한글입니다.\n", c);
		
		char idFirstLetter = 'a';
		if((idFirstLetter >= 'A' && idFirstLetter <= 'Z') || (idFirstLetter >= 'a' && idFirstLetter <= 'z')) 
			System.out.printf("%c는 유효한 아이디 문자입니다.\n", idFirstLetter);
		else
			System.out.printf("%c는 유효하지 않는 문자입니다\n", idFirstLetter);
	}

}
