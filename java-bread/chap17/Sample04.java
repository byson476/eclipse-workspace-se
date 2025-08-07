package chap17;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Sample04 {
	public static void main(String[] args) {
		/* NullPointerException 잡는 법*/
		String[] arrStr = null;
		Stream<Object> stream = Stream.of((arrStr==null? Stream.empty() : arrStr));
		
		/*stream범위지정*/
		IntStream.rangeClosed(12, 18).forEach(System.out::println);
		
		/* 병렬스트림생성*/
		long processTime1 = System.currentTimeMillis();
		IntStream.rangeClosed(65, 74).forEach(x->System.out.println(Thread.currentThread().getClass() + " -- " + (char)x));
		System.out.println("직렬스트림 출력시간-" + (System.currentTimeMillis() - processTime1));
		
		long processTime2 = System.currentTimeMillis();
		IntStream.rangeClosed(65, 74).parallel().forEach(x->System.out.println(Thread.currentThread().getClass() + " -- " + (char)x));
		System.out.println("병렬스트림 출력시간-" + (System.currentTimeMillis() - processTime2));

		/*병렬스트림 순서 보장*/
		IntStream.rangeClosed(65, 74).parallel().forEachOrdered(x->System.out.println(Thread.currentThread().getClass() + " -- " + (char)x));
		
		/* 스트림을 이용하여 배열 생성*/
		int[] numbers = IntStream.rangeClosed(1, 100).toArray();
		Arrays.stream(numbers).forEach(System.out::println);
		
	}
}
