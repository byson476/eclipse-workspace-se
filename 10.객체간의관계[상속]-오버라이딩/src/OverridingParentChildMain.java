/*
 * 오버라이딩(재정의)
 *   1. 상속관계에서 발생하는 메쏘드의 재정의 기법이다
 *   2. 자바의 다형성 기법중의하나이다.
 *   
 *   -형태 : 부모클래스에 정의된 메쏘드와 동일한 메쏘드(이름,리턴타입,매개변수)를 
 *           자식클래스에 정의(재정의)하는것
 * 
 *   - ex> public class Super{
 *   			public void print(){
 *   			}		
 *   		}
 *        
 *        public class Sub extends Super{
 *        		public void print(){
 *        		}
 *        }
 * 
 */
class Parent{
	public void method1() {
		System.out.println("Parent.method1()");
	}
	public void method2() {
		System.out.println("Parent.method2()");
	}
}
class Child extends Parent{
	/*
	public void method1() {
		System.out.println("Parent.method1()");
	}
	//부모로부터상속받은 method2()는 은폐되어서 외부에서 호출불가능
	public void method2() {
		System.out.println("Parent.method2()");
	}
	 */
	/*
	 * 재정의하면
	 *    - 부모로부터상속받은 메쏘드(method2)는 은폐되어서 외부(내부)에서 호출불가능
	 *    - 자식에서 재정의한메쏘드만(method2)호출된다.
	 */
	//자식에서 재정의한 메쏘드만(method2)호출된다.
	public void method2() {
		System.out.println("-------------재정의한  method2 START ---------");
		System.out.println("Parent.method2()를 Child에서 제정의");
		super.method2();
		System.out.println("-------------재정의한  method2 EMD ---------");	
	}
	public void method3() {
		System.out.println("Child.method3");
	}
}
public class OverridingParentChildMain {

	public static void main(String[] args) {
		Child c= new Child();
		c.method1();
		c.method2();
		c.method3();
	}

}