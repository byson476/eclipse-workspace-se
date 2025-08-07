package chap11;

import java.util.ArrayList;
import java.util.Iterator;

public class Sample05 {
	public static void main(String[] args) {
		var list = new ArrayList<String>();
		list.add("dog");
		list.add("cat");
		list.add("lion");
		System.out.println(list);
		System.out.printf("총 %d의 자료가 있습니다.\n", list.size());
		
		Iterator<String> it = list.iterator();
		while(it.hasNext()) {
			String item = it.next();
			System.out.println(item);
			if("cat".equals(item))
				it.remove();
		}
		System.out.println("==============\n" + list);
		System.out.printf("총 %d의 자료가 있습니다.\n", list.size());
		
		
	}
}
