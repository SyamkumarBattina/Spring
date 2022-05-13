package com.test;

public class Student {
	private int stdid;
	private String stdname;
	private String stdaddress;
	
	
	
	
	public Student() {
		super();
		
	}
	
	public Student(int stdid, String stdname, String stdaddress) {
		super();
		this.stdid = stdid;
		this.stdname = stdname;
		this.stdaddress = stdaddress;
	}

	public int getStdid() {
		return stdid;
	}
	public void setStdid(int stdid) {
		this.stdid = stdid;
	}
	public String getStdname() {
		return stdname;
	}
	public void setStdname(String stdname) {
		this.stdname = stdname;
	}
	public String getStdaddress() {
		return stdaddress;
	}
	public void setStdaddress(String stdaddress) {
		this.stdaddress = stdaddress;
	}
	@Override
	public String toString() {
		return "Student Details: [stdid=" + stdid + ", stdname=" + stdname + ", stdaddress=" + stdaddress + "]";
	}
	

}
