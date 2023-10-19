package com.tns.collections;

public class WrapperDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int a=10;
         int b=20;//primitive
         Integer i=new Integer(b);
         Integer i1=new Integer(a);
         System.out.println("i is  an object of type integer "+i1);
         System.out.println("i is  an object of type integer "+i);
         int unwrap=i.intValue();
	}

}
