package chap09;

public class Sample06 {
	public static void main(String[] args) {
		Person1 p1 = new Person1();
		p1.study();
		
		Person2 p2 = new Person2();
		p2.teach();
		
		Person3 p3 = new Person3();
		p3.teach();
		p3.study();
	}
}
class Person1 implements Student{
	public void study() {
		System.out.println("Person1이 공부합니다.");
	}
}
interface Student{
	void study();
}

class Person2 implements Teacher{

	@Override
	public void teach() {
		System.out.println("Person2가 가르칩니다.");
	}
	
}
interface Teacher{
	void teach();
}

class Person3 implements Student, Teacher{
	public void teach() {
		System.out.println("Person3이 가르칩니다.");
	}
	public void study() {
		System.out.println("Person3이 공부합니다.");
	}
}