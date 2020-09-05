package day3;

class Test{
	void display()
	{
		System.out.println("I'm from display method");
	}
	void print()
	{
		this.display();   //this method equivalent to you calling t.display() from main method
		System.out.println("I'm from print method");
	}
}

public class ThisInvokesCurrentClassMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t=new Test();
		t.print();

	}

}
