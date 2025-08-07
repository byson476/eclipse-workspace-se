
public class CarMemberFieldMain {
	public static void main(String[] args) {
		/*
		 * 1.차량번호 1234번차량 12시입차
		 */
		//차객체의 데이타를저장할수있는 Car클래스타입의 변수 car1선언
		Car car1;
		//Car클래스를 사용하여 차객체를 생성한후 차객체데이타가car1 변수에 대입
		car1 = new Car() ;
		
		//차객체(car1)의 멤버필드 no에 "1234" 값대입
		car1.no = "1234";
		//차객체(car1)의 멤버필드 inTime에 12 값대입
		car1.inTime=12;
		
		/*
		 * 2-1. car1객체 16시출차
		 */
		//차객체(car1)의 멤버필드 outTime에 16 값대입
		car1.outTime=16;
		
		/*
		 * 2-2. 주차요금계산
		 */
		car1.fee = (car1.outTime-car1.inTime)*1000;
		/*
		 * 차객체(car1)의 멤버필드(fee)에 차객체(car1)의 
		 *   outTime,inTime멤버필드를 사용해서 주차요금을계산한후대입
		 */
		
		/*
		 * 2-3.주차요금출력
		 */
		System.out.printf("-------------------------------------\n");
		System.out.printf("%s %s %s %s\n","차량번호","입차시간","출차시간","주차요금");
		System.out.printf("-------------------------------------\n");
		System.out.printf("%6s %7d %8d %8d₩\n",car1.no,car1.inTime,car1.outTime,car1.fee);
		System.out.printf("-------------------------------------\n");
	}
}
