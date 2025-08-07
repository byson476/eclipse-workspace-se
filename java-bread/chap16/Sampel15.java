package chap16;

import java.util.function.Consumer;

public class Sampel15 {
	public static void main(String[] args) {
		Consumer<Integer> gugudan = (number) ->{
			for(int i=0; i<=9; i++) {
				System.out.printf("%d * %d = %d \n", number, i, (number*i));
			}
		};
		for(int i=1; i<=9; i++) {
			gugudan.accept(3);
		}
	}
}
