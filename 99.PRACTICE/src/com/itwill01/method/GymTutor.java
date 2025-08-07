package com.itwill01.method;

public class GymTutor {
	private String name;
	private int height;
	private int weight;
	private int age;
	private String type;
	private String sex;
	
	public void print() {
		System.out.printf("키가 %d이고 몸무게가 %d키로인 %s, 이름은 %s이고 나이는 %d이며 %s담당입니다.\n", this.height, this.weight, this.sex, this.name, this.age, this.type);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	
}
