
public class ReferenceTypeArrayMain {
	public static void main(String[] args) {
		/*
		int a;
		int[] ia;
		Account account;
		Account[] accountArray;
		*/
		Account[] accountArray = new Account[5];
		Account acc1 = new Account(1111, "KIM", 3000, 3);
		accountArray[0] = acc1;
		accountArray[1]  = new Account(2222, "LEE", 3000, 2.8);
		accountArray[2]  = new Account(3333, "MIN", 7800, 7.5);
		accountArray[3]  = new Account(4444, "NIM", 8900, 8.9);
		accountArray[4]  = new Account(5555, "OIM", 9900, 4.6);
		
		Account.headerPrint();
		for (int i = 0; i < accountArray.length; i++) {
			accountArray[i].print();
		}
		Account.headerPrint();
		
		for (Account account : accountArray) {
			account.print();
		}
	}
}
