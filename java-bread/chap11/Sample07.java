package chap11;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;

public class Sample07 {
	public static void main(String[] args) {
		var arr = new ArrayList<String>();
		arr.add("사자");
		arr.add("호랑이");
		arr.add("원숭이");
		
		System.out.println("1. ArrayList를 TreeSet으로 ");
		var trs = new TreeSet<String>();
		trs.addAll(arr);
		System.out.println("TreeSet -- " + trs);
		
		System.out.println("\n2. TreeSet에 tiger추가 ");
		trs.add("tiger");
		System.out.println("TreeSet -- " + trs);
		
		String addStr = "토끼";
		System.out.printf("\n3. TreeSet에 %s가 없으면 추가 ", addStr);
		if(trs.contains(addStr))
			System.out.printf("\n TreeSet에 %s가 있음 ", addStr);
		else {
			trs.add(addStr);
			System.out.printf("\n TreeSet에 %s가 없어서 추가 ", addStr);
		}
		System.out.println("\n TreeSet -- " + trs);
		
		System.out.printf("\n4. TreeSet에 %s보다 크거나 같은 값 중에서 가장 가까운 값 출력 ", "자");
		System.out.printf("%s\n", trs.ceiling("자"));
		
		System.out.printf("\n5. TreeSet에 %s보다 작거나 같은 값 중에서 가장 가까운 값 출력 ", "자");
		System.out.printf("%s\n", trs.floor("자"));

		System.out.printf("\n6. TreeSet에 %s보다 큰 값 출력 ", "토끼");
		System.out.printf("%s\n", trs.higher("토끼"));
		
		System.out.printf("\n7. TreeSet에 %s보다 작은 값 출력 ", "토끼");
		System.out.printf("%s\n", trs.lower("토끼"));
		
		System.out.println("\n8. TreeSet에서 첫번째 값을 출력");
		System.out.println("\n"+ trs.first());
		
		System.out.println("\n9. TreeSet에서 마지막번째 값을 출력");
		System.out.println("\n" + trs.last());
		
		System.out.println("\n10. Iterator로 내림차순 출력");
		Iterator<String> itr = trs.descendingIterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		
		System.out.println("\n11. 첫번째 요소 반환 후 삭제");
		System.out.println("\n 반환값 -- " + trs.pollFirst());
		System.out.println("\n TreeSet -- " + trs);
		
		System.out.println("\n12.마지막 요소 반환 후 삭제");
		System.out.println("\n 반환값 -- " + trs.pollLast());
		System.out.println("\n TreeSet -- " + trs);		
	}
}
