package day1;
/*
 * 
 */

import java.util.Scanner;

public class TernaryOperator {

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
		int temp;
		temp = (num1<num2)? num1+50 : num2-2;
		System.out.println("num1 "+num1);
		System.out.println("num2 "+num2);

	}

}
