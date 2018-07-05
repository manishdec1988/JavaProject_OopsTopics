package com.liberty.upskill.Overloading;


/** In a course Management Application, let us assume that the formula for calculation of Fee for DayScholar  and Hostelite.
 *  For the DayScholar, free per month will be calculated based on semester fee and for Hostelite,fee will be calculated based on semester+ Hostel fee.
 *  Then Method overloading will come in the picture where same method name with different argument list with different implementation
 *
 */

public class MethodOverLoading {

	public static void main(String[] args) {
		DayScholar dayObj=new DayScholar();
		Hostelite hostObj=new Hostelite();
		StudentWithBankLoan bankObj =new StudentWithBankLoan();
		dayObj.calculateFees(30000);
		hostObj.calculateFees(30000, 4000);
		bankObj.calculateFees(30000, 10);
	}

}
