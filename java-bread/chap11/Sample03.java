package chap11;

import java.util.Stack;

public class Sample03 {
	public static void main(String[] args) {
		var stack = new Stack<String>(); //FILO 후입선출법
		
		stack.push("dog");
		stack.push("cat");
		stack.push("lion");
		System.out.printf("1 총 %d의 자료가 있습니다. %n%n", stack.size());
		
		while(!stack.isEmpty())
			System.out.println(stack.pop());

		System.out.printf("2 총 %d의 자료가 있습니다. %n%n", stack.size());
	}
}
