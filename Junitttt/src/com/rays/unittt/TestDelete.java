package com.rays.unittt;

import static org.junit.Assert.assertNull;

import org.junit.Test;

public class TestDelete {

	@Test
	public void delete() throws Exception {

		UserModel.delete(3);

		UserBean bean = UserModel.findByPk(3);

		assertNull(bean);

	}
}
