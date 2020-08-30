package day1;

import java.util.Scanner;

/*
 * this program demos the purpose of arthimatic operators
 * +,-,/,% (,Modulus),*
 */

public class ArthimaticOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1;
		int num2;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the first number");
		num1=sc.nextInt();
		System.out.println("Enter second Number");
		num2=sc.nextInt();
		sc.close();
		System.out.println("Addition is = "+ (num1+num2));
		System.out.println("Substraction is = "+ (num1-num2));
		System.out.println("Multiplication is = "+ (num1*num2));
		System.out.println("Quotient is = "+ (num1/num2));
		System.out.println("Remaider is = "+ (num1%num2));
		
		System.out.println(10*10/5+3-1*4/2*3);

	}

}
