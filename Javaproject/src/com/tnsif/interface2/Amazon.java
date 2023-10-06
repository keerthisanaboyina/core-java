package com.tnsif.interface2;

import java.util.Scanner;

public class Amazon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int amt;
		
       Accounts a=new Prime();
       Accounts a1=new NonPrime();
       a.deliveryCharge(0);
       a1.deliveryCharge(1000);
       }

}
