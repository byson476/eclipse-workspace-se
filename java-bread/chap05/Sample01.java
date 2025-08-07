package chap05;

public class Sample01 {
	public static void main(String[] args) {
		int []number = new int[3];
		number[0] = 10;
		number[1] = 20;
		number[2] = 30;
		
		int[] number1 = {10, 20, 30};
		
		int []number2 = new int[3];
		number2[0] = 10;
		number2[1] = 20;
		number2[2] = 30;
		System.out.printf("2배열의 갯수는 %d개입니다", number2.length);

		int[] number3 = {10, 20, 30};
		System.out.printf("\n\n3배열의 갯수는 %d개입니다", number3.length);
	}
}
