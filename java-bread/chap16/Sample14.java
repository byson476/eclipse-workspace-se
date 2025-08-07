package chap16;

public class Sample14 {

	public static void main(String[] args) {
		/*내부클래스
		TestFunction tf = new TestFunction() {
			public String apply(String str) {
				return str.replace("-", "");
			}
		};
		String str = "010-1111-2222";
		System.out.println(tf.apply(str));
		*/
		/*람다식*/
		TestFunction tf = str -> str.replace("-", "");
		String str = "010-1111-2222";
		System.out.println(tf.apply(str));	
	}

}

interface TestFunction{
	public abstract String apply(String str);
}
	