package com.liberty.upskill.Overriding;

class RegisteredCustomer extends Customer{
	double discount;
	void setDiscount(double discount){
		this.discount=discount;
	}
	double getDiscount(){
		return discount;
	}
	public void calculateBill(){
		double billAmount;
		billAmount=purchaseAmount-((purchaseAmount*discount)/100.0);
		System.out.println("Bill Amount:"+billAmount);
	}
}
