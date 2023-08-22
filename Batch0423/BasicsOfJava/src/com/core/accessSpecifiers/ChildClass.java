package com.core.accessSpecifiers;

public class ChildClass extends ParentClass {
	private int privateChildMember;
	int defaultChildMember;
	protected int protectedChildMember;
	public int publicChildMember;
	
	public void testAccess() {
		//privateParentMember = 10;
		defaultParentMember = 10;
		protectedParentMember = 10;
		publicParentMember = 10;
	}
}
