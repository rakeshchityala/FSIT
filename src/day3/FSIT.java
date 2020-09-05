package day3;
/*
 * this program demonstrates the purpose the purpose of class and object
 * what are class level/instance level variables/State of a class
 * whar are classes level/instance level methods/behaviors of class 
 */

public class FSIT {
	private int studentId;
	private String studentName;//class level variables/state
	
	void input(int id,String name) {
		studentId=id;
		studentName=name;
	}
	void output() {
		System.out.println("Student id is: " +studentId);
		System.out.println("Student Name is: " +studentName);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FSIT a=new FSIT();
		FSIT b=new FSIT();
		FSIT[] c=new FSIT[2];
		a.input(100, "Rakesh");		
		b.input(101, "Adhvaith");
		a.output();
		b.output();
		
		
		for (int i=0;i<c.length;i++) 
			c[i]= new FSIT();
			c[0].input(102, "Swetha");			
			c[0].output();
			c[1].input(103, "RakeshReddy");
			c[1].output();
			
		

	}

}
