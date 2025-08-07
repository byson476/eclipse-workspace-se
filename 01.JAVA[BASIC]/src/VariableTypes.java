
public class VariableTypes {

	public static void main(String[] args) {
		int i1, i2, i3, i4, i5, i6;
		i1 = 88;
		i2 = 99;
		i3 = i1;
		i4 = 2147483647;
		i5 = 0b011111111111111111111111111111111;
		
		System.out.println(i1);
		System.out.println(i2);
		System.out.println(i3);
		System.out.println(i4);
		System.out.println(i5);
		
		long l1 = 232;
		long l2 = 2147483648L;
		System.out.println(l1);
		System.out.println(l2);
		
		float f1 = 0.1F;
		double d1, d2, d3;
		d1 = 3.14159;
		d2 = 123456789123456789.0;
		d3 = 1.23456789123456789;
		System.out.println(f1);
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
		
		char c1;
		c1 = 'A';
		char c2 = '가';
		char c3 = '힣';
		char c4 = '1';
		char c5 = c1;
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(c5);
		
		char m1, m2, m3, m4, m5, m6, m7, m8;
		m1 = 'A';
		m2 = 65;
		System.out.println(m1);
		System.out.println(m2);
		int i22=65;
		//m2 = i22;  --> 상수가 아닌 변수 이므로 error
		
		
		m3 = 0xAC09;
		m4 = '\uAC00';
		m5='가';
		m6=44032; // 65535넘어가면 error
		System.out.println(m3);
		System.out.println(m4);
		System.out.println(m5);
		System.out.println(m6);	
		
		int hangulCount = c3-c2+1;
		System.out.println("한글 조합 글자수 : " + hangulCount);
		
		boolean bool1 = true;
		boolean bool2 = false;
		boolean bool3 = true;
		boolean bool4 = bool1;
		
		System.out.println(bool1);
		System.out.println(bool2);
		System.out.println(bool3);
		System.out.println(bool4);
		
		String str1 = "오늘은";//heap메모리가 다하는 순간까지 문자열을 넣을 수 있음
		String str2 = "월요일";
		String str3 = "타입을 \"공부\"합니다";
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		//문자열 결합연산자 : +
		String  str4 = str1 + " " + str2 + " "  + str3;
		System.out.println(str4);
		System.out.println(str1 + " " + str2 + " 언제 한주가 가나");
		
		String name = "김경호";
		int age  = 34;
		char gender = '남';
		double height = 182.5;
		double weight = 75.3;
		boolean isMarried = true;
		
		System.out.println("----------------------------------");
		System.out.println("이름   나이 성별   키   체중 결혼유무");
		System.out.println("----------------------------------");
		System.out.println(name + " " + age + "   " + gender + "   " + height + "  " + weight + "  " +  isMarried);
		System.out.println("----------------------------------");
	}

}
