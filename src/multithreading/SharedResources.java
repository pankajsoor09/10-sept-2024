package multithreading;

public class SharedResources {

	private int number;
	
	private boolean status = false;

	
	synchronized public int getNumber() throws InterruptedException {
		
		if(status == false) {
			wait();
		}
		
		
		System.out.println("got : " + number);
		status = false;
		notify();
		return number;
	}
	
	
	synchronized public void setNumber(int number) throws InterruptedException {
		
		if(status) {
			wait();
		}
		
		this.number = number;
		System.out.println("set : " + number);
		status = true;
		notify();
		

		
	}

}