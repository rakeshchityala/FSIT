package day1;

/*
 * this program is demonstrates the usage of variables at various level
 * local variable
 * instance variable
 * static variable
 */

public class VariableExample {
	int empId=100; //instance specific variable/ class level variable
	static String empOrg="Jigsaw";
	
	float displaySal() {
		float sal=100000f; //local variable
		return sal;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VariableExample ve= new VariableExample();
		System.out.println("Instance variable values is emp id: "+ve.empId);
		System.out.println("Static  varibale value is emp org: "+empOrg);
		System.out.println("Local variable value is sal "+ve.displaySal());

	}

}
