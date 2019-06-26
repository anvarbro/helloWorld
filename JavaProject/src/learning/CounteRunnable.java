package learning;

import java.util.Random;

public class CounteRunnable implements Runnable{

	private int threadNo;

	public CounteRunnable(int threadNo) {
		this.threadNo = threadNo;
	}

	@Override
	public void run() {

		for(int i = 0; i <= 9;i++) {
			Random random = new Random();
			try {
				Thread.sleep(random.nextInt(500));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("The value if i is: " + i + " and thread number is: " + threadNo);
		}
	}
	
	
	
}
