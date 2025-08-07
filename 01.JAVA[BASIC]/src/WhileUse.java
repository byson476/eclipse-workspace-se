
public class WhileUse {

	public static void main(String[] args) {
		/*
		 * 10회 반복실행
		 */
		int i = 0;
		while (i < 10) {
			System.out.printf("%d회 반복되었습니다 \n", i + 1);
			i++;
		}

		// 1~10까지의 정수 출력
		i = 1;
		while (i <= 10) {
			System.out.print(i + " ");
			i++;
		}
		// 1~10까지의 정수 중 홀수 출력
		System.out.println();
		i = 1;
		while (i <= 10) {
			if (i % 2 == 1)
				System.out.print(i + " ");
			i++;
		}
		// 1~100까지의 정수 중 4의 배수만 출력
		System.out.println();
		i = 1;
		while (i <= 100) {
			if (i % 4 == 0)
				System.out.print(i + " ");
			i++;
		}
		System.out.println();
		i = 1;
		int tot = 0;
		while (i <= 100) {
			tot = tot + i;
			i++;
		}
		System.out.print("1 ~ 100까지 숫자의 합 " + tot);

		System.out.println();
		i = 1;
		int evenTot = 0;
		int oddTot = 0;
		while (i <= 100) {
			if (i % 2 == 0)
				evenTot = evenTot + i;
			else
				oddTot = oddTot + i;
			i++;
		}
		System.out.println("홀수의 합 " + oddTot);
		System.out.print("짝수의 합 " + evenTot);
		
		/*
		 * [Quiz]1900년도부터 2025년까지 윤년인 연도를 출력하세요 
		 */
		System.out.println();
		System.out.println("윤년");
		i = 1900;
		while (i <= 2025) {
			if (((i % 4 == 0) && (i % 100 != 0)) || (i % 400 == 0))
				System.out.print(i + " ");
			i++;
		}	

	}

}
