package com.core.accessSpecifiers;

public class ParentClass {
	private int privateParentMember;
	int defaultParentMember;
	protected int protectedParentMember;
	public int publicParentMember;
	
	public void testAccess() {
		privateParentMember = 10;
		defaultParentMember = 10;
		protectedParentMember = 10;
		publicParentMember = 10;
	}
	
	
	
	
	
}
