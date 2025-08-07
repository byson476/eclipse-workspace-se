package chap09;
//Sample01, Sample02
public class ElectricCar extends Car{

	public ElectricCar(String color, String manufacturer)
	{
		super(color, manufacturer);
	}

	public String fillUp() {
		// TODO Auto-generated method stub
		return "전기를 출전합니다.";
	}

	public void setColor(String color) {
		this.color = color;
	}
}
