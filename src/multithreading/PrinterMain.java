package multithreading;

public class PrinterMain {

	public static void main(String[] args) {

		Printer printer = new Printer();
		
		PrinterThread printerThred1 = new PrinterThread(printer,"Hello");
		PrinterThread printerThred2 = new PrinterThread(printer,"Hi");
		PrinterThread printerThred3 = new PrinterThread(printer,"Welcome");
		
		Thread thread1 = new Thread(printerThred1);
		Thread thread2 = new Thread(printerThred2);
		Thread thread3 = new Thread(printerThred3);
		
		thread1.start();
		thread2.start();
		thread3.start();
		
		try {
			thread1.join();
			thread2.join();
			thread3.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
