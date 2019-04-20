package com.dac.NewThread;

public class TestPriorityDemo extends Thread {
	public void run()
	{

	
	Thread t1= Thread.currentThread();
	System.out.println("My CurrentThread name is ::" +t1.getName());
	System.out.println("My CurrentThread Priority is ::" +t1.getPriority());
	}
	
	public static void main (String[] args){
		
		
		TestPriorityDemo tpd= new TestPriorityDemo();
		TestPriorityDemo tpd1= new TestPriorityDemo();
		
		
		tpd.setPriority(Thread.MAX_PRIORITY);
		tpd1.setPriority(Thread.MIN_PRIORITY);
		
		tpd.start();
		tpd1.start();
		
	}
}
