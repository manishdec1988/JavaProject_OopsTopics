package com.liberty.upskill.Inheritance;


/**In a Retail application, let us assume that the customers can be registered customers or regular customers. All the customers have some common details .
In addition, the registered customers are eligible for discounts based on purchase.
The regular customers can accumulate credit points based on regular purchase and get gifts . 
If we need to make use of an existing class  or enhance existing class then Inheritance will come in the picture
*/

class InheritanceExample{
	public static void main(String args[]){
		Employee emp=new Employee();
		emp.setPanNo("AIOPJ706Q");
		emp.setEmpAddress("100 libery way");
		emp.setEmpName("Jack");
		emp.setEmpPhone("425-987-9876");
		emp.setEmpNo(1100);
		emp.setPassport("J76766677");
		System.out.println("Pancard No :"+emp.getPanNo());
		System.out.println("Employee No :"+emp.getEmpNo());
		System.out.println("Employee Address :"+emp.getEmpAddress());
		System.out.println("Employee Phone :"+emp.getEmpPhone());
		System.out.println("Employee Name :"+emp.getEmpName());
		System.out.println("Passport Name :"+emp.getPassport());
	}
}
