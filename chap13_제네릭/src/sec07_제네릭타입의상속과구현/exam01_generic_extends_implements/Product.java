package sec07_제네릭타입의상속과구현.exam01_generic_extends_implements;

public class Product <K,V>{
	private K kind;
	private V model;
	
	public K getKind() {
		return kind;
	}
	public void setKind(K kind) {
		this.kind = kind;
	}
	public V getModel() {
		return model;
	}
	public void setModel(V model) {
		this.model = model;
	}
}

class Tv {
	
}