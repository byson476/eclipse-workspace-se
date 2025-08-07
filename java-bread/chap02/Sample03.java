package chap02;

public class Sample03 {
	public static void main(String[] args) {
		System.out.println("논리곱 & ");
		System.out.println(1==1 & 2==3);
		System.out.println(1==2 & 2==3);
		System.out.println(1==1 & 2==2);
		
		System.out.println("논리합 | ");
		System.out.println(1==1 | 2==3);
		System.out.println(1==2 | 2==3);
		System.out.println(1==1 | 2==2);
		
		System.out.println("배타논리합 ^ ");
		System.out.println(1==1 ^ 2==3);
		System.out.println(1==2 ^ 2==3);
		System.out.println(1==1 ^ 2==2);
		
		System.out.println("논리부정 ! ");
		System.out.println(!(1==1));
		System.out.println(!(1==2));
	}
}
