package com.itwill03.포함;
public class Dvd {
    private int no; //번호
    private String title; //타이틀
    private String genre; //쟝르

    public Dvd() {}
	public Dvd(int no, String title, String genre) {
		super();
		this.no = no;
		this.title = title;
		this.genre = genre;
	}
	/*
	 * <<기능>>
	 *   Dvd정보출력 
	 */
	public void print() {
		System.out.println("\t" + this.no + "\t" + this.title + "\t" + this.genre);
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
	
	
}
