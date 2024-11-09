package com.day6;

import java.util.Iterator;
import java.util.Stack;

public class StackClass {

	public static void main(String[] args) {
		Stack<Integer> stack=new Stack<>();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		System.out.println(stack);
		stack.pop();
		System.out.println(stack);
		
		Iterator<Integer> it =stack.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("Peek Method");
		System.out.println(stack.peek());
	}

}
