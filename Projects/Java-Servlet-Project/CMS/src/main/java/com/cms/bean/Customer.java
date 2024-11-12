package com.cms.bean;

public class Customer {
	public Customer() {
		super();

	}

	public Customer(int cid, String cname, String caccount, int cbalance) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.caccount = caccount;
		this.cbalance = cbalance;
	}

	private int cid;
	private String cname;
	private String caccount;
	private int cbalance;

	public String getCaccount() {
		return caccount;
	}

	public void setCaccount(String caccount) {
		this.caccount = caccount;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public int getCbalance() {
		return cbalance;
	}

	public void setCbalance(int cbalance) {
		this.cbalance = cbalance;
	}

}
