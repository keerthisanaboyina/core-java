package multilevelinheritance;

public class City  extends State {
	
	private String cityname;
	
	public City(String countryname, String statename) {
		super(countryname, statename);
		this.cityname=cityname;// TODO Auto-generated constructor stub
	}



	
	//public City(String statename) {
	//	super(statename);
	//	this.cityname=cityname;
		// TODO Auto-generated constructor stub
      // }
}
