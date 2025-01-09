package com.rays.unittt;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import junit.framework.TestCase;

public class TestAssertNotNull extends TestCase {

	@Test
	public void testFindByPk() throws Exception {

		UserBean bean = UserModel.findByPk(1);
		//System.out.println(bean);
		assertNotNull("user is null", bean);

	}

}