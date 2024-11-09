package com.day6;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class QueueClass {

	public static void main(String[] args) {
		Queue<Integer> q1=new LinkedList<>();
		q1.offer(10);
		q1.offer(20);
		q1.offer(30);
		q1.offer(40);
		q1.offer(50);
		System.out.println(q1);
		q1.poll();
		System.out.println(q1);
		
		Deque<Integer> d1=new LinkedList<>();
		d1.offer(10);
		d1.offer(20);
		d1.offer(30);
		d1.offer(40);
		d1.offer(50);
		System.out.println(d1);
		d1.offerFirst(60);
		d1.offerLast(80);
		System.out.println(d1);
		d1.pollFirst();
		d1.pollLast();
		System.out.println(d1);
		

	}

}
