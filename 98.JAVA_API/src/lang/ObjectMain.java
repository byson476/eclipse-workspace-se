package lang;

public class ObjectMain {
	public static void main(String[] args) {
		Object o1 = new Object();
		Object o2 = new Object();
		Object o3 = o1;
		
		System.out.println("-------- toStirng---------");
		System.out.println(o1.toString());
		System.out.println(o2.toString());
		System.out.println(o3.toString());
		
		System.out.println("--------------equals---------");
		if(o1.equals(02))
			System.out.println("o1과 o2의 주소가 동일하다");
		else
			System.out.println("o1과 o2의 주소가 동일하지 않다");
		if(o1==o3)
			System.out.println("o1과 o3의 주소가 동일하다");
		else
			System.out.println("o1과 o3의 주소가 동일하지 않다");
	}
}
