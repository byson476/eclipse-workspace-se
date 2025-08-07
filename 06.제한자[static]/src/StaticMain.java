
public class StaticMain {
	public static void main(String[] args) {
		//정적 멤버접근 방법 : 클래스이름.정적멤버(필드,메쏘드)이름
		System.out.println(Static.static_field);
		Static.static_field = 8888;
		System.out.println(Static.static_field);
		Static.static_method();
		System.out.println("====인스턴스 멤버 Access=====");
		
		Static static1 = new Static();
		System.out.println(">>>>static1 객체 주소 : " + static1);
		static1.instance_field = 1111;
		static1.instance_method();
		Static static2 = new Static();
		System.out.println(">>>>static2 객체 주소 : " + static2);
		static2.instance_field = 2222;
		static2.instance_method();
	}
}
