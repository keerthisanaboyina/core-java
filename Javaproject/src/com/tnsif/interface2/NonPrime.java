package com.tnsif.interface2;

public class NonPrime  implements Accounts {

	@Override
	public void deliveryCharge() {
		// TODO Auto-generated method stub
		int amt=100;
		System.out.println("the delivery charge for nonprime account :"+amt);
	}

	@Override
	public void deliveryCharge(int n) {
		// TODO Auto-generated method stub
		System.out.println("the delivery charge for nonprime account :"+n);
	}

}
