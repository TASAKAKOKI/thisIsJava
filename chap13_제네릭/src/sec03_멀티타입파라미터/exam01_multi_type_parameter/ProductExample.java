package sec03_멀티타입파라미터.exam01_multi_type_parameter;

public class ProductExample {
	public static void main(String[] args) {
		Product<Tv, String> product1 = new Product<>();
		product1.setKind(new Tv());
		product1.setModel("스마트 TV");
		
		Tv kind1 = product1.getKind();
		String model1 = product1.getModel();
		System.out.println("Tv의 모델명: " + model1);
		
		Product<Car, String> product2 = new Product<>();
		product2.setKind(new Car());
		product2.setModel("스마트 자동차");
		
		Car kind2 = product2.getKind();
		String model2 = product2.getModel();
		System.out.println("Car의 모델명: " + model2);
	}
}