package day3;

class Employee{
	protected int empId;
	protected String empName;
	protected float salary;
	
	Employee(){}
	Employee(int empId, String empName, float salary)
	{
		this.empId=empId;
		this.empName=empName;
		this.salary=salary;
	}
	
	void print()
	{
		System.out.println("I am print from parent class");
	}
	
}
class Sales extends Employee{
	
	float bonus;
	
	Sales(){}
	Sales(float bonus)
	{
		super(100,"Swarna",10000f); //invokes the super class constructor from child class constructor
		this.bonus=bonus;
	}
	void display()
	{
		super.print(); //super keyword helps to make a call to the super class methods
		System.out.println("Emp Id is " + empId);
		System.out.println("Emp Name is " + empName);
		System.out.println("Emp Sal is " + salary);
		System.out.println("Emp bonus is " + bonus);
	}
}
public class SingleInheritanceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Sales s = new Sales(1000f);
s.display();
	}

}