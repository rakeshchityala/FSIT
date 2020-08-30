package day1;

import java.util.Scanner;

public class DateTypeExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean bo= false;
		byte c= 'c';
		byte b=100; //-128 to 127 or 0 to 256
		short s=32767;
		int i=32768;
		long l=123456789012345L;
		float f=23.45f;
		double d=54e34;
		String str = "Rakesh";
		
		
		//read data type values from console 
		Scanner sc= new Scanner(System.in);	
		c ='A';
		System.out.println("Enter boolean value");
		bo=sc.nextBoolean();
		
		System.out.println("Enter Byte");
		b=sc.nextByte();
		
		System.out.println("Enter Short value");
		s=sc.nextShort();
		
		
		System.out.println("Enter Int value");
		
		i=sc.nextInt();
		
		System.out.println("Enter long value ");
		l=sc.nextLong();
		
		System.out.println("Enter float vaue");
		f=sc.nextFloat();
		
		System.out.println("Enter double value");
		d=sc.nextDouble();
		
		System.out.println("String value is: "+str);
		str=sc.next();

	}

}
