package day4;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueExampla {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<Integer> queue=new PriorityQueue<Integer>();
		queue.add(1000);
		queue.add(200);
		queue.add(400);
		queue.add(800);	
		queue.add(400);
		
		System.out.println("Head " +queue.element()); //print top element in queue
		System.out.println("Head " +queue.peek());
		
		Iterator<Integer> itr=queue.iterator();
		
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("******************");
		queue.remove();//remove first element of the queue
		queue.poll();//remove first element of the queue
		itr =queue.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
