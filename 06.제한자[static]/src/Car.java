
public class Car {
	private static int count; //생산된 차량객체의 수를 저장한 공용(정적)변수
	private int no; //차량번호
	private String model; //차량모델
	private String color; //차량색상
	
	public Car(int no, String model, String color) {
		this.no = no;
		this.model = model;
		this.color = color;
		Car.count++;
	}

	public static void headerPrint() {
		System.out.println("-----------------");
		System.out.println("번호 모델    색상");
		System.out.println("-----------------");		
	}
	
	public void print() {
		System.out.println(" " + no + "   " + model + "    " + color);
	}
	
	public static void setCount(int count) {
		Car.count = count;
	}
	
	public static int getCount() {
		return Car.count;
	}
	
	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
}
