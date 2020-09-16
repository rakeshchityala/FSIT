package day4;

import java.io.IOError;
import java.io.IOException;

class NF{
	void ageCheck(int age) throws Exception{
		if(age>18)
			System.out.println("You are eligible to vote");
		else
			System.out.println("Not a valid age and not eligible to vote");
	}
	void n() throws IOException{
		throw new IOException("Device Error")	;	
	}
}



public class ThrowsExample  {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		NF f=new NF();
		try {
			f.ageCheck(0);
			f.n();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		
		System.out.println("rest of the code....");
		
	}

}
