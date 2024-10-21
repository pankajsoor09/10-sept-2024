package multithreading;

public class GetterThread implements Runnable {
  
	 private SharedResources resource;


	 public  GetterThread(SharedResources resource) {
	 	super();
	 	this.resource = resource;
	 	
	 }

	  public void run() {

	 	 for(int i=0;i<=10;i++) {
	 		
	 		 try {
				resource.getNumber();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	 	 }

	  }
	  
	  
}