package chap16;

public class Sample03 {
	public static void main(String[] args) {
		Sample03Function r = (t) -> {
			String result = "";
			for(int i=0; i<t; i++) {
				result += "만세\n";
			}
			return result;
		};
		System.out.println("만세삼창\n");
		System.out.println(r.test(3));
	}
}

interface Sample03Function{
	public abstract String test(int times);
}