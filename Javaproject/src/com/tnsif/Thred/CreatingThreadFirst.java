package com.tnsif.Thred;

public class CreatingThreadFirst extends Thread {
	
	public void run()
	{
		System.out.println("Hello");
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CreatingThreadFirst ob= new CreatingThreadFirst();
		ob.start();
		//ob.start();  illegal exception
		ob.run();
		ob.run();
	}

}
