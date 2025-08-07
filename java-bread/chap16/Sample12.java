package chap16;

import java.util.Scanner;
import java.util.function.Function;
import java.util.function.Predicate;

public class Sample12 {
	public static void main(String[] args) {
		/*
		Function<Integer, Integer> fun = Function.identity();
		System.out.println(fun.apply(100));
		*/
		/*
		Predicate<Integer> is0dd = (s) ->(s%2)==1;
		Scanner sc = new Scanner(System.in);
		System.out.println("홀수를 입력하세요 : ");
		sc.nextInt();
		System.out.println(is0dd.test(sc.nextInt()));
		*/
		/*
		Predicate<Integer> is0dd = (s) ->(s%2)==1;
		Scanner sc = new Scanner(System.in);
		System.out.println("짝수를 입력하세요 : ");
		sc.nextInt();
		System.out.println(is0dd.negate().test(sc.nextInt()));
		*/
		
		Predicate<Integer> isOdd = (s) ->(s%2)==1;
		Predicate<Integer> isEven = Predicate.not(isOdd);
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요 : ");;
		
		int mynum = sc.nextInt();
		if(isOdd.test(mynum))
			System.out.println("홀수를 입력하셨습니다");
		else if(isEven.test(mynum))
			System.out.println("짝수를 입력하셨습니다");
	}
}
