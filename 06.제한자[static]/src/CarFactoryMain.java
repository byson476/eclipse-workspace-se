
public class CarFactoryMain {
	public static void main(String[] args) {
		/****
		//public static int count;일 경우
		System.out.println("차량 생산 대수 : " + Car.count);
		Car.count = 0;
		Car car1 = new Car(1, "SM7", "RED");
		Car car2 = new Car(2, "BMW", "WHITE");
		Car car3 = new Car(3, "SM8", "BLACK");
		System.out.println("차량 총생산 대수 : " + Car.count);
		*/
		//private static int count; 일 경우
		System.out.println("차량 생산 대수 : " + Car.getCount());
		Car.setCount(0);
		Car car1 = new Car(1, "SM7", "RED");
		Car car2 = new Car(2, "BMW", "WHITE");
		Car car3 = new Car(3, "SM8", "BLACK");
		System.out.println("차량 총생산 대수 : " + Car.getCount());
		Car.headerPrint();
		car1.print();
		car2.print();
		car3.print();
	}
}
