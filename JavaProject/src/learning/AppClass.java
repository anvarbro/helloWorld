package learning;

public class AppClass {

	public static void main(String[] args) {

		MyCounter counter1 = new MyCounter(1);
		MyCounter counter2 = new MyCounter(2);
		
		long startTime = System.currentTimeMillis();
		counter1.start();
		System.out.println("****************************");
		counter2.start();
		try {
			Thread.sleep(5005);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		long endTime = System.currentTimeMillis();
		System.out.println("Total time required to process: " + (endTime - startTime));

	}

}
