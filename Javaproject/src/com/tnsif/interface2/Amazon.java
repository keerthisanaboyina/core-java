package com.tnsif.interface2;

public class Amazon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Accounts a=new Prime();
       Accounts a1=new NonPrime();
       a.deliveryCharge(10);
       a1.deliveryCharge(200);
       }

}
