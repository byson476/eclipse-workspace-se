package chap11;

import java.util.ArrayList;
//삽입정렬
public class Sample13 {
	public static void main(String[] args) {
		var list = new ArrayList<Integer>();
		list.add(1);
		list.add(3);
		list.add(8);
		list.add(2);
		list.add(9);
		list.add(7);
		list.add(6);
		list.add(5);
		list.add(4);
		System.out.println("시작 배열 :: " + list);
		
		int startPos = 0;
		for(int count=0; count<list.size(); count++) {
			int minValue = 0;
			int minPos = 0;
			
			for(int idx=count; idx<list.size(); idx++) {
				if(minValue==0 || minValue>list.get(idx)) {
					minValue = list.get(idx);
					minPos = idx;
				}
			}
			if(minPos>0) {
				list.set(minPos, list.get(startPos));
				list.set(startPos, minValue);
			}
			System.out.println((count+1)+"회전"+list);
			startPos++;
		}
		System.out.println("최종배열 : " + list);
	}
}
