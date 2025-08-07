package chap12;

public class Sample02 {
	public static void main(String[] args) {
		System.out.printf("경진이가 %s의 %s티를 입고 있습니다.", Size1.LARGE, Color1.BLUE);
	}
}

enum Color1{
	RED{
		public String toString() {
			return "빨간색";
		}
	},
	BLUE{
		public String toString() {
			return "파란색";
		}
	},
	ORAGE{
		public String toString() {
			return "주황색";
		}
	}
}

enum Size1{
	SMALL{
		public String toString() {
			return "작은 사이즈";
		}
	},
	MIDIUM{
		public String toString() {
			return "중간 사이즈";
		}
	},
	LARGE{
		public String toString() {
			return "큰 사이즈";
		}
	}
}