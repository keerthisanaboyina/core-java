package homework;

public class Nonprime1 implements Accounts1 {
      int n;
      
	public int getN() {
		return n;
	}
	public void setN(int n) {
		this.n = n;
	}
	public Nonprime1() {
		super();
	}
	@Override
	public void deliveryCharge(int n) {
		// TODO Auto-generated method stub
		System.out.println("the charge of delivery got non prime :"+ n);
	}
    
}
