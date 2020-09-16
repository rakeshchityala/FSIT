package day4;

public class StringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Apple";
		String s2="I like 	";
		String s3= new String ("Apple");
		System.out.println(s2.concat(s1));
		System.out.println(s3.equals(s1));
		System.out.println(s3.equalsIgnoreCase(s1));
		System.out.println(s1.toLowerCase());
		System.out.println(s1.toUpperCase());
		System.out.println(s2.concat(s1).trim());
		System.out.println(s2.substring(1, 6));
		

	}

}
