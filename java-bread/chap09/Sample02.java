package chap09;

public class Sample02 {
	public static void main(String[] args) {
		ElectricCar car1 = new ElectricCar("Black", "현대");
		car1.printInfo();
		System.out.println("====================================");
		car1.setColor("White");;
		car1.printInfo();
	}
}
