package chap11;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Sample02 {
	static List<String> list1 = new ArrayList<>();
	static List<String> list2 = new LinkedList<>();
	
	public static void main(String[] args) {
		list1.add("dog1");
		list1.add("cat1");
		list1.add("tiger1");
		list1.add("lion1");

		list2.add("dog2");
		list2.add("cat2");
		list2.add("tiger2");
		list2.add("lion2");
		
		list1.add(2, "goat1");
		list2.add(2, "goat2");
		toString("중간삽입");
		
		list1.remove(2);
		list2.remove(2);
		toString("중간삭제");
	}
	
	public static void toString(String title) {
		System.out.printf("%n== %s ==%n", title);
		System.out.print("ArrayList : " + list1);
		System.out.print("LinkedList : " + list2);
	}
}
