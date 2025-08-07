package chap08;
//Sample11
public class PrintServiceImpl {
	public static DataServiceImpl data = new DataServiceImpl();
	public void bringMessage() {
		System.out.printf("안녕~~ %s", data.getName());
	}
}
