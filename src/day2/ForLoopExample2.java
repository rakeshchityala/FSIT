package day2;
/*
 * Pattern problems in java using nested for
 * 1			
 * 12			
 * 123			
 * 1234			
 * 12345
 * 
 * 54321
 *  4321
 *   321
 *    21
 *     1
 */
public class ForLoopExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int row=1;row<=5;row++) {
			for (int col=1;col<=row;col++) {
				System.out.print(row);
			}
			System.out.println();
		}
		
		System.out.println("*****************");
		int counter=1;
		for (int row=5;row>=1;row--) {
			for (int col=row;col>=1;col--) {
				System.out.print(col);
			}
			System.out.println();
			for(int i=1;i<=counter;i++) {
				System.out.print(" ");
			}
			counter++;
		}
		
		

	}

}
