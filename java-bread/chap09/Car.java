package chap09;
//Sample01
public abstract class Car{
	protected String color;
	protected String manufacturer;
	
	public Car(String color, String manufacturer) {
		this.color = color;
		this.manufacturer = manufacturer;
	}

	public abstract String fillUp();
	
	public void printInfo() {
		System.out.println("이 차의 색: " + this.color);
		System.out.println("이 차는 " + fillUp());
		System.out.println("이 차는 " + this.manufacturer + "에서 생산합니다");
	}
	
	public String getColor() {
		return color;
	}
	
	public String getManufacturer() {
		return manufacturer;
	}
}
