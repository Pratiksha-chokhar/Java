
public class ConsumerThread implements Runnable{

	SugarFactory obj;
		
	public ConsumerThread() {
	
	}

	public ConsumerThread(SugarFactory obj) {
	
		this.obj = obj;
	}


	@Override
	public void run() {

		// TODO Auto-generated method stub
		obj.consume();
	}

}
