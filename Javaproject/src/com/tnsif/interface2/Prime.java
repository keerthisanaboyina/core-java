package com.tnsif.interface2;

public class Prime implements Accounts {

	@Override
	public void deliveryCharge() {
		// TODO Auto-generated method stub
		int amt=0;
		System.out.println("the delivery charge for prime account :"+amt);
	}

	@Override
	public void deliveryCharge(int n) {
		// TODO Auto-generated method stub
		System.out.println("the delivery charge for prime account :"+n);
	}

}
