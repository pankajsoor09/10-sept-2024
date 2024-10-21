package multithreading;

public class PrinterThread implements Runnable{
	
	private Printer printer;
	private String msg;
	
	
public PrinterThread(Printer printer, String msg) {
		super();
		this.printer = printer;
		this.msg = msg;
	}


public void run (){
	try {
		printer.print(msg);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
}

}
