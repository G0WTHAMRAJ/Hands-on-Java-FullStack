package com.cms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;
import java.util.List;

import com.cms.bean.Customer;
import com.cms.util.DBUtil;

public class CustomerDAO {
	public int insertCustomer(Customer customer) {
		int n = 0;
		try {
			Connection con = DBUtil.getConnection();
			String sql = "insert into customer values(?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, customer.getCid());
			ps.setString(2, customer.getCname());
			ps.setString(3, customer.getCaccount());
			ps.setInt(4, customer.getCbalance());
			n = ps.executeUpdate();

		} catch (Exception e) {
			System.out.println(e);
		}
		return n;

	}

	public int deleteCustomer(int cid) {
		int n = 0;
		try {
			Connection con = DBUtil.getConnection();
			String sql = "delete from customer where cid=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, cid);
			n = ps.executeUpdate();

		} catch (Exception e) {
			System.out.println(e);
		}
		return n;

	}

	public int updateCustomer(Customer customer) {
		int n = 0;
		try {
			Connection con = DBUtil.getConnection();
			String sql = "update customer set cname=?,cbalance=?,caccount=? where cid=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, customer.getCname());
			ps.setInt(2, customer.getCbalance());
			ps.setString(3, customer.getCaccount());
			ps.setInt(4, customer.getCid());
			n = ps.executeUpdate();

		} catch (Exception e) {
			System.out.println(e);
		}
		return n;

	}

	public Customer findCustomer(int cid) {
		Customer cust = null;
		try {
			Connection con = DBUtil.getConnection();
			String sql = "select * from customer where cid =?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, cid);
			ResultSet res = ps.executeQuery();
			if (res.next()) {
				cust = new Customer();
				cust.setCid(res.getInt("cid"));
				cust.setCname(res.getString("cname"));
				cust.setCaccount(res.getString("caccount"));
				cust.setCbalance(res.getInt("cbalance"));
			}

		} catch (Exception e) {
			System.out.println(e);
		}
		return cust;

	}

	public List<Customer> findAllCustomer() {
		List<Customer> list = new LinkedList<>();
		try {
			Connection con = DBUtil.getConnection();
			String sql = "select * from customer";
			PreparedStatement ps = con.prepareStatement(sql);

			ResultSet res = ps.executeQuery();
			while (res.next()) {
				Customer cust = new Customer();
				cust.setCid(res.getInt("cid"));
				cust.setCname(res.getString("cname"));
				cust.setCaccount(res.getString("caccount"));
				cust.setCbalance(res.getInt("cbalance"));
				list.add(cust);
			}

		} catch (Exception e) {
			System.out.println(e);
		}
		return list;

	}

}
