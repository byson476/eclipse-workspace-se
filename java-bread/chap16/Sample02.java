package chap16;

/* 람다식 */
public class Sample02 {
	public static void main(String[] args) {
		Runnable r = () -> System.out.println("익명 내부 클래스를 람다식으로 실행");r.run();
	}
}
/* 익명내부클랙스
public class Sample02 {
	public static void main(String[] args) {
		Runnable r = new Runnable() {
			public void run(){
				System.out.println("익명 내부 클래스 실행");
			}
		};
		r.run();
	}
}
*/