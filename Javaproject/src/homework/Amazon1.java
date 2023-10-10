package homework;

import java.util.Scanner;

public class Amazon1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner in =new Scanner(System.in);
		System.out.println("eneter the amount");
		n=in.nextInt();
       Accounts1 a=new Prime1();
       Accounts1 a1=new Nonprime1();
       a.deliveryCharge(0);
       a1.deliveryCharge(n);
	}

}
