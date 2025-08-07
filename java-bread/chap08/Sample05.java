package chap08;

public class Sample05 {
	void localMehod() {
		int age = 50;
		//지역클래스 local inner class
		class localClass{
			public void howOldAreYou() {
				System.out.printf("벌써 %d살", age);
			}
		}
		localClass innerClass = new localClass();
		innerClass.howOldAreYou();
	}
	public static void main(String[] args) {
		Sample05 outer = new Sample05();
		outer.localMehod();
	}
}
