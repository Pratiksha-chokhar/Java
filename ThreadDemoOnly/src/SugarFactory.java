import java.util.concurrent.SynchronousQueue;

public class SugarFactory {

	private int capacity;
	private int sugar;
	
	Object lock = new Object();
	
	SugarFactory(){
		this.capacity = 5;
		this.sugar = 0;
	}
	
	SugarFactory(int a, int b){
		this.capacity = a;
		this.sugar = b;
	}
	
	public void produce(){
		System.out.println("Producing Sugars:");
		
		synchronized(lock){
			
			while(sugar<capacity){
				
				this.sugar++;
				System.out.println("Producer:Sugars Qty:"+sugar);
				try {
					Thread.currentThread().sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			lock.notify();
			
		}
		

		
		System.out.println("Done Producing Sugars:");
	}
	
	public void consume(){
		System.out.println("Transporting Sugars:");
		
		synchronized(lock){
			
			if(this.capacity==0){
				try {
					Thread.currentThread().wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			
			while(sugar>0){
				this.sugar--;
				System.out.println("Consumer:Sugars Qty:"+sugar);
				
				try {
					Thread.currentThread().sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			
			System.out.println("Transportation Done:");
		}
		
		
	
		
	}
	
	
	
}
