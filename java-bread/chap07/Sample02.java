package chap07;

import java.util.Scanner;

public class Sample02 {
	public static void main(String[] args) {
		int in = 5;
		
		switch(in) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 9:
				System.out.println("홀수입니다");
				break;
			case 2:
			case 4:
			case 6:
			case 8:
			case 10:
				System.out.println("짝수입니다");
				break;
			default: System.out.println("1~10사이의 숫자가 아닙니다.");	
		}
	
		in = 6;
		switch(in) {
			case 1, 3, 5, 7, 9:
				System.out.println("홀수입니다");
				break;
			case 2, 4, 6, 8, 10:
				System.out.println("짝수입니다");
				break;
			default: System.out.println("1~10사이의 숫자가 아닙니다.");	
		}
		
		in = 7;
		String season = switch(in) {
			case 12, 1, 2 ->"겨울";
			case 3, 4, 5 ->"봄";
			case 6, 7, 8 ->"여름";
			case 9, 10, 11 -> "가을";
			default ->"기후온난화";
		};
		System.out.println(season);
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if(num%2==0)
			System.out.printf("%d는 양수입니다", num);
		else
			System.out.printf("%d는 홀수입니다", num);
	}
}
