
public class MemberFieldMain {
	public static void main(String[] args) {
		/*
		MemberField 사용자정의 타입 객체의 주소값을 저장할 참조변수선언
		 */
		MemberField mf1;
		/*
		 * MemberField클래스(틀) 로 객체를생성한후에 객체의 주소값이 대입
		 * mf1참조변수에 대입(#100)
		 */
		mf1=new MemberField();
		
		/*
		 - 객체의 참조(주소)변수가 가지고있는 객체의 주소값 #100를 사용해서 멤버필드에 데이타대입
		 - 객체의 멤버필드접근방법
		    - 참조변수.멤버필드이름=값;
		    - mf1.memberField1=9090;
		 */
		
		/*
		 * mf1(#100)주소에있는 객체의 int     타입의 멤버필드 memberField1에 1234 	 값을대입
		 * mf1(#100)주소에있는 객체의 double  타입의 멤버필드 memberField2에 3.2  	 값을대입
		 * mf1(#100)주소에있는 객체의 boolean 타입의 멤버필드 memberField3에 true 	 값을대입
		 * mf1(#100)주소에있는 객체의 char    타입의 멤버필드 memberField4에 'A'  	 값을대입
		 * mf1(#100)주소에있는 객체의 String  타입의 멤버필드 memberField5에 "문자열"  값을대입
		 */
		mf1.memberField1=1234;
		mf1.memberField2=3.2;
		mf1.memberField3=true;
		mf1.memberField4='A';
		mf1.memberField5="문자열";
		
		/*
		 - 객체참조(주소)변수가 가지고있는 주소값 #100를 사용해서 멤버필드값을 출력
		 - 객체의 멤버필드접근방법
		    1. System.out.println(mf1.memberField1);
		    2. int tempMember1 =  mf1.memberField1;
		       System.out.println(tempMember1);
		    
		   mf1객체의 int 			타입 memberFiled1의 값을 출력    
		   mf1객체의 double 		타입 memberFiled2의 값을 출력    
		   mf1객체의 boolean		타입 memberFiled3의 값을 출력    
		   mf1객체의 char 			타입 memberFiled4의 값을 출력    
		   mf1객체의 String 		타입 memberFiled5의 값을 출력    
		 */
		System.out.println(">>mf1의 주소값 : " + mf1);
		int tempMf1 = mf1.memberField1;
		System.out.println(tempMf1);
		System.out.println(mf1.memberField2);
		System.out.println(mf1.memberField3);
		System.out.println(mf1.memberField4);
		System.out.println(mf1.memberField5);
		
		MemberField mf2 = new MemberField();
		mf2.memberField1 = 1;
		mf2.memberField2 = 1.0;
		mf2.memberField3 = true;
		mf2.memberField4 = 1;
		mf2.memberField5 = "문자열";
		
		System.out.println(">>mf2의 주소값 : " + mf2);
		System.out.println(mf2.memberField1);
		System.out.println(mf2.memberField2);
		System.out.println(mf2.memberField3);
		System.out.println(mf2.memberField4);
		System.out.println(mf2.memberField5);
		
	}
}
