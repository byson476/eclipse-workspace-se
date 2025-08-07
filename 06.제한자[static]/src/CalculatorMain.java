

public class CalculatorMain {

	public static void main(String[] args) {
		System.out.println("---------static way----------");
		int result=Calculator.add(23,34);
		System.out.println(result);
		result=Calculator.sub(23,34);
		System.out.println(result);
		result=Calculator.mul(23,34);
		System.out.println(result);
		result=Calculator.div(45435,34);
		System.out.println(result);
		
		System.out.println("---------instance--------");
		/*
		<< The constructor Calculator() is not visible >>
		Calculator calculator=new Calculator();
		*/
	}

}
