
public class IfTest2 {

	public static void main(String[] args) {
		int a = 21;
		int b = 30;
		if (a > b) {
			System.out.println("20>30 -> true");
		} else {
			System.out.println("20>30 -> false");
		}

		if (a < b) {
			System.out.println("20<30 -> true");

		} else {
			System.out.println("20<30 -> false");
		}

		if(a!=b)
			System.out.println("20!=30 -> true");
		
		if(a==b)
			System.out.println("20==30 -> false");
		
		int kor = 98;
		if(kor>=90)
		{
			char grade = 'A';
			String msg = "참 잘했어요";
			System.out.println("kor :: " + kor);
			System.out.println("grade :: " + grade);
			System.out.println("msg :: " + msg);
		}
	}

}
