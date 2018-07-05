package com.liberty.upskill.Overloading;

public class DayScholar extends student {
	
	public void calculateFees(double semFees) {
		double feePerMonth;
		
		feePerMonth=semFees/6;
		System.out.println("Fee Amount for DayScholar:"+feePerMonth);
		
	}
}
