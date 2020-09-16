package day4;

class MultiplicationTable{
	
	synchronized void printTable(int n)
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(i+ "*" + n + "=" + i*n);
			try
			{
				Thread.sleep(400);
			}catch(Exception e) {System.out.println(e);}
		}
	}
}

class MyThread1 extends Thread{
	MultiplicationTable t;
	
	MyThread1(MultiplicationTable t)
	{
		this.t=t;
	}
	
	public void run() //starts and runs the thread
	{
		t.printTable(5);
	}
	
}


class MyThread2 implements Runnable
{
	MultiplicationTable t;
	
	MyThread2(MultiplicationTable t)
	{
		this.t=t;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		t.printTable(10);
	}
	
}

public class ThreadExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
MultiplicationTable t= new MultiplicationTable();
MyThread1 t1=new MyThread1(t);
MyThread2 t2=new MyThread2(t);

t1.start(); //starts MyThread1
t2.run(); //starts MyThread2

	}

}