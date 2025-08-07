package chap07;

public class Sample04 {
	public static void main(String[] args) {
		int [] target = new int[6];
		for(int i=0; i<target.length; i++) {
			target[i] = (int)(Math.random()*45+1);
			if(i>0) {
				for(int j = 0; j<i; j++)
				{
					if(target[i]==target[j]) {
						i--;
						break;
					}
				}
			}
		}
		System.out.printf("%d %d %d %d %d %d", target[0], target[1], target[2], target[3], target[4], target[5]);
	}
}
