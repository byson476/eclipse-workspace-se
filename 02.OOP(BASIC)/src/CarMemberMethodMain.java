
public class CarMemberMethodMain {
	public static void main(String[] args) {
		/*
		 * 1.차량번호 1234번차량 12시입차
		 */
		Car car1 = new Car();
		car1.setIpChaData("1234", 12);
		/*
		 * 2-1. car1객체 16시출차
		 */
		//차객체(car1)의 멤버필드 outTime에 16 값대입
		car1.setChulChaData(16);
		/*
		 * 2-2. 주차요금계산
		 * 		차객체(car1)의 멤버필드(fee)에 차객체(car1)의 
		 *      outTime,inTime멤버필드를 사용해서 주차요금을계산한후대입
		 */
		car1.calculateFee();
		
		/*
		 * 2-3.주차요금출력
		 */
		car1.print();
		car1.print();
		car1.print();
		car1.print();
	}
}
