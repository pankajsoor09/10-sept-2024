package multithreading;

public class MyDemo extends Thread {
	
	public void run() {
		System.out.println("Soor");
		//System.out.println(Thread.currentThread());
	}
	public static void main(String [] args) {
		MyDemo t1 = new MyDemo();
		t1.setName("main");
		t1.start();
		System.out.println(Thread.currentThread());
//		System.out.println(t1.getName());
//		System.out.println(t1.currentThread());
//		Thread t2 = Thread.currentThread();
//		System.out.println(t2);
//		System.out.println(t2.getName());
		
	}

}	


