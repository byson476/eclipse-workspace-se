package chap08;

public class Sample02 {
	public static int total = 0;
	public static void main(String[] args) {
		System.out.printf("결과 : %d\n ", sum(1,2,3,4,5));
		
	}
	public static int sum(int ... a) {
		for(int i : a) {
			System.out.println("i -" +i);
			total +=i;
			System.out.println("total -" +total);
		}
			
		return total;
	}
}
