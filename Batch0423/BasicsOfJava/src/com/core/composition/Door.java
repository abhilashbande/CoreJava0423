package com.core.composition;

public class Door {
	private String color;
	private String material;
	private double size;

	public Door(String color, String material, double size) {
		super();
		this.color = color;
		this.material = material;
		this.size = size;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public double getSize() {
		return size;
	}

	public void setSize(double size) {
		this.size = size;
	}

	@Override
	public String toString() {
		return "Doors [color=" + color + ", material=" + material + ", size=" + size + "]";
	}

}
