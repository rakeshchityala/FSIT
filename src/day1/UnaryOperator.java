package day1;
/*
 * Demo of Unary Operators
 * ++, --
 * this is also called as pre increment/decrement or Post increment/decrement operator
 * pre increment/decrement the value will be incremented/decremented the new value 
 */

import java.util.Scanner;

public class UnaryOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the value");
		a=sc.nextInt();
		sc.close();
		System.out.println("Post Increment = " + a++); //a=a+1 -> a=11 incremented value is available from next line
		System.out.println("Pre Increment = " + ++a);  //a=a+1 -> a=12 incremented value is available from same line
		System.out.println("Post Decrement = " + a--); //a=a-1 -> a=12 decremented value is available from the next line
		System.out.println("Pre Decrement = " + --a); //a=a-1 -> a=10 decremented value is available from same line
		
		System.out.println(a++ + ++a + a-- + --a); //10+12+12+10
	}

}
