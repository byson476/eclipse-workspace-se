package chap09;

public class GasolineCar extends Car{
	public GasolineCar(String color, String manufacturer)
	{
		super(color, manufacturer);
	}
	public String fillUp() {
		// TODO Auto-generated method stub
		return "휘발유를 주유합니다.";
	}
}
