package chap06;

import java.util.Scanner;

public class Sample01 {
	public static void main(String[] args) {
		for(int i=0, j=9; i<5; i++,j-=2)
		{
			for(int k=0; k<i; k++)
				System.out.print(" ");
			for(int h=0; h<j; h++)
				System.out.print("#");
			System.out.println();
		}
	
		int k = 0;
		do {
			for(int j=0; j<k; j++)
				System.out.print("*");
			System.out.println();
			k++;
		}
		while(k<6);
		
		final int line = 5;
		for(int i=0; i<line; i++)
		{
			for(int j=0; j<line-(i+1); j++)
				System.out.print(" ");
			
			for(int m=0; m<(i+(i+1)); m++)
				System.out.print("*");
			System.out.println("");	
		}
		
		//구구단
		for(int i=1; i<10; i++)
		{
			for(int j=1; j<10; j++) {
				System.out.printf("%d * %d = %d \n", i, j, i*j);
				break;
			}
			if(true) continue;
			System.out.println();
		}
		
		int[][] x = new int[8][9];
		for(int a=0; a<8; a++) {
			for(int b=0; b<9; b++)
				x[a][b] = (a+2)*(b+1);
		}
		for(int i=0; i<x.length; i++) {
			int[] y = x[i];
			for(int j=0; j<y.length; j++)
				System.out.print("\t" + y[j]);
			System.out.println();
		}
		//구구단
		
		
		
		
		
		String[] friends = {"우영", "보연", "원빈", "창준", "경진"};
		for(String friend : friends)
			System.out.println(friend);
		
		String str = "Hello, JAVA";
		char[] chr = str.toCharArray();
		for(char c : chr)
			System.out.println(c);
		

		
		int[] dap = {1, 1, 0, 0, 1};
		System.out.println("답 입력 : ");
		Scanner sc = new Scanner(System.in);
		String in = sc.nextLine();
		System.out.println("정답 : ");
		for(int n : dap)
			System.out.print(n);
		System.out.print("\n 결과 : ");
		int targetLoc = 0;
		for(char c : in.toCharArray())
			System.out.print((c & dap[targetLoc++]) ==1 ? "O" : "X");
	}
}
