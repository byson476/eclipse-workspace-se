
public class OverLoadingMain {
	public static void main(String[] args) {
		OverLoading overLoading = new OverLoading();
		overLoading.method();
		overLoading.method(123);
		overLoading.method("문자열1");
		overLoading.method(123, 124);
		overLoading.method(123, "문자열2");
		overLoading.method("문자열3", 554);
	}
}
