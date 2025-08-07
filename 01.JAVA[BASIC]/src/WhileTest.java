
public class WhileTest {
	public static void main(String[] args) {
		System.out.println("stmt1");
		/*
		 * 논리형리터럴 ->무한루핑
		
		while (true)
			System.out.println("stmt2");
		 */
		/*
		 * 논리형 변수
		 */
		boolean isPlay = true;
		while(isPlay)
			System.out.println("stmt2");
		System.out.println("stmt3");
	}
}
