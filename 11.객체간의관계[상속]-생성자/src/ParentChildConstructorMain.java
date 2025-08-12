class Parent{
	private int member1;
	private int member2;
	
	public Parent() {
		System.out.println("Object()기본생성자 호출");
		System.out.println("Parent()기본생성자 호출");
	}
	public Parent(int member1, int member2) {
		System.out.println("Object()기본생성자 호출");
		this.member1 = member1;
		this.member2 = member2;
		System.out.println("Parent()기본생성자 호출");
	}
	
	public void print() {
		System.out.print("member1 :: " + member1 + "\t member2 :: " + member2);
	}
	
	public int getMember1() {
		return member1;
	}
	public void setMember1(int member1) {
		this.member1 = member1;
	}
	public int getMember2() {
		return member2;
	}
	public void setMember2(int member2) {
		this.member2 = member2;
	}
	
	
}

class Child extends Parent{
	private int member3;
	
	public Child() {
		System.out.println("Child()기본생성자 호출");		
	}
	
	public Child(int member1, int member2, int member3) {
		// case 1
		super(member1, member2);
		//case 2
		//this.setMember1(member1);
		//this.setMember2(member2);
		
		this.member3 = member3;
		
	
		System.out.println("Child(int member1, int member2, int member3)기본생성자 호출");
	}
	
	
	
	@Override
	public void print() {
		// TODO Auto-generated method stub
		super.print();
		System.out.println("\t number3 :: " + this.member3);
	}

	public int getMember3() {
		return member3;
	}

	public void setMember3(int member3) {
		this.member3 = member3;
	}
}

public class ParentChildConstructorMain {
	public static void main(String[] args) {
		System.out.println("------------Child()생성자----------------");
		Child c1 = new  Child();
		Child c2 = new  Child(1,2,3);
		c2.print();
	}
}
