package com.tnsif.exception;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the rollno");
        int rollno=sc.nextInt();
        if(rollno<0)
        {
        	throw new ArithmeticException("roll no cannot be zero");
        }
        else
        {
        	System.out.println("valid rollno");
        }
	}

}
