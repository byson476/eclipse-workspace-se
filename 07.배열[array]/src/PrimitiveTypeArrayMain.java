/*
 배열:  
      - 같은데이타형을 가진 멤버필드(기억장소) 여러개를 멤버로 가지는 타입 
      - 배열타입변수의 선언형식
           데이타타입[] 변수이름;  ex> int[] ia; , char[] ca;
	  - 사용: 
	       1.배열타입객체의생성
	         - int[] a = new int[5];	
		   2.배열객체멤버필드의 초기화 
      -특징   
		  1.모든 배열[]형의 변수는 참조변수이다.
		    (배열은 객체다.)
		  2.같은타입만 정의가가능하다 
		  3.길이가 고정되어있다. 
		 
 */
public class PrimitiveTypeArrayMain {
	public static void main(String[] args) {
		int intType;
		intType = 90;
		
		int[] intArray;
		intArray = new int[5];
		System.out.println("intArray배열 주소값 : " + intArray);
		intArray[0] = 11;
		intArray[1] = 22;
		intArray[2] = 33;
		intArray[3] = 44;
		intArray[4] = 55;
		
		System.out.println(intArray[0]);
		System.out.println(intArray[1]);
		System.out.println(intArray[2]);
		System.out.println(intArray[3]);
		System.out.println(intArray[4]);
		
		System.out.println("========== FOR ============");
		for(int i=0; i<5; i++) {
			System.out.println(intArray[i]);
		}
		/*
		  << 배열의 크기 >>
		  - 모든배열객체는 public int length;를 멤버변수로가진다.
		  - 배열의 크기를 가지고있는 변수이다
		  - 변경불가능(상수)
		 */	
		System.out.println("intArray배열 객체의 멤버필드 수 : " + intArray.length);
		for(int i=0; i<intArray.length; i++) {
			System.out.println(intArray[i]);
		}
		System.out.println("=======기본형 1차원 배열 ==========");
		System.out.println("=======int[]============");
		int[] korArray = new int[10];
		korArray[0] = 89;
		korArray[1] = 56;
		korArray[2] = 99;
		korArray[3] = 78;
		korArray[4] = 90;
		korArray[5] = 92;
		korArray[6] = 67;
		korArray[7] = 23;
		korArray[8] = 71;
		korArray[9] = 19;
		for (int i = 0; i < korArray.length; i++) {
			System.out.println(korArray[i]);
		}
		System.out.println();
		int korTot = 0;
		for (int i = 0; i < korArray.length; i++) {
			korTot += korArray[i];
		}
		System.out.println("국어 총점 : " + korTot);
		System.out.println("국어 평균 : " + (double)korTot/korArray.length);
		System.out.println();
		System.out.println("=========char[]==========");
		char[] ca = new char[6];
		ca[0] = 'H';
		ca[1] = 'e';
		ca[2] = 'l';
		ca[3] = 'l';
		ca[4] = 'o';
		ca[5] = '!';
		for (int i = 0; i < ca.length; i++) {
			System.out.print(ca[i]);
		}
		System.out.println();
		System.out.println("=========double[]==========");
		double[] da = new double[5];
		da[0] = 1.1;
		da[1] = 2.2;
		da[2] = 3.3;
		da[3] = 4.4;
		da[4] = 5.5;
		
		for (int i = 0; i < da.length; i++) {
			System.out.print(da[i]);
			if(i==da.length-1)
				continue;
			System.out.print(" , ");
		}
		
		System.out.println("===== enhanced FOR =======");
		System.out.println(">>>>> int[]");
		for (int tempKor : korArray) {
			System.out.print(tempKor + ", ");
		}
		System.out.println();
		System.out.println(" >>>>> char[]");
		for (char tempCa : ca) {
			System.out.print(tempCa);
		}
		for (double d : da) {
			System.out.println(d);
		}
		
	}
}
