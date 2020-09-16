package day4;

final class sample {
	final int val=1000;
	void display() 
	{
		System.out.println("I'm from final class sample");
	}
	void display(int x) 
	{
		System.out.println("I'm from final class sample"+x);
	}
	void display(int x,int y) 
	{
		System.out.println("I'm from final class sample" 	+ (x+y));
	}
}

abstract class sample1{
	abstract void display1();
	final void display3() {
		System.out.println("I'm final method from class sample1");
	}

}

public class FinalandOverridingandOverloading extends sample1{
	@Override
	void display1() {
		// TODO Auto-generated method stub
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		sample s = new sample();
		s.display();
		System.out.println("The value of final variable is = " + s.val);
	s.display(1);
	s.display(2,3);
		
	sample1 s1=new FinalandOverridingandOverloading();
	
	s1.display1();
	s1.display3();

	}

	

}
