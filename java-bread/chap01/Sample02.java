package chap01;

public class Sample02 {
	public static void main(String args[]) {
		char chr = 'A';
		System.out.println("char : " + chr);
		System.out.println("Encoding : " + (int)chr);
		System.out.println("Decoding : " + (char)65);
		
		char j = 74;
		char a = 97;
		char v = 118;
		
		System.out.printf("%c%c%c%c", j, a, v, a);
	}
}
