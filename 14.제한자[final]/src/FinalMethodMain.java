//클래스앞에 붙일경우 상속금지
/*
final class Parent{
	
}
*/

import java.lang.reflect.Method;

class Parent{
	public void method1() {
		System.out.println("Parent.method1()");
	}
	public final void method2() {
		System.out.println("Parent.method2() 난 final메쏘드 재정의 금지");
	}
}
class Child extends Parent{
	@Override
	public void method1() {
		System.out.println("Child 클래스에서 Parent.method1()재정의");
	}
	/*
	 * Cannot override the final method from Parent
	 
	public void method2() {}
	*/
}
public class FinalMethodMain {
	public static void main(String[] args) {
		Child c1 = new Child();
		c1.method1();
		c1.method2();
	}
}
