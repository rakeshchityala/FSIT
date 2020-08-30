package day2;

import java.util.Scanner;

/*
 * demo of switch block
 * syntax switch (variable)
 * {
 * 		case1;
 * 		case2;
 * 		default:
 * 
 * Accept the week day in number (1,2,3....7) from the user in a variable called day
 * Monday -1
 * Tuesday - 2....Sunday= 7 if user enters any other say invalid day value
 * }
 */

public class SwitchBlockExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int day;
		int count=0;
		Scanner sc= new Scanner(System.in);
		while (count==0) {
		System.out.println("Enter a number between 1 to 7");
		day=sc.nextInt();
		
		switch (day)
		{
		case 1: System.out.println("Monday");
				break;
		case 2: System.out.println("Tuesday");
				break;
		case 3: System.out.println("Wednesday");
				break;
		case 4: System.out.println("Thursday");
				break;
		case 5: System.out.println("Friday");
				break;
		case 6: System.out.println("Saturday");
				break;
		case 7: System.out.println("Sunday");
				break;
		default:
			System.out.println("Invalid input");


		}
		System.out.println("If you want to continue press 0 or press 1");
		count=sc.nextInt();
		}

	}

}
