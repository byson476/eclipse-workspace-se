
public class AccountConstructorMain {
	public static void main(String[] args) {
		Account acc1 = new Account();
		acc1.setAccount(1111, "KIM", 3000, 3.1);
		Account acc2 = new Account(2222, "Lee", 5600, 3.8);
		Account acc3 = new Account(3333, "MIN", 7800, 2.9);
		Account acc4 = new Account(4444, "NUM", 9000, 4.2);
		Account acc5 = new Account(5555, "OIM", 3800, 2.1);
		acc1.headerPrint();
		acc1.print();
		acc2.print();
		acc3.print();
		acc4.print();
		acc5.print();
		
	}
}
