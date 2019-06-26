package learning;

public class MyCounter extends Thread{
	
	private int threadno;

	public MyCounter(int threadno) {
		this.threadno = threadno;
	}
	
	@Override
	public void run() {

		countMe();
	}
	
	public void countMe()
	{
		for(int i = 1;i<=9;i++) {
			try {
				sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("The value of i is: " + i + " and the thread number " + threadno );
		}
	}

}
