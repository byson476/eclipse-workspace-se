package com.itwill01.method;

public class GymTutorMain {
	public static void main(String[] args) {
		GymTutor gymTutor1 = new GymTutor();
		gymTutor1.setHeight(180);
		gymTutor1.setWeight(78);
		gymTutor1.setSex("남성");
		gymTutor1.setName("Tomas");
		gymTutor1.setAge(37);
		gymTutor1.setType("PT");
		gymTutor1.print();
		
		GymTutor gymTutor2 = new GymTutor();
		gymTutor2.setHeight(170);
		gymTutor2.setWeight(50);
		gymTutor2.setSex("여성");
		gymTutor2.setName("Alice");
		gymTutor2.setAge(26);
		gymTutor2.setType("요가");
		gymTutor2.print();
	}
}
