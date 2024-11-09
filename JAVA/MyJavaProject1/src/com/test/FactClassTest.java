package com.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.day7.junit.FactClass;

public class FactClassTest {

	@Test
	public void testMulti() {
		FactClass ft=new FactClass();
		int actual =ft.multi(10, 20);
		int expected=200;
		assertEquals(expected,actual);
	}

}
