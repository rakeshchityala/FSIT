package day3;

class Test1{
	int x;
	int y;
	Test1()
	{
		x=10;
		y=20;
	}
	Test1(int x)
	{
		this.x=x;
		this.x=100;
	}
	Test1(int x, int y)
	{
		this();
	}
	void display()
	{
		System.out.println("X value is = " +x);
		System.out.println("y value is = " +y);
	}
	
}

public class ThisInvokesCurrentClassConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test1 t1= new Test1();
		Test1 t2=new Test1(100);
		Test1 t3=new Test1(200);
		t1.display();
		t2.display();
		t3.display();
		

	}

}
