package com.itwill04.array.car;

public class CarArrayMain {

	public static void main(String[] args) {
		
		Car[] carArray= {
			null,null,new Car("5654", 8),null,null,
			new Car("3422", 12),null,null,null,null,
			null,null,null,null,new Car("7789", 11),
			null,new Car("1120", 10),null,null,null,
			null,new Car("2389", 9),null,null,null,
			null,null,null,null,new Car("5555", 6)
		};
		/*
		 null.메쏘드() --> NullPointerException 
		 */
		System.out.println("1.전체차량출력");
		Car.headerPrint();
		for (int i = 0; i < carArray.length; i++) {
			if(carArray[i]!=null) {
				carArray[i].print();
			}
		}
		System.out.println("2.전체주차구획수");
		System.out.println(">> ");
		System.out.println("3.주차가능주차구획수");
		int parkingCount=0;
		System.out.println(">>"+parkingCount);
		System.out.println("4.입차(차량번호 7777번 14시 입차)");
		/*
		 * 1. 차량객체생성
		 * 2. 빈자리찾아서 대입
		 */
		System.out.println("5.차량번호 7789번  차한대 정보출력");
		System.out.println("6.입차시간 10시이후 차량여러대 찾아서 정보출력");
		System.out.println("7.2389번차량 18시 출차");
		/*
		 1.2389번 차량 찾기
		 2.출차(나가는시간대입,요금계산)
		 3.영수증출력
		 4.2389번차량 주차장에서 삭제
		 */
		System.out.println("99. 2389번차량 출차후전체 차량출력");
		Car.headerPrint();
		for(int i=0;i<carArray.length;i++) {
			if(carArray[i]!=null) {
				carArray[i].print();
			}
		}
	}

}