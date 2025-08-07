
public class LocalVariableInitialiazationMain {
	public static void main(String[] args) {
		/*
		 * 모든 변수는 초기화하여야 사용할 수 있다.
		 */
		// local 변수 (기본형)
		int a = 9;
		int b = 10;
		System.out.println("a="+a);
		System.out.println("b="+b);
		
		/*
		<< 1. The local variable tot1 may not have been initialized >>
		int tot1;
		System.out.println("tot1="+tot1);
		*/
		/*
		<< 2.The local variable tot2 may not have been initialized>>
		int tot2;
		boolean condition=true;
		if(condition) {
			tot2=345;
		}
		System.out.println("tot2="+tot2);
		*/
		/*
		<< 3.The local variable tot3 may not have been initialized >>
		int tot3;
		tot3=tot3+1;
		System.out.println("tot3="+tot3);
		*/
		int tot1;
		tot1=0;
		System.out.println("tot1="+tot1);
		
		int tot2;
		boolean condition2=true;
		if(condition2) {
			tot2=0;
		}else {
			tot2=1;
		}
		System.out.println("tot2="+tot2);
		
		int tot3=0;
		tot3=tot3+1;
		System.out.println("tot3="+tot3);
		
		//local변수(참조형)
		/*
		<< 1.The local variable account1 may not have been initialized >>
		Account account1;
		account1.print();
		*/
		Account account1;
		account1=new Account(1,"일일일", 1000, 1.1);
		account1.print();
		/*
		<< 2.The local variable account2 may not have been initialized >>
		 Account account2;
		 boolean condition22=true;
		 if(condition22) {
			 account2=new Account(2, "둘둘둘", 2000, 2.2);
		 }
		 account2.print();
		 */
		Account account2;
		boolean condition22=true;
		if(condition22) {
			account2=new Account(2, "둘둘둘", 2000, 2.2);
		}else {
			account2=new Account(2, "이이이", 2000, 2.2);
		}
		account2.print();
		
		/*
		 * 참조변수 초기화시 기본값
		 *   - null(주소리터럴)
		 *   - 주소없다 주소값
		 */
		
		Account account3=null;
		//Account account3=new Account(3,"셋셋셋",3000,3.3);
		
		if(account3==null) {
			account3=new Account(3, "삼삼삼", 3000, 3.3);
		}
		account3.print();
		
	}
}
