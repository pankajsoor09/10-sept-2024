package multithreading;

public class Printer {
//synchronized keyword
	//synchronized public void print(String msg) throws InterruptedException {
	//doing synchronization using synchronized block
		 public void print(String msg) throws InterruptedException {
		synchronized(this) {//synchronized block
		System.out.print("[ "+msg);
		Thread.sleep(700);//add throws
		System.out.println(" ]");
	}
	
}
}