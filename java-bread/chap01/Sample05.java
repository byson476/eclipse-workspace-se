package chap01;

import java.util.Random;
import java.util.Scanner;

public class Sample05 {

	public static void main(String[] args) {
		String a1 = "1234";
		int a2 = Integer.parseInt(a1);
		
		int b1 = 5678;
		String b2 = Integer.toString(b1);
		String b3 = String.valueOf(b1);
		String b4 = " " + b1;
		
		
		Scanner sc = new Scanner(System.in);
		String in = sc.nextLine();
		System.out.printf("입력한 값 : [%s]\n글자수 : %d\n", in.toUpperCase().trim(), in.toUpperCase().trim().length());
		sc.close();
		
		final float PI;
		PI = 3.14f;
		int radius = 10;
		float area =  radius * PI;
		System.out.printf("원의 넓이 : %f\n", area);
		
		Random random = new Random();
		int num = random.nextInt(3) + 1;
		System.out.printf("난수 : %d", num);
	}
}
