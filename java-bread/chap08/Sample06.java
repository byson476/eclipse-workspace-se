package chap08;

public class Sample06 {
	public static void main(String[] args) {
		Runnable r = new Runnable() {
			public void run() {
				System.out.println("익명 내부 클래스 실행");
			}
		};
		r.run();
	}
}
