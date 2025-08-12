class FinalFieldClass{
	public final static int PORT_NUMBER = 80;//static없으면 생성자에서 값 변경 가능
	public final static double INCENTIVE_RATE = 0.1;//static없으면 생성자에서 값 변경 가능
	public final static double PI = 3.1415;
	public final static int EARTH_RADIUS = 66400;
	
}
public class FinalFieldClassMain {
	public static void main(String[] args) {
		/*
		 * The final field FinalFieldClass.PORT_NUMBER cannot be assigned
		 
		FinalFieldClass.PORT_NUMBER = 81;
		FinalFieldClass.INCENTIVE_RATE = 0.3;
		FinalFieldClass.PI = 3.15;
		FinalFieldClass.EARTH_RADIUS = 5000;
		*/
		System.out.println(FinalFieldClass.PORT_NUMBER);
		System.out.println(FinalFieldClass.INCENTIVE_RATE);
		System.out.println(FinalFieldClass.PI);
		System.out.println(FinalFieldClass.EARTH_RADIUS);
			
		System.out.println("--------MATH------------");
		/*The final field Math.PI cannot be assigned
		 * 
		 
		Math.PI = 3.111;
		Math.E = 3.111;
		*/
		System.out.println(Math.PI);
	}
}
