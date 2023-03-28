package com.employ;

public class Employee {

	
	
	int empid;
	String ename;
	int empsalary;
	
	
	public int getEmpid() {
		return empid;
	}


	public void setEmpid(int empid) {
		this.empid = empid;
	}


	public String getEname() {
		return ename;
	}


	public void setEname(String ename) {
		this.ename = ename;
	}


	public int getEmpsalary() {
		return empsalary;
	}


	public void setEmpsalary(int empsalary) {
		this.empsalary = empsalary;
	}


	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", ename=" + ename + ", empsalary=" + empsalary + "]";
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
