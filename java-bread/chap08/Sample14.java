package chap08;

import java.util.Scanner;

public class Sample14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int idx = 0;
		Friend[] friends = new Friend[6];
		friends[idx++] = new Friend("둘리", 60, "000-0000-0001");
		friends[idx++] = new Friend("또치", 61, "000-0000-0002");
		friends[idx++] = new Friend("도우너", 62, "000-0000-0003");
		friends[idx++] = new Friend("희동", 63, "000-0000-0004");
		friends[idx++] = new Friend("금자", 64, "000-0000-0005");
		friends[idx++] = new Friend("길동", 65, "000-0000-0006");
		System.out.println();
		System.out.println(" === LIST ===");
		for(Friend friend : friends)
			System.out.println(friend.getName());
		
		do {
			System.out.println("신상을 알고싶은 사람의 이름을 입력해주새요");
			String in = sc.next();
			if("0".equals(in)) {
				System.out.println("종료합니다");
				break;
			}
			else {
				for(Friend friend : friends) {
					if(friend.getName().equals(in))
						System.out.println(friend.getName() + "   " +  friend.getAge() + "   " + friend.getPhone() + "\n");
				}
			}
				
		}while(true);
	}

}

class Friend{
	private String name;
	private int age;
	private String phone;
	
	public Friend(String name, int age, String phone) {
		this.name = name;
		this.age = age;
		this.phone = phone;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getPhone() {
		return phone;
	}
}

