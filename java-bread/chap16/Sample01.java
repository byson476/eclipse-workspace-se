package chap16;
/* 람다식
public class Sample01 {
	public static void main(String[] args) {
		Smaple01Function f = (n) -> System.out.printf("당신은 %s이군요~", n); f.test("엄마");
	}
}
interface Smaple01Function{
	public abstract void test(String name);
}
*/
public class Sample01 {
	public static void main(String[] args) {
		Smaple01Function f = new Smaple01Function(){
			public void test(String n) {
				System.out.printf("당신은 %s이군요~", n);
			}
		};
		f.test("엄마");
	}
}
interface Smaple01Function{
	public abstract void test(String name);
}
