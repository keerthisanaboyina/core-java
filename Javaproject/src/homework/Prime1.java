package homework;

public class Prime1 implements Accounts1{

	public void deliveryCharge(){
		int amt=0;
		System.out.println("the money:" +amt);
	}

	@Override
	public void deliveryCharge(int n) {
		// TODO Auto-generated method stub
		System.out.println("the charge of delivery for prime :"+ n);
	}
}
