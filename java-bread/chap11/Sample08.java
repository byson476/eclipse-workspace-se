package chap11;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Sample08 {
	public static void main(String[] args) {
		var map = new HashMap<String, Integer>();
		map.put("Java", 1);
		map.put("C", 2);
		map.put("C++", 3);
		map.put("C#", 4);
		map.put("Python", 5);
		map.put("JavaScript", 6);
		map.put("Visual Basic .Net", 7);
		map.put("PHP", 8);
		map.put("Perl", 9);
		map.put("Delphi", 10);

		Map beforeMap = (Map)map.clone();
		Set<String> keys = map.keySet();
		
		System.out.println("향상된 for문");
		for(String key : keys)
			System.out.println(key);
		
		System.out.println("람다식");
		keys.forEach((s)->System.out.println(s));
		
		System.out.println("메써드 참조");
		map.keySet().forEach(System.out::println);
		
		System.out.println("총 맴의 매핑수");
		System.out.println(map.size());
		
		System.out.println("Ruby를 10위로");
		if(map.containsValue(10))
			map.remove("Delphi");
		map.put("Ruby", 10);
		System.out.println(map.toString());
			
		map.computeIfPresent("Java", (String key, Integer value)-> --value);
		System.out.println("After :: " + map.toString());
		System.out.println("Before::" + beforeMap);
	}
}
