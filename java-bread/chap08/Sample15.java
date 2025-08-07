package chap08;

public class Sample15 {
	public static void main(String[] args) {
		System.out.println(concat("학교종이", "땡땡땡"));
		System.out.println(concat("객체지향", "패키지", "클래스", "객체", "접근제어자", "츨차"));
	}

	private static String concat(String... words) {
		String result = "";
		for(String w : words)
			result += w;
		return result;
	}
	
}
