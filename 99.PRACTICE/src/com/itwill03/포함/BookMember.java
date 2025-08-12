package com.itwill03.포함;
public class BookMember {
    private int no; //회원번호
    private String name; //회원이름
    private String phoneNum; //전화번호
    private Book rentBook; //빌린책
    private Book[] books;//빌린책들
	/*
	<<기능>>
	  회원정보출력 
	 */
    
    public BookMember() {}
	public BookMember(int no, String name, String phoneNum, Book rentBook) {
		super();
		this.no = no;
		this.name = name;
		this.phoneNum = phoneNum;
		this.rentBook = rentBook;
	}
	
	public void print(){
		System.out.println(">>회원정보");
		System.out.println(this.no + "\t" + this.name + "\t" + this.phoneNum);
		System.out.println(">>" + this.name + "님의 대출도서목록");
		if(this.rentBook !=null)
			this.rentBook.print();
    }
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	public Book getRentBook() {
		return rentBook;
	}
	public void setRentBook(Book rentBook) {
		this.rentBook = rentBook;
	}
	public void setBooks(Book[] books) {
		this.books = books;
		
	}
	public Book[] getBooks() {
		return books;
		
	}
    
}
