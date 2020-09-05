package day3;

class Student{
	private int studentId;
	private String studentName;
	
	Student()  //Default constructor 
	{
		studentId=10;
		studentName="DefaultName";
	}
	Student (int id,String name) //parameteried constructor
	{
		studentId=id;
		studentName=name;
	}
	
	void display()
	{
		System.out.println("Student ID is: " +studentId);
		System.out.println("Student name is: " +studentName);
		
	}
}

public class ConstructorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student ();
		Student s2=new Student (101,"Rakesh");
		s1.display();
		s2.display();

	}

}
