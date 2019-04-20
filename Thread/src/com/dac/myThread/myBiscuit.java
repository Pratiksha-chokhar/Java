package com.dac.myThread;

public class myBiscuit implements Runnable{

	@Override
	public void run() {
		for(int i=0;i<3;i++)
		{
			System.out.println("Hey i love Biscuit!!!!");
		}
		
		
		Thread currentThread = Thread.currentThread();
		System.out.println("the name of BiscuitThread is ::"+currentThread.getName());
		
	}
	
	
	

}
