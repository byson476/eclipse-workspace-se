package chap16;

import java.util.Arrays;
import java.util.List;

public class Sample08 {
	public static void main(String[] args) {
		List<Employee> emp = Arrays.asList(
			new Employee(1,"원빈", 30000),
			new Employee(2,"창준", 20000),
			new Employee(3,"경진", 10000),
			new Employee(4,"아빠", 40000)
			);
		System.out.println(" == 연봉 2배 인상 == ");
		emp.forEach((x->{
			x.setSalary(x.getSalary()*2);
			System.out.println(x);
		}));
	}
}
