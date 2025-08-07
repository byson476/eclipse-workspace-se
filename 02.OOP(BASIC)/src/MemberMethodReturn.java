
public class MemberMethodReturn {
	int memberField1;
	int memberField2;
	int memberField3;
	
	int method1() {
		System.out.println("\t int method1() 실행");
		int result = 12345 + 12345;
		System.out.println("\t int method1() 실행종료 후 int데이터 반환");
		return result;
	}
	
	boolean method2() {
		
		System.out.println("\t boolean method2() 실행");
		boolean isMarried = true;
		System.out.println("\t boolean method2() 실행종료 후, beeloan 데이터 반환");
		return isMarried;		
	}
	
	//두 개의 정수를 파라미터로 받아서 더한 결과를 반환하는 메쏘드
	int add(int a, int b) {
		System.out.println("\t int add(int a, int b) 실행");
		System.out.println("\t int add(int a, int b) 실행종료 후 int데이터 반환");
		return a+b;
	}
	
	String hello(String name) {
		return name + "님 안녕하세요!";
	}
}
