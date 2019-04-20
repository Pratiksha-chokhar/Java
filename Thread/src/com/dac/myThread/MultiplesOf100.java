package com.dac.myThread;

public class MultiplesOf100 extends Thread{
	@Override
	public void run() {
		super.run();
		Thread t = Thread.currentThread();
		String name = t.getName();
				
		for(int i=1;i<=10;i++)
			System.out.println(name+ " "+ (i*100)  );
	}
}
