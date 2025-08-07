package chap11;
//개미수열
public class Sample15 {
	public static void main(String[] args) {
		String result = "";
		int times = 10;
		
		for(int idx=0; idx<times; idx++) {
			if("".equals(result))
				result = "1";
			else {
				char[] input = result.toCharArray();
				result = "";
				
				String target = "";
				for(int i=0; i<input.length; i++) {
					if("".equals(target)) {
						target = "" + input[i];
						result = result + target;
					}
					else if(target.charAt(0)==input[i]) {
						target += ""+input[i];
					}
					else {
						result += ((target).length() + ( "" + input[i]));
						target = "" + input[i];
					}
					
					if(i == (input.length-1)) {
						result += target.length();
						target = "";
					}
				}
			}
			System.out.printf("%2d 회전 :: %s \n", (idx+1), result);
		}
	}
}
