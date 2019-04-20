package com.dac.myThread;

public class MyThreadMain {
	
	public static void main(String [] args)
	{
		myBiscuit mb= new myBiscuit();
		Thread threadbiscuit= new Thread(mb);
		threadbiscuit.start();
		
		System.out.println("End Of my Biscuit!!!");
		
		Thread mainThread = Thread.currentThread();
		System.out.println("My mainthread name is:: "+mainThread.getName());
	}

}
