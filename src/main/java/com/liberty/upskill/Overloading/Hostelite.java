package com.liberty.upskill.Overloading;

public class Hostelite extends student {

	public void calculateFees(double semFees,double hostFees) {
		
		double feePerMonth;
		feePerMonth=(semFees/6)+hostFees;
		System.out.println("Fee Amount for Hostelite:"+feePerMonth);
		
	}
}
