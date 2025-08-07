package chap16;

import java.util.function.Supplier;

public class Sample05 {
	public static void main(String[] args) {
		MessageCenter mc = new MessageCenter("안녕~아기들~!");
		MessageCenter main = getMsg(()->mc);
		System.out.println(main);
	}

	public static MessageCenter getMsg(Supplier<MessageCenter> mc) {
		// TODO Auto-generated method stub
		return mc.get();
	}
}

class MessageCenter{
	private final String msg;
	
	public MessageCenter(String msg) {
		this.msg = msg;
	}

	public String toString() {
		return msg;
	}
}