
 public class Car {
	private String no;		//차량번호
	private int inTime;		//입차시간
	private int outTime;	//출차시간
	private int fee;		//주차요금
	
	//생성자 오버로딩
	public Car() {}
	
	public Car(String no, int inTime) {
		this.no = no;
		this.inTime = inTime;
	}
	public Car(String no, int inTime, int outTime, int fee) {
		this.no = no;
		this.inTime = inTime;
		this.outTime = outTime;
		this.fee = fee;
	}
	
	/*
	 * 1-1 입차시간 멤머필드에 no, inTime 대입
	 */
	public void setIpChaData(String no, int inTime) {
		this.no = no;
		this.inTime = inTime;
	}
	/*
	 * 1-2 출차시간 멤버필드에 outTime대입
	 */
	public void setChulChaData(int outTime) {
		this.outTime = outTime;
	}

	/*
	 * 2-2. 주차요금계산
	 */
	public void calculateFee() {
		this.fee = (this.outTime-this.inTime)*1000;
	}
	/*
	 * 2-3.주차요금출력
	 */
	public void headerPrinter() {
		System.out.printf("-------------------------------------\n");
		System.out.printf("%s %s %s %s\n","차량번호","입차시간","출차시간","주차요금");
		System.out.printf("-------------------------------------\n");
	}
	public void print() {
		System.out.printf("%6s %7d %8d %8d₩\n",this.no,this.inTime,this.outTime,this.fee);
		System.out.printf("-------------------------------------\n");
		
	}
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public int getInTime() {
		return inTime;
	}
	public void setInTime(int inTime) {
		this.inTime = inTime;
	}
	public int getOutTime() {
		return outTime;
	}
	public void setOutTime(int outTime) {
		this.outTime = outTime;
	}
}