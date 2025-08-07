package chap08;

public class Sample07 {
	public static void main(String[] args) {
		Greeting greeting = new Greeting() {
			public String sayHello(String name) {
				return name+"안녕";
			}
		};
		System.out.println(greeting.sayHello("엄마"));
	}
}
interface Greeting{
	public String sayHello(String name);
}