package com.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.day7.junit.FactClass;

@RunWith(Suite.class)
@SuiteClasses({
	CalculatorTest.class,
	FactClass.class
})
public class TestShortClass {

}
