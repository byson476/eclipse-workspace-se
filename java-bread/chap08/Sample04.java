package chap08;

public class Sample04 {
	public static void main(String[] args) {
		Student student = new Student("손보연");
		//인스턴스 내부 클래스 instance inner class
		Student.Score studentScore = student.new Score();
		studentScore.eng = 21;
		studentScore.math = 30;
		studentScore.showInfo();
	}
}
