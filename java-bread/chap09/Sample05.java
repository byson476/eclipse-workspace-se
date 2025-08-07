package chap09;

public class Sample05 {
	public static void main(String[] args) {
		Villa a=  new Villa();
		float area = a.compute(30);
	}
}
class Villa implements IExcute{

	public float compute(int area) {
		// TODO Auto-generated method stub
		return area*pyung;
	}
	
}

abstract interface IExcute{
	float pyung = 3.3f;
	float compute(int area);
	default float toPyung(float area) {
		return area/pyung;
	}
}