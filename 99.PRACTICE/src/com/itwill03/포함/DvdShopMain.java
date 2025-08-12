package com.itwill03.포함;

public class DvdShopMain {

	public static void main(String[] args) {
		/*
		 * 회원객체생성
		 */
		DvdMember dvdMember = new DvdMember(1, "고길동", "111-1111", null);
		/*
		 * Dvd객체생성
		 */
		Dvd dvd = new Dvd(3, "동물의 왕국", "자연");
		/*
		 * 회원이Dvd을 대여
		 * 
		 * Dvd객체참조변수를 회원의 멤버변수에대입
		 */
		dvdMember.setRentDvd(dvd);
		/*
		 * 회원정보출력(회원이빌린Dvd정보출력)
		 */
		dvdMember.print();
	}

}
