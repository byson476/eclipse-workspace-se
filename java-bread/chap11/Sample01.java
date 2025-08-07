package chap11;

import java.util.ArrayList;
import java.util.List;

public class Sample01 {
	public static void main(String[] args) {
		List<String> arr = new ArrayList();
		
		arr.add("하나");
		arr.add("둘");
		arr.add("셋");
		arr.add("넷");
		arr.add("다섯");
		arr.add("여섯");
		arr.add("일곱");
		arr.add("여덟");
		
		arr.add(2,"이쩜오");
		arr.set(3, "바뀜");
		for(String a: arr)
			System.out.println(a);
		System.out.println("================");
		
		arr.remove(2);
		for(String a: arr)
			System.out.println(a);
		System.out.println("================");
		
		List<String> delArr = new ArrayList();
		delArr.add("둘");
		delArr.add("넷");
		arr.removeAll(delArr);
		for(String a: arr)
			System.out.println(a);
		System.out.println("================");
		
		arr.removeAll(arr);
		for(String a: arr)
			System.out.println(a);
		
	}
}
