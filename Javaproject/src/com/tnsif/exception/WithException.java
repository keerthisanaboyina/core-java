package com.tnsif.exception;

import java.util.InputMismatchException;

public class WithException {
         
	public static void divide()
	{
		int a=6,b=0,c;
		try
		{
			c=a/b;
		}
		catch(ArithmeticException e)
		{
			System.out.println("exception caught " +e.getMessage());
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("exception caught " +e.getMessage());
		}
		catch(InputMismatchException e)
		{
			System.out.println("exception caught " +e.getMessage());
		}
		catch(Exception e)
		{
			System.out.println("exception caught " +e.getMessage());
		}
		finally
		{
			System.out.println("this will be executed");
		}
	}
}
