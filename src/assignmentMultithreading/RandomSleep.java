package assignmentMultithreading;//assignment 2

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;

public class RandomSleep extends Thread {

	private String fileName;

	public RandomSleep(String fileName) {
		super();
		this.fileName = fileName;
	}

	public void run() {
		BufferedReader br = null;

		try {
			FileReader reader = new FileReader(fileName);
			Random random = new Random();
			br = new BufferedReader(reader);
			String str = null;
			while ((str = br.readLine()) != null) {// to print all in the file
				System.out.println(str);
				Thread.sleep(random.nextInt(700));

			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null)
					br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}

	}
}
