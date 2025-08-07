package chap08;
//sample04
public class Student {
	String name;
	
	public Student(String name) {
		this.name = name;
	}
	
	public class Score{
		int eng;
		int math;
		
		public void showInfo()
		{
			System.out.println("이름 : " + name);
			System.out.println("영어 - " + eng);
			System.out.println("수학 - " + math);
		}
	}
}
