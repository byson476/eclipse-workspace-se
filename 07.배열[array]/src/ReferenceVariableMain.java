
public class ReferenceVariableMain {
	public static void main(String[] args) {
		System.out.println("==== 참조변수의 대입 ======");
		Account account1 = new Account(1234, "김경수", 56000, 3.5);
		Account account2 = new Account(9988, "김경우", 89000, 5.9);
		Account account3 = account1;
		System.out.println(account1);
		System.out.println(account2);
		System.out.println(account3);
		account1.print();
		account3.print();
		account1.setOwner("김경미");
		account1.print();
		account3.print();
		System.out.println("참조변수 비교");
		if(account1 != account2)
			System.out.println("주소값이 동일하지 않다/ 다른 객체이다 : " + account1 + " ---- " + account2);
		if(account1 == account3)
			System.out.println("주소값이 동일하다/ 같은 객체이다 : " + account1 + " ---- " + account3);
		
		System.out.println("==== 주소값 교환 =====");
		Account a1 = new Account(1000, "일천님", 1000, 0.1);
		Account a2 = new Account(2000, "이천님", 2000, 0.2);
		System.out.println("-------- swap 전----------");	
		a1.print();
		a2.print();
		
		Account tempAccount1 = a1;
		a1 = a2;
		a2 = tempAccount1;
		System.out.println("-------- swap 후----------");	
		a1.print();
		a2.print();	
		
		/*
		 * null : 객체주소 리터럴(주소없다주소값)
		 * 		- 객체주소 초기화의 용도로사용
		 *      - null주소를 사용해서 멤버에 접근시에는 NullPointerExcetion예외가발생하고
		 *        프로그램이 종료된다.
		 * 
		 */
		
		Account account = null;
		if(account==null)
			System.out.println("Account객체값이 널입니다 : " + account);
		else
			account.print();
		
	}
}
