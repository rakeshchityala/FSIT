package day4;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	ArrayList<String> list=new ArrayList<String>();
		list.add("Apple");
		list.add("Banana");
		list.add("Banana");
		list.add("Mango");
		list.add("Grape");
		Iterator res= list.iterator();
		while (res.hasNext()) {
			Object object = (Object) res.next();
			System.out.println(object);			
		}
		
		list.remove(2);
		System.out.println("*********************");
		 res =list.iterator();
		while(res.hasNext())
		{
			System.out.println(res.next());
		}	
	
			

	}

}
