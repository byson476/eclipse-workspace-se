package chap17;

import java.util.stream.IntStream;

public class Sample08 {
	public static void main(String[] args) {
		IntStream.rangeClosed(2, 100).filter( x-> {
												int i = IntStream.rangeClosed(2, x).map(y->(x%y==0)?1:0).reduce(0, Integer::sum);
												return i<2;
											}).forEach(System.out::println);
											
											
	}
}
