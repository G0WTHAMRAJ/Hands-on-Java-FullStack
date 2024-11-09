package com.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.day7.junit.Calculator;

public class CalculatorTest {

	@BeforeClass
	public static void beforeClass() {
		System.out.println("Before Class");
	}
	
	@AfterClass
	public static void afterClass() {
		System.out.println("After Class");
	}
	
	@Before
	public void before() {
		System.out.println("before");
	}
	@After
	public void after() {
		System.out.println("after");
	}
	
	
	@Test
	public void testAddition() {
		System.out.println("testAddition");

		
	/*	Calculator calc=new Calculator();
		int actual =calc.addition(10, 20);
		int expected=30;
		assertEquals(expected,actual);
		*/
	}

	@Test
	public void testSub() {
		System.out.println("testSub");
		/*
		Calculator calc=new Calculator();
		int actual =calc.sub(100, 20);
		int expected=80;
		assertEquals(expected,actual);
		*/
		
	}

}
