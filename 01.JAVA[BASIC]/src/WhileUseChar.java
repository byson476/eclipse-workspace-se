
public class WhileUseChar {

	public static void main(String[] args) {
		char c1 = 0;
		while(c1<65535) {
			System.out.print(c1);
			c1++;
			if(c1%100==0)
				System.out.println();
		}
		System.out.println();
		/*
		 * 영문소문자 출력
		 */
		char c2 = 'a';
		int i=0;
		while(c2<='z') {
			System.out.print(c2 +" ");
			if((i+1)%5==0)
				System.out.println();
			c2++;
			i++;
		}

	}

}
