package chap12;

import java.util.EnumSet;

public class Sample04 {
	public static void main(String[] args) {
		System.out.println("우리 동물원에 있는 조류의 수");
		for(BIRD bird : BIRD.values()) 
			System.out.printf("%s, %d마리", bird.getName(), bird.getCount());
		
		System.out.println("\n 독수리 제거");
		EnumSet<BIRD> birds = EnumSet.allOf(BIRD.class);
		birds.remove(BIRD.EAGLE);
		for(BIRD bird : BIRD.values())
			System.out.printf("%s, %d마리", bird.getName(), bird.getCount());
		
		System.out.println("\n 독수리 추가");
		birds.add(BIRD.EAGLE);
		for(BIRD bird : BIRD.values())
			System.out.printf("%s, %d마리", bird.getName(), bird.getCount());
			
	}
}

enum BIRD {
	SPARROW("참새", 33), PARROT("앵무새", 27), EAGLE("독수리", 2), FALCON("메",8); 
	
	private final String name;
	private final int count;
	private BIRD(String name, int count) {
		this.name = name;
		this.count = count;
	}
	public String getName() {
		return name;
	}
	public int getCount() {
		return count;
	}
}