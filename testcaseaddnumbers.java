package jUnitTestPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testcaseaddnumbers {

	@Test
	public void test() {
		jUnitFunctions junit = new jUnitFunctions();
		int result = junit.testcaseaddnumbers(100, 200);
		assertEquals(300,result);
	}

}