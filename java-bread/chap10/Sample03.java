package chap10;

public class Sample03 {
	
	public static void main(String[] args) {
		Sample01 age = new Sample01();
		Sample02 name = new Sample02();

		age.setA(50);
		name.setA("손보연");
		
		int PersonAge = age.getA();
		String PersonName = name.getA();
		
		System.out.printf("%s는 %d살입니다", PersonName, PersonAge);
	}
	

	
}