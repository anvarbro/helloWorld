package learning;

public class SyncronizationTutorial {

	public static void main(String[] args) {

		//SyncronizationHelper s1 = new SyncronizationHelper("Thread1");
		//SyncronizationHelper s2 = new SyncronizationHelper("Thread2");

		new Thread(new Runnable() {
			
			@Override
			public void run() {

				long startTime = System.currentTimeMillis();
				for(int i = 1; i<10;i++) {
					SyncronizationHelper.general("Thread1");
				}
				long endTime = System.currentTimeMillis();
				System.out.println(endTime - startTime);
			}
		}).start();	
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {

				long startTime = System.currentTimeMillis();
				for(int i = 1; i<10;i++) {
					SyncronizationHelper.general("Thread2");
				}
				long endTime = System.currentTimeMillis();
				System.out.println(endTime - startTime);
			}
		}).start();	
	}

}
