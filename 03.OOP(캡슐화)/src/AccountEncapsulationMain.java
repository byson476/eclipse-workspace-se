
public class AccountEncapsulationMain {
	public static void main(String[] args) {
		//계좌1 객체생성
		AccountEncapsulation accountEncapsulation1 = new AccountEncapsulation();
		//계좌1 데이터 대입
		accountEncapsulation1.setAccount(1111, "KIM", 50000, 1.2);
		//계좌1 에 8000원 입금
		accountEncapsulation1.deposit(8000);
		//계좌1 잔고출력
		int accountEncapsulation1balance = accountEncapsulation1.getBalance();
		System.out.println("계좌1의 잔고 : " + accountEncapsulation1balance);
		//계좌이율 1% 증가
		System.out.println("계좌1 이율1 : " + accountEncapsulation1.getRate());
		accountEncapsulation1.increaseRate(1);
		System.out.println("계좌1 이율2 : " + accountEncapsulation1.getRate());
		//계좌1 계좌출력
		accountEncapsulation1.headerPrint();
		accountEncapsulation1.print();
		
		
		System.out.println(">>은행계좌 전체잔고 50원 증가");
		//은행 전체 계좌 생성
		AccountEncapsulation acc1 = new AccountEncapsulation();
		AccountEncapsulation acc2 = new AccountEncapsulation();
		AccountEncapsulation acc3 = new AccountEncapsulation();
		//은행계좌 데이터 초기화
 		acc1.setAccount(1111, "LIM", 89000, 3.5);
		acc2.setAccount(2222, "JIM", 34000, 2.6);
		acc3.setAccount(3333, "SIM", 12300, 1.9);
		//은행 모든 잔고 50원 증가
		acc1.deposit(50);
		acc2.deposit(50);
		acc3.deposit(50);
		//출력
		acc1.headerPrint();
		acc1.print();
		acc2.print();
		acc3.print();
	}
}
