package chap11;

import java.util.Random;
import java.util.Scanner;
import java.util.TreeSet;

public class Sample14 {
	public static void main(String[] args) {
		int times = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("몇 개의 예상 번호를 출력하시겠습니까?");
		times = sc.nextInt();
		Random random = new Random();
		for(int i=0; i<times; i++) {
			var list = new TreeSet<Integer>();
			for(int j=0; j<7; j++) {
				//로또번호입력
				int number = random.nextInt(45)+1;
				if(!list.contains(number)) {
					if(j==6) {
						for(int no :list) {
							System.out.printf("%d", no);
						}
						System.out.println("보너스 " + number);
					}
					else
						list.add(number);
				}
				else
					j--; //이미 존재하여 반복문 돌린다
			}
		}
	}
}
