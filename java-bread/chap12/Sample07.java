package chap12;

import java.util.EnumSet;

public class Sample07 {
	public static void main(String[] args) {
		EnumSet<Season> seasonSet = EnumSet.allOf(Season.class);
		for(Season season : seasonSet)
			System.out.printf("%s \n %s %s \n", season.name(), season.getHan(), season.getEng());
	}
}

enum Season{
	SPRING("봄", "(Spring)"),
	SUMMER("여름", "(SUMMER)"),
	AUTUMN("가을", "(AUTUMN)"),
	WINTER("겨울", "(WINTER)");

	private final String han;
	private final String eng;
	Season(String han, String eng) {
		this.han = han;
		this.eng = eng;
	}
	public String getHan() {
		return han;
	}
	public String getEng() {
		return eng;
	}
}