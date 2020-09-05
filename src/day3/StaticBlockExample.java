package day3;

public class StaticBlockExample {
	static int data;
	static {
		data=100;
		System.out.println("1. Values of data is: "+data);
		
	}
	static {
		data=200;
		System.out.println("2. Values of data is: "+data);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//data=00;
		System.out.println("3. Values of data is: "+data);

	}

}
