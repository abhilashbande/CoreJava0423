package com.core.LocalInnerClass;

public class Door {
	// local inner class
	public boolean isLocked(String key) {
		class Lock {
			public boolean isLock(String key) {
				if(key.equals("asdf")) {
					return false;
				} else {
					return true;
				}
			}
		}
		return new Lock().isLock(key);
	}
}
