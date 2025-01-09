package com.rays.unittt;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestAssertEqual {

	@Test
	public void testAssertEqual() throws Exception {

		UserBean bean = UserModel.findByPk(600);
		assertTrue(bean == null);

//		int max = Calculation.findMax(new int[] { 1, 3, 4, 2, 6 });
//
//		assertEquals(6, max);

	}

}