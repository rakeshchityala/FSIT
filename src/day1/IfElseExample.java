package day1;

import java.util.Scanner;

/*
 * demo purpose if -> Else if -> else block
 * Accept the score of a student from console
 * Declare the grade of the student
 * score>=0 && score<50 -- fail
 * score>=50 && score <70 -- "C grade"
 * score>=70 && score <90 -- "B grade"
 * score>=90 && score <100 -- "A grade"
 * score not in range of 0-100 then say "Invalid score"
 * 
 */

public class IfElseExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter student grade");
		score= sc.nextInt();
		
		if(score>=0 && score<50) {
			System.out.println("Fail");
		}
		else if(score>=50 && score<70) {
			System.out.println("C Grade");
		}
		else if (score>=70 && score<90) {
			System.out.println("B Grade");
		}
		else if (score>=90 && score<=100) {
			System.out.println("A Grade");
		}
		else {
			System.out.println("Enter valid grade");
		}
		

	}

}
