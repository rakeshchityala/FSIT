package day3;
/*
 * count number of instances are created to class
 * class name keep it as "Emp" and count number of employees are added to this class
 */

class Emp{
	static int count=0;
	Emp(){
		count++;
	}
}

public class StaticVariableExample {
	static {
		Emp d1=new Emp();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emp[] e=new Emp[5];
		for(int i=0;i<e.length;i++)
			e[i]=new Emp();
		
		Emp e1= new Emp();
		Emp e2=new Emp();
		System.out.println("The Number of instacnes created for Emp is: " +Emp.count);

	}

}
