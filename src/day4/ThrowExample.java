package day4;

import java.util.Scanner;

/*
 * 	Demo of throw keyword
 * if the age of a person >18 eligible to vor\te otherwise not eligible to vote.
 * Do this using throw keyword
 */
public class ThrowExample {
	static void ageCheck(int age) {
		if(age>18) {
			System.out.println("you are eligible to vote");
		}else {
			throw new NumberFormatException("Not a valid age to vote");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Age");
		int age= sc.nextInt();
		try {
			ageCheck(age);	
		} catch (NumberFormatException e) {
			// TODO: handle exception
			System.out.println(e);
		}
		finally {
			sc.close();
		}
		
		System.out.println("Rest of the line...");

	}

}
