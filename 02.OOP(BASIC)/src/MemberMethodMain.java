
public class MemberMethodMain {
	public static void main(String[] args) {
		MemberMethod mm=new MemberMethod();
		mm.member1=11;
		mm.member2=22;
		System.out.println("main stmt1");
		/*
		 멤버메쏘드 실행(호출)
		   -  형식 :  참조(주소)변수.멤버메쏘드이름();
		   -  main실행흐름을 mm주소에있는 객체의
		      method1이라는이름의 메쏘드(실행코드블록)로 보낸다. 
		 */
		mm.method1();
		System.out.println("main stmt2");
		mm.method2(2);
		System.out.println("main stmt3");
		mm.method2(3);
		System.out.println("main stmt4");
		mm.method3("안녕하세요", 3);
		System.out.println("main stmt5");
		mm.method3("누구세요", 5);
		System.out.println("main stmt6");
		mm.method4("김경호","잘생겼어요!!", 3);
		System.out.println("main stmt8");
		mm.method4("이효리","안녕하세요!!", 5);
		System.out.println("main stmt9");
		return;
	}
}
