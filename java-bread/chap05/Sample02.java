package chap05;

import java.util.Arrays;

public class Sample02 {
	public static void main(String[] args) {
		int[][] household = new int[5][3];
		household[1] = new int[1];
		for(int i=0; i<household.length; i++)
			System.out.printf(i+1 + "번째층 %d세대 \n" ,household[i].length);
		
		String name = "우영|보연|원빈|창준|경진";
		String arr[] = name.split("\\|");
		for(int i=0; i<arr.length; i++)
			System.out.println("이름은 " + arr[i].toString() +"입니다");
		
		var wishList = new String[] {
				"냉장고", "선풍기", "TV", "노트북", "세탁기", "에어컨"
		};
		var purchasedList = new String[] {
			"에어컨", "노트북", "TV"	
		};
		System.out.println("==구입하지 못한 물건 ==");
		Arrays.sort(purchasedList);
		for(int i=0; i<wishList.length; i++)
			System.out.printf("%s", Arrays.binarySearch(purchasedList, wishList[i])<0 ? wishList[i] + "\n" : "");
	}
}
