package study;

import java.util.List;
import java.util.Scanner;

public class Calculator {
// here a static validation method to validate operator is operator is valid it will return true 
// else it will throw Exception (custom exception which is declared in WrongOperatorExceptionClass)
	public static boolean validateOperator(String operator) throws WrongOperatorException {
		
		// here we have an array of string which will contains all operator
		String[] operatorList = { "+", "-", "*", "/" };
		
		// traversing through array to check is the operator provided is valid or not
		for (int i = 0; i < operatorList.length; i++) {
			if (operatorList[i].equals(operator)) {
				return true;
			}
		}
		throw new WrongOperatorException("Invalid Operator operator must be in [ + , - , * , / ]");
	}



	public static int calculate(int num1,int num2,String operator) {
		// calling the validate method to validate operator as it may throw exception we have surrounded it with try catch block 
			try {
				validateOperator(operator);
				
				
			} catch (WrongOperatorException e) {

				System.out.println(e.getMessage());
				//printing exception msg
			}
			
		// we are here means we have not faced any execption and calculation will continue for respective operator in switch case
		switch (operator) {
		case "+":
			return num1+num2;
			
		case "-":
			return num1-num2;
		case "*":
			return num1*num2;
		case "/":
			return num1/num2;
		default: return 0;
		}

		
	}
	public static void main(String[] args) {
// getting data from user
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Num 1");
		int number1 = sc.nextInt();
		System.out.println("Enter Num 2");
		int number2 = sc.nextInt();

		System.out.println("1. '+' for Addition");
		System.out.println("2. '-' for Substraction");
		System.out.println("3. '*' for Multiplication");
		System.out.println("4. '/' for Division");
		System.out.println("Enter Operation...");
		String  operator = sc.next();
		
		// calling calculate method which takes 2 int and a string operator as arguments
		int result = calculate(number1, number2, operator);
		System.out.println("Result is : "+result);
		sc.close();
	}
}
