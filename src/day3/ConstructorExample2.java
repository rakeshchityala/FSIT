package day3;

class Student2{
	private int studentId;
	private String studentName;
	
	Student2()  //Default constructor 
	{
		studentId=10;
		studentName="DefaultName";
	}
	Student2 (int studentId, String studentName) //parameteried constructor
	{
		this.studentId=studentId;
		this.studentName=studentName;
	}
	
	void display()
	{
		System.out.println("Student ID is: " +studentId);
		System.out.println("Student name is: " +studentName);
		
	}
}

public class ConstructorExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student ();
		Student s2=new Student (101,"Rakesh");
		s1.display();
		s2.display();

	}

}
