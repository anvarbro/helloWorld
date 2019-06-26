package learning;

public class Door {

	private InnerAnonymousClass lock;
	
	public InnerAnonymousClass getLock() {
		return lock;
	}

	public Door() {
		lock = new InnerAnonymousClass();
	}
	public void shopStatus() {
		if(lock.isLock()) {
			System.out.println("Shop is closed, please visit later");
		}else {
				System.out.println("Welcome, we are open");
			}
		}
	}
	
	
	 class Lock{
		private boolean lock;

		public Lock(boolean lock) {
			this.lock = lock;
		}

		public boolean isLock() {
			return lock;
		}

		public void setLock(boolean lock) {
			this.lock = lock;
		}
		
		
	}
	
	

