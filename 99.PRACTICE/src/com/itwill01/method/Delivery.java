package com.itwill01.method;

public class Delivery {
	private String orderNo;
	private String celNo;
	private String address;
	private String date;
	private String time;
	private int price;
	private String menuNo;
	
	public void print() {
		System.out.println("주문 접수 번호 : " + orderNo);
		System.out.println("주문 핸드폰 번호 : " + celNo);
		System.out.println("주문 집 주소 : " + address);
		System.out.println("주문 날짜 : " + date);
		System.out.println("주문 시간 : " + time);
		System.out.println("주문 가격 : " + price);
		System.out.println("메뉴 번호 : " + menuNo);
	}
	
	public String getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public String getCelNo() {
		return celNo;
	}
	public void setCelNo(String celNo) {
		this.celNo = celNo;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getMenuNo() {
		return menuNo;
	}
	public void setMenuNo(String menuNo) {
		this.menuNo = menuNo;
	}
	
	
}
