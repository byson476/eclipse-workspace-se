
public class CarEngineFactoryMain {
	public static void main(String[] args) {
		Engine x6Engine = new Engine("A", 5000);
		Car car1 = new Car();
		car1.setNo(1);
		car1.setModel("X6");
		car1.setEngine(x6Engine);
		car1.print();
		
		Car car2 = new Car(2, "X5", new Engine("B", 3000));
		car2.print();
		
		System.out.println("-------차량엔진검사--------");
		Engine car1ReturnEngine = car1.getEngine();
		car1ReturnEngine.print();
		car2.getEngine().print();
	}
}
