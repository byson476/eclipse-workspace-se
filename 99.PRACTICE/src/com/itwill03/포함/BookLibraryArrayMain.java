package com.itwill03.포함;

public class BookLibraryArrayMain {
	public static void main(String[] args) {

		/*
		 * 회원객체생성
		 */
		BookMemberArray bookMember1 = new BookMemberArray(1, "홍길동", "000-0000", null);
		BookMemberArray bookMember2 = new BookMemberArray(2, "고길동", "222-2222", null);

		/*
		 * 책객체생성
		 */
		Book book1 = new Book(1, "자바1", "컴퓨터", "어렵다");
		Book book2 = new Book(2, "자바2", "컴퓨터", "어렵다");
		Book book3 = new Book(3, "자바3", "컴퓨터", "어렵다");
		
		Book[] books = {book1, book2, book3};
		System.out.println(books);
		bookMember1.setBooks(books);
		bookMember1.print();
		
		bookMember2.setBooks(null);
		bookMember2.print();
	}
}
