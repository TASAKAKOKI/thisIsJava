package sec05_표준API의_함수적인터페이스.exam07_andThen_compose;

public class Address {
	private String counrty;
	private String city;
	
	public Address(String counrty, String city) {
		this.counrty = counrty;
		this.city = city;
	}

	public String getCounrty() {return counrty;}
	public String getCity() {return city;}
}