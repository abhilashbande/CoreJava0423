package com.stack;

import java.util.Stack;

public class StackI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> stack = new Stack<String>();
		
		stack.push("Shravni");
		stack.push("Rohit");
		stack.push("Tanisha");
		stack.push("Sandhya");
		stack.push("Shanti");
		stack.push("Afroj");
		
		System.out.println(stack);
		System.out.println("Peek = " + stack.peek());
		System.out.println(stack.pop());
		System.out.println("Peek = " + stack.peek());
//		System.out.println(stack.pop());
//		System.out.println(stack.peek());
//		System.out.println(stack.pop());
//		System.out.println(stack.pop());
//		System.out.println(stack.pop());
//		System.out.println(stack.pop());

	}

}
