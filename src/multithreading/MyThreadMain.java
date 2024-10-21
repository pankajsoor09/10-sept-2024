package multithreading;

public class MyThreadMain {

	public static void main(String[] args) {  

		MyThread thread1 = new MyThread();//new born state//default constructor in MyThread
    	thread1.setName("MyThread_1");
		thread1.start();//ready to run state and it will launch new thread of execution
		// In Thread class there is static method currentThread() to get currently running thread object (Main Thread)
		
		MyThread thread2 = new MyThread("MyThread_2");
		thread2.start();
		
		System.out.println(Thread.currentThread().getName());
		
		Thread mainThread = Thread.currentThread();//static method
//       System.out.println(mainThread.getName());
      	for (int i =1 ;i <11;i++) {
//		//System.out.println(i);
//		//	System.out.println(getName()+" : "+i);
		System.out.println(mainThread.getName()+" : "+i);
	}
		try {
			thread1.join();
			thread2.join();
		} catch (InterruptedException e) {
			e.printStackTrace(); 
		}// non static // joins thread1 the main thread//so it becomes responsibility main thread or thread 1 to not go beyond mythread 
		// it will wait for child thread execution then it will go parent thread
		System.out.println("End of Application");
	}

}
