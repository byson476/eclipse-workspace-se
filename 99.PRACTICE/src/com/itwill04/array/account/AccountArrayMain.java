package com.itwill04.array.account;

public class AccountArrayMain {

	public static void main(String[] args) {
		System.out.println("-----------배열객체생성 블록{} 초기화-----------");
		Account acc1=new Account(1111, "KIM", 56000, 0.9);
		Account[] accounts= {
				acc1,
				new Account(2222, "LEE", 58900, 0.5),
				new Account(3333, "PARK", 78000, 0.4),
				new Account(4444, "CHOI", 34000, 0.3),
				new Account(5555, "SIM", 66000, 0.7),
				new Account(6666, "HONG", 99000, 1.4),
				new Account(7777, "KIM", 87600, 0.6),
				new Account(8888, "SOO", 12300, 2.3),
				new Account(9999, "MIN", 41200, 4.1)
		};
		
		System.out.println("1.은행총계좌수:" + accounts.length);
		System.out.println("2.은행계좌 전체출력");
		Account.headerPrint();
		for(Account tempAccount:accounts) {
			tempAccount.print();
		}
		System.out.println("3.은행계좌 총잔고");
		int totBalance=0;
		for(Account tempAccount:accounts) {
			totBalance+=tempAccount.getBalance();
		}
		System.out.println(">> "+totBalance);
		System.out.println("4.은행 계좌들중에서 계좌번호 3333번계좌 한개 찾아서 출력(계좌번호는 중복되지않는다)");
		for(int i=0;i<accounts.length;i++) {
			if(accounts[i].getNo()==3333) {
				accounts[i].print();
				break;
			}
		}
		System.out.println("5.은행 계좌들중에서 계좌잔고 50000원이상인 VIP계좌 여러개 찾아서 출력");
		for (Account account : accounts) {
			if(account.getBalance()>=50000) {
				account.print();
			}
		}
		System.out.println("6.은행 계좌들중에서 계좌이율 5.0 이상인 계좌 여러개 찾아서 출력");
		for (Account account : accounts) {
			if(account.getIyul()>=5.0) {
				account.print();
			}
		}
		System.out.println("6.은행 계좌들중에서 이름이 KIM인 계좌 여러개 찾아서 출력[String객체배우고난후에]");
		for (Account account : accounts) {
			String tempOwner=account.getOwner();
			String searchOwner="KIM";
			/*
			if(tempOwner==searchOwner) {
				account.print();
			}
			*/
			if(tempOwner.equals(searchOwner)) {
				account.print();
			}
		}
		
		
		System.out.println("7.6666번계좌 3000원입금");
		for (int i=0;i<accounts.length;i++) {
			Account account=accounts[i];
			if(account.getNo()==6666) {
				System.out.println(">>입금전");
				account.print();
				account.deposit(3000);
				System.out.println(">>입금후");
				account.print();
				break;
			}
		}
		
		System.out.println("8.9999번계좌 3000원출금[Quiz]");
		
		System.out.println("9.계좌잔고순으로 오름[내림]차순정렬");
		System.out.println("############정렬전##############");
		for (Account account : accounts) {
			account.print();
		}
		for(int i=0;i<accounts.length-1;i++) {
			for(int j=0;j<accounts.length-1;j++) {
				if(accounts[j].getBalance() > accounts[j+1].getBalance()) {
					//주소값교환
					Account tempJAccount=accounts[j];
					accounts[j]=accounts[j+1];
					accounts[j+1]=tempJAccount;
				}
			}
		}
		System.out.println("############정렬후##############");
		for (Account account : accounts) {
			account.print();
		}
		System.out.println("9.계좌번호순으로 오름(내림)차순정렬[Quiz]");
		for (int i = 0; i < accounts.length-1; i++) {
			for (int j = 0; j < accounts.length-1; j++) {
				if(accounts[j].getNo() > accounts[j+1].getNo()) {
					Account tempAccout=accounts[j];
					accounts[j]=accounts[j+1];
					accounts[j+1]=tempAccout;
				}
			}
		}
		for (Account account : accounts) {
			account.print();
		}
		System.out.println("10.5555계좌한개 이율을 9.9으로변경");
		for (Account account : accounts) {
			if(account.getNo()==5555) {
				System.out.println(">>변경전");
				account.print();
				account.setIyul(0.9);
				System.out.println(">>변경후");
				account.print();
				break;
			}
		}
		System.out.println("11.VIP계좌(잔고50000원이상)여러개 잔고 50원 증가");
		for (Account account : accounts) {
			if(account.getBalance()>=50000) {
				account.deposit(50);
			}
		}
		for (Account account : accounts) {
			account.print();
		}
		
		/********************OPTION***********************
		  1. accounts배열 객체에 새로생성한계좌객체 추가 
		  		A. accounts.length+1 개짜리 임시배열생성
		 		B. accounts의 모든계좌객체 임시배열로 이동
				C. 임시배열에 새로운  Account객체추가
		 		D. accounts에 임시배열주소대입
		 
		  2. accounts배열 객체에서 계좌번호 4444번계좌객체삭제
		  	 	A. accounts 에서 4444계좌찾아서 null대입
			 	B. accounts.length-1 개짜리 임시배열생성
			 	C. accounts null이아닌 모든계좌 임시배열로이동
			  	D. accounts 에 임시배열대입 
		 */
		System.out.println("----------------------------Account객체추가----------------------------");
		Account[] tempAccounts=new Account[accounts.length+1];
		for(int i=0;i<accounts.length;i++) {
			tempAccounts[i]=accounts[i];
		}
		Account newAccount=new Account(1112,"NEW", 45000, 3.5);
		tempAccounts[tempAccounts.length-1] = newAccount;
		accounts=tempAccounts;
		
		
		System.out.println("-------추가후출력----------");
		for(int i=0;i<accounts.length;i++) {
			accounts[i].print();
		}
		System.out.println("----------------------------Account객체삭제[4444]----------------------");
		Account removeAccount=null;
		for(int i=0;i<accounts.length;i++) {
			if(accounts[i].getNo()==4444) {
				removeAccount=accounts[i];
				accounts[i]=null;
				break;
			}
		}
		Account[] tempAccounts2=new Account[accounts.length-1];
		int index=0;
		for(int i=0;i<accounts.length;i++) {
			if(accounts[i]!=null) {
				tempAccounts2[index++] = accounts[i];
			}
		}
		accounts=tempAccounts2;
		System.out.println(" >> 삭제된 Account");
		if(removeAccount!=null) {
			removeAccount.print();
		}else {
			System.out.println("삭제실패");
		}
		System.out.println("-------삭제후출력----------");
		for(int i=0;i<accounts.length;i++) {
			accounts[i].print();
		}
		
	}
}