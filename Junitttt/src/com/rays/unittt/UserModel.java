package com.rays.unittt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserModel {

	public static void add(UserBean bean) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/adv", "root", "root");

		PreparedStatement s = conn.prepareStatement("INSERT INTO emp (id, name, salary) VALUES (?, ?, ?)");

		s.setInt(1, bean.getId());
		s.setString(2, bean.getName());
		s.setInt(3, bean.getSalary());

		int i = s.executeUpdate();

		System.out.println("data inserted " + i);

	}

	public static void update(UserBean bean) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/adv", "root", "root");

		PreparedStatement s = conn.prepareStatement("update emp set name = ?, salary = ? where id = ?");
		s.setString(1, bean.getName());
		s.setInt(2, bean.getSalary());
		s.setInt(3, bean.getId());

		int i = s.executeUpdate();

		System.out.println("data Updated " + i);

	}

	public static void delete(int id) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance", "root", "root");
		PreparedStatement s = conn.prepareStatement("delete from emp where id = ?");

		s.setInt(1, id);

		int i = s.executeUpdate();

		System.out.println("data deleted " + i);

	}

	public static UserBean findByPk(int id) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/adv", "root", "root");

		PreparedStatement ps = conn.prepareStatement("select * from emp where id = ?");

		ps.setInt(1, id);

		ResultSet rs = ps.executeQuery();

		UserBean bean = null; 
		while (rs.next()) {

			 bean = new UserBean();

			bean.setId(rs.getInt(1));
			bean.setName(rs.getString(2));
			bean.setSalary(rs.getInt(3));

		}
		return bean;

	}
}
