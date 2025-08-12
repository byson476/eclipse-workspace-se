
public class EmployeePayPrintAbstractMain {
	public static void main(String[] args) {
		Employee[] employees = {
				new SalaryEmployee(1, "김선혁", 50000000),
				new SalaryEmployee(2, "김연준", 65000000),
				new SalaryEmployee(3, "박성섭", 5600000),
				new HourlyEmployee(4, "고소영", 100, 20000),
				new HourlyEmployee(5, "이효리", 200, 30000)
		};
		for (Employee employee : employees) {
			employee.calculatePay();
			System.out.println("--------" + employee.getName() + "님 급여명세표--------");
			employee.print();
			System.out.println("-------------------------");
			System.out.println();
			
			
		}
	}
}
