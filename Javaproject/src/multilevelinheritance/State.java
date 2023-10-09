package multilevelinheritance;

public class State extends Country{
	private String statename;

	public State(String countryname, String statename) {
		super(countryname);
		this.statename = statename;
	}

	@Override
	public String toString() {
		return "State [statename=" + statename + ", toString()=" + super.toString();
	}

	//@Override
	//public String toString() {
	//	return "State [statename=" + statename + "]";
	//}

	//public State(String countryname) {
	//	super(countryname);
	//	// TODO Auto-generated constructor stub
	//}
	

}
