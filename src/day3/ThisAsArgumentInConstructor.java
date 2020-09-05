package day3;

class Stud 
{
	String studName;
	Address studAddress; //address has been used here as user-defined 
	Stud(String studName,Address studAddress){
		this.studName=studName;
		this.studAddress=studAddress;
	}
	void display()
	{
		System.out.println("Student Name is: "+studName);
		System.out.println("Student City is: "+studAddress.cityName);
		System.out.println("Student Country is: "+studAddress.country);
	}
}

class Address
{
	String cityName;
	String country;
	Address (String cityName,String country)
	{
		this.cityName=cityName;
		this.country=country;
		Stud s=new Stud("Rakesh", this);  //this has been passed as an argument in constructor
		s.display();
	}
}

public class ThisAsArgumentInConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address ad = new Address("Bangalore", "India");
		Stud s=new Stud("Rakesh", ad);
		s.display();
		

	}

}
