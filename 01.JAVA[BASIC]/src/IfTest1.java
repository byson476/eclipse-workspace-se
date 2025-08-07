
public class IfTest1 {

	public static void main(String[] args) {

		System.out.println("main block start-----");
		System.out.println("stmt1");
		boolean condition = false;
		if (condition) {
			System.out.println("stmt2");
			System.out.println("stmt3");
			System.out.println("stmt4");
		}

		System.out.println("stmt5");

		if (condition) {
			System.out.println("stmt6");
			System.out.println("stmt7");
		} else {
			System.out.println("stmt8");
			System.out.println("stmt9");
		}

		if (condition)
			System.out.println("stmt10");

		if (condition)
			System.out.println("stmt11");
		else
			System.out.println("stmt12");
		
		System.out.println("stmt13");

		System.out.println("stmt14");

		System.out.println("------main block end ->return(복귀 jvm셧다운)");
		
		/*
		 * main block에서의 return문은 실행흐름을 JVM(실행흐름을 만들어서 호출한 곳)으로 반환한다.
		 * 생략가능하다		
		 */
		return;
	}

}
