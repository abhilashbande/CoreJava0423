package com.core.composition;

public class Tyre {
	private float size;

	public Tyre(float size) {
		super();
		this.size = size;
	}

	public float getSize() {
		return size;
	}

	public void setSize(float size) {
		this.size = size;
	}

	@Override
	public String toString() {
		return "Tyre [size=" + size + "]";
	}

}
