package multithreading;

public class MyRunnableThread implements Runnable  {
	
//	public MyRunnableThread() {
//		//default 
//	}
//	
//	public MyRunnableThread(String name) {
//		super(name);
//	}

	public void run() {
       Thread t = Thread.currentThread();
		for (int i = 1; i < 11; i++) {
			System.out.println(t.getName()+" : "+i);
		}
	}

}
