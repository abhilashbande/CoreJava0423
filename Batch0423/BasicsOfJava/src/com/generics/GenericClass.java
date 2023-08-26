package com.generics;

public class GenericClass<T> {
	T t;	// Integer t

	public GenericClass(T t) {
		super();
		this.t = t;
	}

	@Override
	public String toString() {
		return "GenericClass [t=" + t + "]";
	}

}
