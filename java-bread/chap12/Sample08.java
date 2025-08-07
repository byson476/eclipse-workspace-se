package chap12;

public class Sample08 {
	public static void main(String[] args) {
		Compute.DEVIDE.getResult(10,2);
	}
}

enum Compute{
	PLUS{
		void getResult(int a, int b) {
			System.out.printf("%d + %d = %d", a, b, a+b);
		}
	},
	MINUS{
		void getResult(int a, int b) {
			System.out.printf("%d - %d = %d", a, b, a-b);
		}
	},
	TIMES{
		void getResult(int a, int b) {
			System.out.printf("%d * %d = %d", a, b, a*b);
		}
	},
	DEVIDE{
		void getResult(int a, int b) {
			System.out.printf("%d / %d = %d", a, b, a/b);
		}
	};
	abstract void getResult(int a, int b);
}