package day2;
/*
 * Demo of nested if
 * Accept age and weight of a person from console input
 * check if the person age >=18 && weight >=50 then eligible to donate blood othersise no 
 */

import java.util.Scanner;

public class NestedIfExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age;
		int weight;
		int count=0;
		Scanner sc = new Scanner(System.in);
		while (count==0) {
		System.out.println("Enter age of a person");
		age=sc.nextInt();
		
		if (age>=18)
		{

			System.out.println("Enter weight of person");
			weight=sc.nextInt();
			if(weight>=50) {
				System.out.println("By age and weight you are eligible to donate blood");
			}
			else {
				System.out.println("You are under weight to donate to blood");
			}
			
		}
		else
		{
			System.out.println("you under age to donate blood");
		}
		System.out.println("If you want to continue press 0 or press 1");
		count=sc.nextInt();
		}
		sc.close();
		

	}

}
