package chap08;

public class Sample08 {
	public static void main(String[] args) {
		Infomation info = new Infomation("보연", 50, 5);
		System.out.println(info.toStirng());
	}
}
class Infomation{
	String name;
	int age;
	int grade;
	public Infomation(String name, int age, int grade)
	{
		this.name = name;
		this.age = age;
		this.grade = grade;
	}
	public String toStirng() {
		return "Student [name=" + name + ", age = " + age + ", grade= " + grade + "]";
	}	
}