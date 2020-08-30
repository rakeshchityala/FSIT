package day1;

import java.util.Scanner;

/*
 * demo of if and else block
 * Accept 4 -digit number a year value from the console input 
 * check whether the entered year is a leap year or not 
 * feb- 29 days then it is leap year --2020 is leap year
 * (year%400 ==0) || ((year%4==0) && (year%100!=0))
 */

public class IfBlockExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 4 digit Year value");
		year=sc.nextInt();		
		sc.close();
		if((year%400==0) || (year%4==0) && (year%100!=0)) {
			System.out.println(year + "is a Leap year");
		}else {
			System.out.println(year + "is NOT a leap year");
		}
		
	}

}
