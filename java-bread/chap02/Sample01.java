package chap02;

public class Sample01 {
	public static void main(String[] args) {
		int apple = 10;
		int people = 2+1;
		int rmainder = apple % people;
		
		System.out.println("나머지 : " + rmainder);
		
		int inc = 1;
		System.out.println("전치 증가연산자 : " + ++inc);
		
		int dec = 1;
		System.out.println("전치 감가연산자 : " + ++dec);

		int inc1 = 1;
		System.out.println("후치 증가연산자 : " + inc1++);
		System.out.println(inc1);
		
		int dec1 = 1;
		System.out.println("전치 감가연산자 : " + dec1++);
		System.out.println(dec1);
	}
}
