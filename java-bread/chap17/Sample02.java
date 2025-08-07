package chap17;

import java.util.Arrays;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Sample02 {
	public static void main(String[] args) {
		String[] strArr = {"원빈", "창준", "경진"};
		int[] intArr = {3, 6, 9};
		double[] floatArr = {3.1, 4.2, 5.3};
		
		Stream<String> strStm = Arrays.stream(strArr);
		IntStream intStm = Arrays.stream(intArr);
		DoubleStream douStm = Arrays.stream(floatArr);
		
		strStm.forEach(System.out::println);
		intStm.forEach(System.out::println);
		douStm.forEach(System.out::println);
	}
}
