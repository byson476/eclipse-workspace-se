//단항연산자
public class OperatorUnary {

	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		int ar= -a;
		int br= +b;
		System.out.println("=====산술연산자(부호연산자)======");
		System.out.println(a);
		System.out.println(a);
		System.out.println(b);
		System.out.println(ar);
		System.out.println(br);
		
		System.out.println("=====논리연산자(부정연산자)======");
		boolean myTurn = true;
		System.out.println(myTurn);
		myTurn = !myTurn;
		System.out.println(myTurn);
		myTurn = !myTurn;
		System.out.println(myTurn);
		/*
		 * 증가,감소 연산자
		 * 	- 항은 반드시 변수이여야한다. ( a++ )
		 *  - 형태: ++,--
		 *  - 항변수의값을 정수1 만큼 증가(감소)시킨후 항변수에 대입 
 		 */
		System.out.println("=====[++i, --j]======");
		int i = 5;
		int j = 5;
		++i; // i= i+1;
		--j;// j= j-1;
		System.out.println(i);
		System.out.println(j);
		System.out.println("=====[i++, j--]======");
		i = 5;
		j = 5;
		i++; // i= i+1;
		j--;// j= j-1;
		System.out.println(i);
		System.out.println(j);
		System.out.println("=====[++i1, i2++]======");
		int i1 = 5;
		int i2 = 5;
		int i1r = ++i1; // i1 = i1+1 --> i1r=i1;
		int i2r = i2++; // i2r = i2; --> i2=i2+1
		System.out.println(i1 + "--- " + i1r);
		System.out.println(i2 + "--- " + i2r);
	}

}
