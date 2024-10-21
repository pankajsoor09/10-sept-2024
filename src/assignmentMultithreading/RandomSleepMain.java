package assignmentMultithreading;//assignment 2

public class RandomSleepMain {

	public static void main(String[] args) {
		if (args.length < 2) {
 
			System.out.println("provide two filenames as command-line arguments");
			
		}
		
		String file1 = args[0];
		String file2 = args[1];

		 RandomSleep t1 = new  RandomSleep(file1);
		 RandomSleep t2 = new  RandomSleep(file2);
		 
		 t1.start();
		 t2.start();
		
	}

}
