package com.abelavusau.algoritms.tasks;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class StringCombinationsTest {
	private StringCombinations underTest;

	@Before
	public void setUp() throws Exception {
		underTest = new StringCombinations("abcd");
	}

	@After
	public void tearDown() throws Exception {
		underTest = null;
	}

	@Test
	public void testCombine() {
		underTest.combine();
		assertEquals(15, underTest.getCount());
	}
}
