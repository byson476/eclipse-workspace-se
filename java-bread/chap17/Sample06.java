package chap17;

import java.util.stream.IntStream;
/* 스트림 구구단 */
public class Sample06 {
	public static void main(String[] args) {
		IntStream.rangeClosed(1, 9).forEach(x->{
												IntStream.rangeClosed(1, 9).forEach(y->{System.out.println(x + "*" + y +  "=" +( x*y));});
												}
		                            );
	}
}
