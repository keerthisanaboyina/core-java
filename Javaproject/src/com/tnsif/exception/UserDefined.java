package com.tnsif.exception;

import java.util.Scanner;

public class UserDefined {

	private static int age;
	static void validate() throws Age
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter age");
		age=sc.nextInt();
		if(age<18)
			 throw new Age("Invalid  age,you are not elligible");
		else
		    System.out.println("you can vote");
		    
	}
	
}
