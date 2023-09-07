package com.core.InnerClass;

public class Car {
	private Tyre tyre;

	public Car(int tyreSize, String tyreColor) {
		super();
		this.tyre = new Tyre(tyreSize, tyreColor);
	}

	public Tyre getTyre() {
		return tyre;
	}

	public void setTyre(Tyre tyre) {
		this.tyre = tyre;
	}

	@Override
	public String toString() {
		return "Car [tyre=" + tyre + "]";
	}

	class Tyre {
		private int size;
		private String color;

		public Tyre(int size, String color) {
			super();
			this.size = size;
			this.color = color;
		}

		public int getSize() {
			return size;
		}

		public void setSize(int size) {
			this.size = size;
		}

		public String getColor() {
			return color;
		}

		public void setColor(String color) {
			this.color = color;
		}

		@Override
		public String toString() {
			return "Tyre [size=" + size + ", color=" + color + "]";
		}

	}
}
