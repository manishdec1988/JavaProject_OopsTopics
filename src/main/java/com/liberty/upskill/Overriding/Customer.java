package com.liberty.upskill.Overriding;

class Customer{
	int customerNo;
  	String customerName;
  	double purchaseAmount;
  	public void setCustomerNo(int no){
    		customerNo=no;
	}
	public void setCustomerNo(Customer obj){
   		obj.customerNo=2300;
 	}
 	public void setCustomerName(String name){
			customerName=name;
	}
 	public void setPurchaseAmount(double amount){
			purchaseAmount=amount;
	}
 	public int getCustomerNo(){
   		return customerNo;
  	}
  	public String getCustomerName(){
			return customerName;
	}
	public double getPurchaseAmount(){
			return purchaseAmount;
	}

  	public void calculateBill(){
		System.out.println("Calculation of Bill");
	}

}
