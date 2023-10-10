package com.tnsif.staticprograms;

public class Myclass {

	private int section;
	private static int srno;
	
	static
	{
		System.out.println("......static block.....");
	}
	
	Myclass()
	{
		System.out.println("......constructor block.....");
		srno++;
		section++;
	}
	static void  display()
	{
		System.out.println("..... block.....");	
	
	}
	public Myclass(int section) {
		super();
		this.section = section;
	}
	@Override
	public String toString() {
		return "Myclass [section=" + section  +" srno="+srno+" ]";
	}
	
	
}
