package chap13;

import java.text.CompactNumberFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class Sample03 {
	public static void main(String[] args) {
		int users = 14638;
		int views = 1500;
		/*
		NumberFormat nf = CompactNumberFormat.getCompactNumberInstance();
		System.out.printf("너빨대 구독자수 %s\n", nf.format(users));
		System.out.printf("자바영상 구독자수 %s\n", nf.format(views));
		*/
		Locale lo = new Locale("ko", "kr", "win");
		System.out.println(lo);
		System.out.println("\n Using Builder1");
		Locale loBuilder1 = new Locale.Builder().setLocale(new Locale("ko", "kr")).setLanguage("en").build();
		System.out.println(loBuilder1);
		
		System.out.println("\n Using Builder2");
		Locale loBuilder2 = new Locale.Builder().setLanguage("en").setRegion("kr").build();
		System.out.println(loBuilder2);
	}
}
