package com.itwill01.method;

public class DeliveryMain {
	public static void main(String[] args) {
		Delivery delivery = new Delivery();
		delivery.setOrderNo("202011020003");
		delivery.setCelNo("01023450001");
		delivery.setAddress("서울시 강남구 역삼동 111-333");
		delivery.setDate("20201102");
		delivery.setTime("130258");
		delivery.setPrice(35000);
		delivery.setMenuNo("0003");
		delivery.print();	
	}
}
