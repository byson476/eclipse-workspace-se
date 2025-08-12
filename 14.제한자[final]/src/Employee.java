public abstract class Employee {
	public final static double INCENTIVE_PAY = 1000000; //인센티브 페이
	public final static double INCENTIVE_RATE = 0.1; //인센티브율 
	
    private int no; //번호
    private String name; //이름
    private int pay; //급여

    public Employee() {}
    
    public Employee(int no, String name) {
		super();
		this.no = no;
		this.name = name;
	}

    public abstract void calculatePay();
    
    /*
	 * 인센티브계산(급여가 100만원이 넘으면 10% 인센티브지급)
	 *   - 모든사원들의 인센티브계산방법 동일
	 *   - 재정의 금지(변경금지):회장님의 방침
	 */
    public final double calculativeInsentive() {
    	double insentive = 0.0;
    	if(this.pay>=Employee.INCENTIVE_PAY) {
    		insentive = this.pay * Employee.INCENTIVE_RATE;
    	}
    	return insentive;
    }
    
	public void print(){
		System.out.print(this.no + "\t" + this.name + "\t" + this.pay + "\n");
    }

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPay() {
		return pay;
	}

	public void setPay(int pay) {
		this.pay = pay;
	}

 

}
