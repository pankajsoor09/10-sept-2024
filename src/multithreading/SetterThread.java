package multithreading;

public class SetterThread implements Runnable {
  
private SharedResources resources;

	
	public SetterThread(SharedResources resource) {
		super();
		this.resources = resource;
	}


	
	public void run() {
		for(int i=1;i<=10;i++) {
			try {
				resources.setNumber(i);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	
}