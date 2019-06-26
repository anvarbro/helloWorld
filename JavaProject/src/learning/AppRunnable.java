package learning;

public class AppRunnable {

	public static void main(String[] args) {

		/*
		Thread thread1 = new Thread(new CounteRunnable(1));
		Thread thread2 = new Thread(new CounteRunnable(2));


		thread1.start(); 
		thread2.start();
		*/
		
		new Thread(new Runnable() {

			@Override
			public void run() {

				for(int i = 1;i<10;i++) {
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println(i);
				}
			}
			
		}
				
				).start(); ;
		
	}

}
