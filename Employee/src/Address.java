
public class Address {
	
	private String AddrStreet;
	private String AddrCity;
	private int AddrPin;
	
	private Employe e1;

	public Address(String addrStreet, String addrCity, int addrPin, Employe e1) {
		super();
		AddrStreet = addrStreet;
		AddrCity = addrCity;
		AddrPin = addrPin;
		this.e1 = e1;
	}

	public String getAddrStreet() {
		return AddrStreet;
	}

	public String getAddrCity() {
		return AddrCity;
	}

	public int getAddrPin() {
		return AddrPin;
	}

	public Employe getE1() {
		return e1;
	}
	
	
	
	
	
}
