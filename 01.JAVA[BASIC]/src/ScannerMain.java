import java.util.Scanner;

public class ScannerMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("문자열을 입력하세요.");
		//키보드로부터 데이터를 입력받기 위해서 실행흐름을 대기시킴(blocking)
		String str = scanner.next();
		System.out.println("입력받은 문자열 : " + str);
		
		System.out.println("정수를 입력하세요. ");
		//blocking
		int no = scanner.nextInt();
		System.out.println("입력받은 정수 : " + no);
		
		System.out.println("실수를 입력하세요. ");
		double d = scanner.nextDouble();
		System.out.println("입력받은 실수 : " + d);
		
		System.out.println("국어 영어 수학 점수를 입력하시오");
		int kor = scanner.nextInt();
		int eng = scanner.nextInt();
		int math= scanner.nextInt();
		
		int tot = kor + eng + math;
		//double avg = tot/3.0;
		double avg = (double)tot/3;
		System.out.printf("%d %d %d %d %5.1f" , kor, eng, math, tot, avg);
	}

}
