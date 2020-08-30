package day2;

public class InfinateForLoopExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int counter=1;
		sample:
			for(;;) {
				if (counter>1000)
					break sample;
				System.out.println("Welcome" +counter);
				counter ++;
				continue sample;
			}

	}

}
