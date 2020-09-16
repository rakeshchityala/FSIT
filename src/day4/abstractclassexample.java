package day4;

/*
 * Demo of abstract class... abstract classes can behave like a parent class only.
 * It can't be instantiated directly
 */


abstract class A{

	
	void method1()
		{
		System.out.println("I am a non-abstract method...claa A");	
		}
	abstract void method2(); // it can be used in overriding
	
	abstract void method3(int pass , String name);
	
}

class B extends A{

	@Override
	void method2() {
		// TODO Auto-generated method stub
		System.out.println("I am method2 from Class B");
	}

	@Override
	void method3(int pass, String name) {
		// TODO Auto-generated method stub
		
	}
	
	
}


class C extends A{
	
	void method1()
	{
		System.out.println("I am method1 from class C ");
	}

	@Override
	void method2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void method3(int pass, String name) {
		// TODO Auto-generated method stub
		System.out.println("I am method 3 from class C " + pass + " =" + name);
	}
	
}

public class abstractclassexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	A a = new B();
	
	a.method1();
	a.method2();
	a.method3(2, "Swarna");
	System.out.println("*****************");
	
	C c = new C();
	c.method1();
	c.method2();
	c.method3(3, "Jigsaw");
	System.out.println("*****************");		
	}

}