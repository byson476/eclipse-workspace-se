package chap11;

import java.util.HashMap;
import java.util.TreeMap;

public class Sample09 {
	public static void main(String args[]) {
		var hm = new HashMap<String, String>();
		hm.put("1902893", "선풍기");
		hm.put("1801438", "신문지");
		hm.put("1803962", "고무신");
		hm.put("1722761", "강속구");
		hm.put("1913449", "동백꽃");
		hm.put("1804367", "솔까말");
		System.out.println(hm);
		
		var tm = new TreeMap<String, String>();
		tm.putAll(hm);
		System.out.println(tm);
		
		System.out.println(tm.ceilingEntry("1803969"));
		System.out.println(tm.ceilingKey("1803969"));
		System.out.println(tm.get(tm.ceilingKey("1803969")));
	}
}
