package tests;

import org.testng.annotations.Test;

import taskOne.ClassOne;

public class Test_001 extends ClassOne {

	@Test
	public void tc_001() {
		methodOne();
	}
	
	@Test
	public void tc_002() {
		methodTwo();
	}
	
	@Test
	public void tc_003() {
		methodThree();
	}
}
