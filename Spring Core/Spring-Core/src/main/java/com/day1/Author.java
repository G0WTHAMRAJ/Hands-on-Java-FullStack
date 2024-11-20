package com.day1;

public class Author {
	private String aname;
	private String alocation;

	public String getAname() {
		return aname;
	}

	public void setAname(String aname) {
		this.aname = aname;
	}

	public String getAlocation() {
		return alocation;
	}

	public void setAlocation(String alocation) {
		this.alocation = alocation;
	}

	public Author(String aname, String alocation) {
		super();
		this.aname = aname;
		this.alocation = alocation;
	}

	public Author() {
		super();
		
	}

	@Override
	public String toString() {
		return "Author [aname=" + aname + ", alocation=" + alocation + "]";
	}

}
