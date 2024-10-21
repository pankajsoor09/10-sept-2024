package multithreading;

public class MyThread extends Thread {
	
	public MyThread() {
		//default 
	}
	
	public MyThread(String name) {
		super(name);
	}

	public void run() {
		System.out.println(Thread.currentThread());
		for(int i = 1;i<=10;i++) {
			System.out.println(getName()+" : "+i);
			//System.out.println(Thread.currentThread().getName() +" - "+i);
		}
	}

}
