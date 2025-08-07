package chap07;

public class Sample05 {
	public static void main(String[] args) {
		int target = 201;
		int basic = 1600;
		float cost = 0;
		int vat = 0;
		double total = 0;
		int amt = 0;
		
		for(int i=1; i<=target; i++)
		{
			System.out.println("i : " + i    +"    " + cost);
			if(i>0 && i<=200) {
				cost = 93.3f;
			}
			else {
				cost = 187.9f;	
			}
			total += cost;
		}
		total = basic + Math.floor(total);
		System.out.println("total : " + total);
		vat = (int)Math.round(total/10);
		System.out.println("vat : " + vat);
		amt = (int)total + vat + (int)Math.floor((total*0.037)/10*10);
		System.out.println("amt : " + amt);
		amt = (int)Math.floor((amt/10)*10);
		System.out.println("청구금액 : " + amt);		
	}
}
