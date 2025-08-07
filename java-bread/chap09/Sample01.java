package chap09;

public class Sample01 {
	public static void main(String[] args) {
		ElectricCar car1 = new ElectricCar("Black", "현대");
		car1.printInfo();
		System.out.println("====================================");
		GasolineCar car2 = new GasolineCar("White", "기아");
		car2.printInfo();
	}
}
