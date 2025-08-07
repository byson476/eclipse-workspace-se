package chap16;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Sample07 {
	public static void main(String[] args) {
		List<Employee> emp = Arrays.asList(
			new Employee(1,"원빈", 30000),
			new Employee(2,"창준", 20000),
			new Employee(3,"경진", 10000),
			new Employee(4,"아빠", 40000)
			);
		Consumer<Employee> consumer = x ->{
			x.setSalary(x.getSalary()*2);
		};
		System.out.println(" == 연봉 2배 인상 == ");
		doubleSalary(emp, consumer.andThen((item)-> System.out.println(item)));
	}

	private static void doubleSalary(List<Employee> emp, Consumer<Employee> f) {
		for(Employee e : emp)
			f.accept(e);
	}
}

class Employee{
	private int no;
	private String name;
	private double salary;
	
	public Employee(int noi, String name, int salary) {
		this.no = no;
		this.name = name;
		this.salary = salary;
	}

	public void setSalary(double d) {
		this.salary = d;
	}

	public double getSalary() {
		return salary;
	}

}