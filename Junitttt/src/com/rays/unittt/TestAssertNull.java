package com.rays.unittt;

import org.junit.Test;

import junit.framework.TestCase;

public class TestAssertNull extends TestCase {

	@Test
	public void testFindByPk() throws Exception {

		UserBean bean = UserModel.findByPk(90);

//	     Sirf ek baar check karo ki bean null hai ya nahi
		assertNull(bean);

//		 assertTrue(bean == null);
//		assertTrue("is not true", bean == null);

	}
}