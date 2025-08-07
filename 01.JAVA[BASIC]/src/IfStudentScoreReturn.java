
public class IfStudentScoreReturn {

	public static void main(String[] args) {

		int kor = 89;
		if (kor < 0 || kor > 100) {
			System.out.printf("%d는 유효한 점수가 아닙니다\n", kor);
			return; // 메인문에서의 return문만 프로그램 종료를 의미한다.
					// 현재 실행흐름을 JVM에 반환한다.
		}
		System.out.println(">>학점계산 후 출력");
		char hakjum = '\u0000';
		if (kor >= 90)
			hakjum = 'A';
		else if (kor >= 80)
			hakjum = 'B';
		else if (kor >= 70)
			hakjum = 'C';
		else if (kor >= 60)
			hakjum = 'D';
		else
			hakjum = 'F';
		System.out.printf("학점은 %c입니다\n", hakjum);

	}

}
