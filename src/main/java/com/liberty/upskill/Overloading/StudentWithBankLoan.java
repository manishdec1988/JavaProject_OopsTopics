package com.liberty.upskill.Overloading;

public class StudentWithBankLoan {
	public void calculateFees(double semFees,double ROI) {
		double feePerMonth;
		
		feePerMonth=(semFees/6)+(semFees*ROI)/100;
		System.out.println("Fee Amount for Student having BankLoan:"+feePerMonth);
		
	}

}
