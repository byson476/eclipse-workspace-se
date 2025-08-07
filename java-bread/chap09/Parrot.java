package chap09;
//SAmple03
public class Parrot extends Pet{

	public Parrot(boolean wing, int legCount) {
		super(wing, legCount);
		// TODO Auto-generated constructor stub
	}
	
	public void run(String name) {
		System.out.printf("%s는 두빌로 뜁니다 %n", name);
	}
	
	public void fly(String name) {
		System.out.printf("%s는 뛰지않고 날아갑니다 %n",name);
	}
}
