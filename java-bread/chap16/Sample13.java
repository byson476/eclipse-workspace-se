package chap16;

public class Sample13 {
	public static void main(String[] args) {
		BiTest test = (a,b) -> a+"와" +b +"가 인자로 넘어왔습니다.";
		
		String a = "쇼팽";
		String b = "라벨";
		System.out.println(test.apply(a, b));
	}
}
interface BiTest{
	abstract String apply(String a, String b);
}