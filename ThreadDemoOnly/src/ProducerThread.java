
public class ProducerThread implements Runnable{

	SugarFactory obj;
	
	public ProducerThread() {

	}

	public ProducerThread(SugarFactory obj) {
		this.obj = obj;
	}

	@Override
	public void run() {

		// TODO Auto-generated method stub
		obj.produce();
	}

}
