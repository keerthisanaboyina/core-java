package com.tns.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList <Integer>list1=new ArrayList(); 
		System.out.println(" list is empty or not  :"+ list1.isEmpty());
		list1.add(10);
		//list1.add('w');
		list1.add(20);
		System.out.println("size of the list : "+list1.size());
		System.out.println("the elemens of list are :"+list1);
		System.out.println("the element present or not : "+list1.contains(15));
		System.out.println(" element at the position : "+list1.get(1));	
		System.out.println("remove an element :"+list1.remove(0));
		System.out.println("size of the list : "+list1.size());
		list1.add(5);
		list1.add(25);
		list1.add(14);
		System.out.println("the elemens of list are :"+list1);
        Iterator<Integer> i=list1.iterator();
        while(i.hasNext())
        {
        	Integer p =i.next(); 
        	System.out.println(p);
        }
	}
	

}
