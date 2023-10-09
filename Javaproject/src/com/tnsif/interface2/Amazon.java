package com.tnsif.interface2;

import java.util.Scanner;

public class Amazon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Accounts a=new Prime();
       Accounts a1=new NonPrime();
       a.deliveryCharge();
       a1.deliveryCharge();
       }

}
