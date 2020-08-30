package day2;
/*
 * demo of joining multiple cases in switch block
 * if demo vlaue say: Monday, Wednesday, Friday say you can buy movie tickets
 * else if day values falls on Tuesday, Thursday, Saturday and Sunday then say you can't buy on these days
 * otherwise say invalid day
 */

import java.util.Scanner;

public class SwitchBlockExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String day;
		int count =0;
		Scanner sc=new Scanner(System.in);
		while (count ==0) {
		System.out.println("Enter the week day");
		
		day=sc.next();
		
		switch(day) {
		case "Mon" :
		case "Wed" :
		case "Fri" :
			System.out.println("You are allowed to buy movie tickets on " +day);
			break;
		case "Tue" :
		case "Thu" :
		case "Sat" :
		case "Sun" :
			
			System.out.println("You are NOT allowed to buy movie tickets on " +day);
			break;
			
		
		default: System.out.println("Invalid Day");
		}
		System.out.println("Enter 0 to continue and enter 1 to quit");
		count=sc.nextInt();
		}
		sc.close();
		

	}

}
