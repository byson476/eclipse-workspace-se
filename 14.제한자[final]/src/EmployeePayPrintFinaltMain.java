
public class EmployeePayPrintFinaltMain {
	public static void main(String[] args) {
		System.out.println(">> 인센티브 기준페이 : " + Employee.INCENTIVE_PAY);
		System.out.println(">> 인센티브 율 : " + Employee.INCENTIVE_RATE);
		Employee[] employees = {
				new SalaryEmployee(1, "김선혁", 50000000),
				new SalaryEmployee(2, "김연준", 65000000),
				new SalaryEmployee(3, "박성섭", 56000000),
				new HourlyEmployee(4, "고소영", 100, 20000),
				new HourlyEmployee(5, "이효리", 10, 30000)
		};
		for (Employee employee : employees) {
			employee.calculatePay();
			double tempIncentive = employee.calculativeInsentive();
			System.out.println("--------" + employee.getName() + "님 급여명세표--------");
			employee.print();
			System.out.println("\t 인센티브 : " + tempIncentive);
			
			System.out.println("-------------------------");
			System.out.println();
			
			
		}
	}
}
