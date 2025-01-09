package com.rays.unittt;

import static org.junit.Assert.fail;

import org.junit.Test;

public class TestUserModel {

	@Test
	public void testAdd() throws Exception {

		UserBean bean = new UserBean();
		bean.setId(100);
		bean.setName("asdfghj");
		bean.setSalary(5000);

		UserModel model = new UserModel();

		model.add(bean);

		bean = model.findByPk(1);

		if (bean == null) {

			fail("Record is not added...!!!");

		} else {

			System.out.println("Record is  added...!!!");

		}

	}

}