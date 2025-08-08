
class Parent extends Object{
	public int member1;
	public int member2;
	public void method1() {
		System.out.println("Parent.method1()");
	}
	public void method2() {
		System.out.println("Parent.method2()");
	}
}

class Child extends Parent{
/*
	public int member1;
	public int member2;
	public void method1() {
		System.out.println("Parent.method1()");
	}
	public void method2() {
		System.out.println("Parent.method2()");
	}
 */
	public int member3;
	public void methos3() {
		System.out.println("Child.methos3()");
	}
	
}
public class ParentChildMain {
	public static void main(String[] args) {
		System.out.println("-----------child객체---------------");
		Child c1 = new Child();
		c1.member1 = 1;
		c1.member2 = 2;
		c1.member3 = 3;
		c1.method1();
		c1.method2();
		c1.methos3();
		System.out.println("c1=" + c1);
		/*
		System.out.println("-----------Parent객체---------------");
		Parent p1 = new Parent();
		p1.member1 = 1;
		p1.member2 = 2;
		p1.method1();
		p1.method2();
		System.out.println("p1=" + p1);
		*/
		
	}
}
