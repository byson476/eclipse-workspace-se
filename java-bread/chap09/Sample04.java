package chap09;

public class Sample04 {
	public static void main(String[] args) {
		ICompute a= new Apartment();
		float area = a.compute(24);
		System.out.printf("아파트의 면적은 %f 제곱미터입니다", area);
	}
}
class Apartment implements ICompute{
	public float compute(int area)
	{
		return area * pyung;
	}
}
abstract interface ICompute{
	float pyung = 3.3f;
	float compute(int area);
}
