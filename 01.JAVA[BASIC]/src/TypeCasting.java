//연산시 형변환
public class TypeCasting {

	public static void main(String[] args) {
		//자동형변환 promotion, up-casting
		int i1 = 56;
		long l1 = i1;
		double d1 = i1;
		
		//자동형변환 안되는 경우 -->큰 데이터를 작은 데이터타입변수에 넣을때 컴파일 에러넘
		//강제형변환 casting  하면 됨
		double avgd = 85.32;
		int avgi = (int)avgd;
		System.out.println(avgd);
		System.out.println(avgi);
		
		//연산시의 형변환 - 연산항들 중에 가장 큰 타입으로 모든 항들이 자동현변환(promotion)된 후 연산
		int ii = 100;
		double dd = 0.1;
		double result = ii + dd;
		System.out.println(result);
		result = ii + 36 + i1 + l1 + 0.2;
		System.out.println(result);
		
	}

}
