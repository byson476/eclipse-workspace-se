
/*
 * 4개의 멤버메쏘드를 가짐
 */
public class Calculator {
	//외부에서 생성자 메쏘드 호출 불가
	private Calculator() {}
	
	public static int add(int i, int j) {
		return i+j;
	}
	public static int sub(int i, int j) {
		return i-j;
	}

	public static int mul(int i, int j) {
		return i*j;
	}

	public static int div(int i, int j) {
		return i/j;
	}
	
	
}