package com.oops.inheritance.abstract2;

public class Arts extends Student {
	private double history;
	private double music;

	public Arts(String name) {
		super(name);
		this.history = 0.0;
		this.music = 0.0;
	}

	public double getHistory() {
		return history;
	}

	public void setHistory(double history) {
		this.history = history;
	}

	public double getMusic() {
		return music;
	}

	public void setMusic(double music) {
		this.music = music;
	}

	@Override
	public String toString() {
		return "Arts [history=" + history + ", music=" + music + ", getPercentages()=" + getPercentages()
				+ ", getRollNo()=" + getRollNo() + ", getName()=" + getName() + "]";
	}

	@Override
	public double calculatePercentage() {
		double percentage = (this.music + this.history) / 2.0;
		super.setPercentages(percentage);
		return percentage;
	}

}
