import java.util.Scanner;

public class SwtirchTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("게임 레벨을 입력하세요(1~5사이의 정수).");
		int level = scanner.nextInt();
		
		switch (level) {
		case 1:
			System.out.println("초보");
			System.out.println("초보");
			System.out.println("초보");
			break;
		case 2:
			System.out.println("중수");
			break;
		case 3:
		case 4:
		case 5:
			System.out.println("고수");
			break;

		default:
			System.out.println("게임레벨은 1~5사이의 정수입니다");
			break;
		}
	}
}
