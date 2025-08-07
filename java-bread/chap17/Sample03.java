package chap17;

import java.util.Arrays;
import java.util.stream.Stream;

public class Sample03 {
	public static void main(String[] args) {
		String[] str1 = {"원빈", "창준", "경진"};
		String[] str2 = {"엄마", "아빠"};
		
		Stream<String[]> strm1 = Stream.of(str1, str2);
		
		System.out.println("  Stream.of(str1, str2)  ");
		Stream.of(str1, str2).forEach(x->System.out.println(Arrays.deepToString(x)));
		
		System.out.println("\n  strm1.flatMap(Arrays::stream");
		Stream<String> strm2 = strm1.flatMap(Arrays::stream);
		strm2.forEach(System.out::println);
	}
}
