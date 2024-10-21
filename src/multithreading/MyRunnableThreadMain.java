package multithreading;

public class MyRunnableThreadMain {

	public static void main(String[] args) {

		MyRunnableThread runnable = new MyRunnableThread ();
		
		Thread thread1 = new Thread(runnable);
		thread1.setName("MyThread_1");
		thread1.start();
		
		Thread thread2 = new Thread(runnable,"MyThread_2");
		thread2.start();
		Thread t = Thread.currentThread();
		for(int i = 1 ; i < 11 ; i++) {
			System.out.println(t.getName()+" : "+i);
		}
		
		try {
			thread1.join();
			thread2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	System.out.println("End of Application");	
	}

}
