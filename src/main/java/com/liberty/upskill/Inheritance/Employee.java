package com.liberty.upskill.Inheritance;

class Employee extends Person{
	private int empNo;
	private String empName;
	private String empPhone;
	private String empAddress;
	public void setEmpNo(int no){
		empNo=no;
	}
	public int getEmpNo(){
		return empNo;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpPhone() {
		return empPhone;
	}
	public void setEmpPhone(String empPhone) {
		this.empPhone = empPhone;
	}
	public String getEmpAddress() {
		return empAddress;
	}
	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}
	
	
}

