package day1;
/*
 * demo of logical operators
 * && - AND
 * || - OR
 * ! - NOT
 * && = AND operator = compares two or more conditions in a single line and returns if all conditions are true
 * || = OR operator = compares two or more conditions in a single line and returns if any one condition is true
 * ! - NOT opertor = works in reverse.... if the given condition is true then return false
 */

import java.util.Scanner;

public class LogicalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1;
		int num2;
		int num3;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the first number");
		num1=sc.nextInt();
		System.out.println("Enter second Number");
		num2=sc.nextInt();
		System.out.println("Enter third Number");
		num3=sc.nextInt();
		sc.close();
		
		System.out.println("&& Comparison = "+((num1>num2)&&(num1<num3)&&(num2<num3)));
		System.out.println("|| Comparison = "+((num1>num2)||(num1<num3)||(num2<num3)));
		System.out.println("! Comparison = "+!(num1<=num2));

	}

}
