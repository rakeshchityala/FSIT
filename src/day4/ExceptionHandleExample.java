package day4;
/*
 * demo of ArthematicException And ArrayboundException
 */

public class ExceptionHandleExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int data=100;
		int[] arr=new int[3];
		try   //monotors the run time errors..if errors occurs control shifted to catch look
		{		
			
			System.out.println(data/0);
		} 
		
		catch (ArithmeticException e) //looks for associated catch block otherwise control goes to the catch
		{				
			System.out.println("ArithmeticException Exception Occured");
		}
		catch (Exception e) {
			System.out.println("Other exceptions");
			// TODO: handle exception
		}
		
		try {
			arr[4]=1000;
		} 
		catch (ArrayIndexOutOfBoundsException arithmeticException) //looks for associated catch block otherwise control goes to the catch
		{	
			
			System.out.println("ArrayIndexOutOfBoundsException Exception Occured");
		}
		finally   //runs after the try catch... generally helps to release resources 
		{
			System.out.println("I'm from finally block");
		}
		System.out.println("Rest of the code");

	}

}
