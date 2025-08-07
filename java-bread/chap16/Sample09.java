package chap16;

import java.util.function.Function;

public class Sample09 {
	public static void main(String[] args) {
		Function<Integer, String> f = (i) ->{
			return switch(i) {
				case 1-> "one";
				case 2-> "two";
				case 3-> "three";
				case 4-> "four";
				case 5-> "five";
				default -> throw new IllegalArgumentException("잘못된 숫자입니다" + i);
			};
		};
		System.out.println(f.apply(3));
	}
}
