package day2;
/*
 * Demo of for loop
 * any loop - the purpose of looping is to repeat specific actions
 * Accept the name and welcomes you fro 10 times
 */

import java.util.Scanner;

public class ForLoopExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your Name");
		name=sc.next();
		
		for (int i=1;i<=10;i++) {
			System.out.println("Welcome " +name +" !!! " + i);
		}
		System.out.println("***************************************");
		for (int i=10;i>0;i--) {
			System.out.println("Welcome " +name +" !!! " + i);
		}

	}

}
