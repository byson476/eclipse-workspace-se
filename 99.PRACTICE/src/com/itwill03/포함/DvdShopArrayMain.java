package com.itwill03.포함;

public class DvdShopArrayMain {

	public static void main(String[] args) {
		/*
		 * 회원객체생성
		 */
		DvdMemberArray dvdMemberArray1 = new DvdMemberArray(1, "홍길동", "000-0000", null);
		DvdMemberArray dvdMemberArray2 = new DvdMemberArray(2, "고길동", "222-2222", null);
		/*
		 * Dvd객체생성
		 */
		Dvd dvd1 = new Dvd(4, "동물의 왕국", "자연");
		Dvd dvd2 = new Dvd(5, "자연은 살아있다", "자연");
		Dvd dvd3 = new Dvd(6, "동물천국", "자연");
		Dvd dvd4 = new Dvd(7, "디뷔디", "자연");

		dvdMemberArray1.setDvds(null);
		dvdMemberArray1.print();
		
		Dvd[] dvds = {dvd1, dvd2, dvd3, dvd4};
		dvdMemberArray2.setDvds(dvds);
		dvdMemberArray2.print();
		if(dvds.length>3)
			System.out.println("\t DVD는 3개이상 빌릴 수 없습니다.");		

		
	}

}
