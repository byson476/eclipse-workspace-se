
public class AccountManyMemberMain {
	public static void main(String[] args) {
		Account account0 = null;
		Account account1 = null;
		Account account2 = null;
		Account account3 = null;
		Account account4 = null;
		
		account0 = new Account();
		account1 = new Account();
		account2 = new Account();
		account3 = new Account();
		account4 = new Account();

		AccountManyMember accountManyMember = new AccountManyMember();
		accountManyMember.acc0=new Account(1,"KIM",4000,3.0);
		accountManyMember.acc1=new Account(2,"JIM",3000,2.0);
		accountManyMember.acc2=new Account(3,"LIM",5000,1.0);
		accountManyMember.acc3=new Account(4,"MIM",7000,9.0);
		accountManyMember.acc4=new Account(5,"NIM",9000,5.0);
		Account.headerPrint();
		accountManyMember.acc0.print();
		accountManyMember.acc1.print();
		accountManyMember.acc2.print();
		accountManyMember.acc3.print();
		accountManyMember.acc4.print();
		
	}
}
