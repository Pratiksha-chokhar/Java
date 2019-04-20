package com.dac.myThread;


public class NumberThreadMain {
	
	public static void main(String[] args) {
		MultiplesOf100 t1 = new MultiplesOf100();
		
		MultiplesOfFive r1 = new MultiplesOfFive();
		Thread t2 = new Thread(r1, "Five");
		
		t1.start(); //asynchronous
		t2.start(); 
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		add(10,20);  //execute first
		System.out.println("End of Main method");  //execute next
	}
	
	public static int add(int a,int b){
		int c = a+b;
		System.out.println("Result is ");
		return c;
	}

}


/*
 * Five 5
Five 10
Five 15
Five 20
Five 25
Five 30
Five 35
Five 40
Five 45
Five 50
Thread-0 100
Thread-0 200
Thread-0 300
Thread-0 400
Thread-0 500
Thread-0 600
Thread-0 700
Thread-0 800
Thread-0 900
Thread-0 1000
Result is 
End of Main method
 * 
 * 
 * */

