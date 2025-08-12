package com.itwill03.포함;
public class Book {
    private int no; //책번호
    private String title; //책제목
    private String genre; //책분류
    private String detail; //책설명
	/*
	 * - 생성자를 정의하세요
	 * 
	 * 
	 * <<기능>>
	 *   책정보출력
	 *   
	 */
    public Book() {}
    
	public Book(int no, String title, String genre, String detail) {
		super();
		this.no = no;
		this.title = title;
		this.genre = genre;
		this.detail = detail;
	}
	
	public void print() {
		System.out.println("\t" + this.no + "\t" + this.title + "\t" + this.genre + "\t" + this.detail);
	}
	
	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}
	
    
}
