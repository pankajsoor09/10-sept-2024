package multithreading;

public class SharedResourceMain {

	
	public static void main(String[] args) {
		
		SharedResources resource = new SharedResources();
		
		SetterThread setter = new SetterThread(resource);
		GetterThread getter = new GetterThread(resource);
		
		
		
		
		Thread setterThread = new Thread(setter);
		
		Thread getterThread = new Thread(getter);
		
		setterThread.start();
		getterThread.start();
		
		
		try {
			setterThread.join();
			getterThread.join();
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
	}

}