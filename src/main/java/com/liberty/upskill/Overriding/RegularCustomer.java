package com.liberty.upskill.Overriding;

class RegularCustomer extends Customer{
	int creditPoints;
	void setCreditPoints(int credit){
		creditPoints=credit;
	}
	int getCreditPoints(){
		return creditPoints;
	}
	public void calculateBill(){
		if(purchaseAmount>=2000){
			creditPoints=10;
		}
		else{
			creditPoints=5;
		}
		System.out.println("Bill Amount:"+purchaseAmount);
		System.out.println("Credit Points:"+creditPoints);
	}
}
