package com.core.LocalInnerClass;




public class Door {
	// local inner class
	public boolean isLocked(String key) {
		
		class Lock {
			public boolean locked(String username) {
				if(username.equals("admin"))
					return false;
				else
					return true;
			}
		}
		
//		Lock lock = new Lock();
//		boolean returnValue = lock.locked(key);
//		return returnValue;
		
		return new Lock().locked(key);		
	}
}
