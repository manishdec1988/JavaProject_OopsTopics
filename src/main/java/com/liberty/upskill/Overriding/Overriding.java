package com.liberty.upskill.Overriding;


/** In a Retail Application, let us assume that the formula for calculation of bill for registered customers include a discount.
 *  For the regular customers , the credit points need to be added based on purchase amount.
 *  The type of customer is decided when the calculation of bill is done /*
 *  Identify a means to invoke the corresponding calculation of bill functionality based on the kind of customer at bill calculation time. 
 *  Then Method overriding will come in the picture
 *
 */
class Overriding{
	 public static void main(String args[]){
		 
		//calling the RegularCustomer
  		RegularCustomer rObj=new RegularCustomer();
  		rObj.setCustomerNo(1001);
  		rObj.setCustomerName("Alphy");
  		rObj.setPurchaseAmount(5000.00);
  		System.out.println("Customer Number:"+rObj.getCustomerNo());
  		System.out.println("Customer Name:  "+rObj.getCustomerName());
  		System.out.println("Purchase Amount:"+rObj.getPurchaseAmount());
  		rObj.calculateBill();

  		
  	   //calling the RegisteredCustomer
  		RegisteredCustomer reObj=new RegisteredCustomer();
  		reObj.setCustomerNo(1002);
		reObj.setCustomerName("Tom");
  		reObj.setPurchaseAmount(3000.00);
		reObj.setDiscount(5);
  		System.out.println("Customer Number:"+reObj.getCustomerNo());
		System.out.println("Customer Name:  "+reObj.getCustomerName());
  		System.out.println("Purchase Amount:"+reObj.getPurchaseAmount());
  		reObj.calculateBill();
	}
}
