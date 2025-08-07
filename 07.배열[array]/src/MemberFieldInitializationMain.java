
public class MemberFieldInitializationMain {
	public static void main(String[] args) {
		System.out.println(" ----------- memberFieldInitialization1 -------------");
		MemberFieldInitialization memberFieldInitialization1 = new MemberFieldInitialization();
		System.out.println("1-1.인스턴스멤버필드(변수)는 객체생성시 기본값으로 자동초기화");
		System.out.println(memberFieldInitialization1.member1);
		System.out.println(memberFieldInitialization1.member2);
		System.out.println(memberFieldInitialization1.member3);
		System.out.println(memberFieldInitialization1.member4);
		System.out.println(memberFieldInitialization1.member5);
		System.out.println(memberFieldInitialization1.member6);
		
		System.out.println("1-2.인스턴스멤버필드(변수)는 객체생성시 초기값으로 초기화할수있다.");
		System.out.println(memberFieldInitialization1.member11);
		System.out.println(memberFieldInitialization1.member22);
		System.out.println(memberFieldInitialization1.member33);
		System.out.println(memberFieldInitialization1.member44);
		System.out.println(memberFieldInitialization1.member55);
		System.out.println(memberFieldInitialization1.member66);
		
		System.out.println("------------memberFieldInitialization2----------------");
		MemberFieldInitialization memberFieldInitialization2=
				new MemberFieldInitialization(1, 1.23, '가', true, "문자열1", 
						                      new Account(6666,"육육육", 60000,6.6),
											  2, 4.56, '힣', false, "문자열2", 
											  new Account(8888,"팔팔팔", 80000,8.8));
		System.out.println(memberFieldInitialization2.member1);
		System.out.println(memberFieldInitialization2.member2);
		System.out.println(memberFieldInitialization2.member3);
		System.out.println(memberFieldInitialization2.member4);
		System.out.println(memberFieldInitialization2.member5);
		System.out.println(memberFieldInitialization2.member6);
		System.out.println(memberFieldInitialization2.member11);
		System.out.println(memberFieldInitialization2.member22);
		System.out.println(memberFieldInitialization2.member33);
		System.out.println(memberFieldInitialization2.member44);
		System.out.println(memberFieldInitialization2.member55);
		System.out.println(memberFieldInitialization2.member66);
		memberFieldInitialization2.member66.print();
		memberFieldInitialization2.member66.deposit(333);
		memberFieldInitialization2.member66.print();
		
		int[] intArray = new int[100];
		//Account객체를 만드는데, 멤버필드가 100개이고, Account타입이다.
		Account[] accounts = new Account[100];
		
	}
}
