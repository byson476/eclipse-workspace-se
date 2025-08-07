//관계연산자
public class OperatorRelational {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		
		boolean result = a>b;
		System.out.println(result);
		
		result = a<b;
		System.out.println(result);
		
		result = a<=b;
		System.out.println(result);
		
		result = a>=b;
		System.out.println(result);
		
		result = a==b;
		System.out.println(result);
		
		result = a!=b;
		System.out.println(result);
		
		//문자열 비교
		char ca = 'q';
		char cb = 'b';
		result = ca>cb;
		System.out.println(result);

		result = (ca-cb)>0;
		System.out.println(result);
		
		result = '가'>'나';
		System.out.println(result);

		result = ('가'-'나')>0;
		System.out.println(result);
		
		System.out.println('가'-'나');
	}

}
