import java.util.Scanner;

public class SwitchUse {
	public static void main(String[] args) {
		/*
		 * 짝수,홀수판별후출력
		 */
		int num = 34;
		switch (num%2) {
		case 0:
			System.out.printf("%d는 짝수입니다.\n", num);
			break;
		case 1:
			System.out.printf("%d는 홀수입니다.\n", num);
			break;
		}
		/*
		 * 입력되는 문자열에따라 게임케렉터이동
		 */
		Scanner scanner = new Scanner(System.in);
		System.out.print("캐릭터 이동 방향을 입력하세요(L/l(Left),R/r(Right),U/u(Up),D/d(Down))");
		String direction = scanner.next();
		switch (direction) {
		case "L", "l":
			System.out.println("Move Left!");
			break;
		case "R", "r":
			System.out.println("Move Right!");
			break;
		case "U", "u":
			System.out.println("Move Up!");
			break;
		case "D", "d":
			System.out.println("Move Down!");
			break;
		default:
			System.out.println("Nothing!");
			break;
		}
	}
}
