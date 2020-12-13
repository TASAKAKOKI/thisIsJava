package sec06.exam02_reflection;

public class Car {
	private String model;
	private String owner;
	
	Car(String model, String owner) {
		this.model = model;
		this.owner = owner;
	}
	
	public String getOwner() {
		return this.owner;
	}
	
	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getModel() {
		return this.model;
	}
	
	public void setModel(String model) {
		this.model = model;
	}

}