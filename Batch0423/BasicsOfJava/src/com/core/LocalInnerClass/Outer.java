package com.core.LocalInnerClass;

// local inner class -> class inside a method
public class Outer {
	public String outerMethod(int no) {
		class Inner {
			public String innerMethod(int no) {
				if (no < 10)
					return "Inner Method 10";
				else
					return "Inner method 20";
			}
		}

		Inner i = new Inner();
		String result = i.innerMethod(no);
		return result;
		// return new Inner().innerMethod(no);
	}
}
