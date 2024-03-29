package learning;

public class VolatileHelper {

	volatile public static int flag = 0;
	public static void main(String[] args) {

		new Thread(new Runnable() {
			
			@Override
			public void run() {

				while(true) {
					if(flag == 0) {
						System.out.println("Running");
					}else {
						break;
					}
				}
			}
		}).start();
			
		new Thread(new Runnable() {
			
			@Override
			public void run() {

				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				VolatileHelper.flag = 1;
				System.out.println("Flag value updated");
			}
		}).start();
		
	}

}
