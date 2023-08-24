package com.core.InnerClass;

// outer class
public class Door {
	private Lock lock;

	public Door() {
		lock = new Lock(true);
	}

	public Lock getOuterLock() {
		return lock;
	}

	public void setOuterLock(Lock lock) {
		this.lock = lock;
	}
	
	public void status() {
		if(lock.isLock()) {
			System.out.println("The door is locked...");
		} else {
			System.out.println("The door is open...Welcome!!!");
		}
	}

	// inner class -  class inside a class 
	public class Lock {
		private boolean lock;

		public Lock(boolean lock) {
			super();
			this.lock = lock;
		}

		public boolean isLock() {
			return lock;
		}

		public void setInnerLock(boolean lock) {
			this.lock = lock;
		}
	}
}
