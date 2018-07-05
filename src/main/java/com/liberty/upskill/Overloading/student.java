package com.liberty.upskill.Overloading;

public class student {
	int studentId;
  	char studentType;
    String studentName;
    String residentialStatus;
    double feePerMonth;
    
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public char getStudentType() {
		return studentType;
	}
	public void setStudentType(char studentType) {
		this.studentType = studentType;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getResidentialStatus() {
		return residentialStatus;
	}
	public void setResidentialStatus(String residentialStatus) {
		this.residentialStatus = residentialStatus;
	}
	public double getFeePerMonth() {
		return feePerMonth;
	}
	public void setFeePerMonth(double feePerMonth) {
		this.feePerMonth = feePerMonth;
	} 
	
	public void calculateFees(){
		System.out.println("Fee Amount ");
	}
}
