
public class CarConstructorMain {
	public static void main(String[] args) {
		System.out.println("========c1==========");
		Car car1 = new Car();
		car1.setIpChaData("1234", 10);
		car1.setOutTime(12);
		car1.calculateFee();
		car1.headerPrinter();
		car1.print();
		
		System.out.println("========c2==========");
		Car car2 = new Car("4567", 11);
		car2.setOutTime(13);
		car2.calculateFee();
		car2.headerPrinter();
		car2.print();
		
		System.out.println("======오늘 주차장 이용 차량 출력=====");
		Car cara = new Car("1234", 12, 13, 1000);
		Car carb = new Car("4543", 4, 5, 1000);
		Car carc = new Car("3388", 14, 16, 2000);
		Car card = new Car("8909", 1, 9, 9000);
		cara.headerPrinter();
		cara.print();
		carb.print();
		carc.print();
		card.print();
	}
}
