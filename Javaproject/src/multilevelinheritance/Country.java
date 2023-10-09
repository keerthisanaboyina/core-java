package multilevelinheritance;

public class Country {
     private String countryname;

	public Country(String countryname) {
		super();
		this.countryname = countryname;
	}

	@Override
	public String toString() {
		return "Country [countryname=" + countryname + "]";
	}
     
}
