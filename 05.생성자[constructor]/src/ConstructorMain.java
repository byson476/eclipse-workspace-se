
public class ConstructorMain {
	public static void main(String[] args) {
		System.out.println("---------------------------------c1-----------------------");
		Constructor c1 = new Constructor();
		System.out.println("main : " + c1);
		c1.print();
		
		Constructor c2 = new Constructor(100, 200, "생성자호출");
		System.out.println("main : " + c2);
		c2.print();
	}
}
