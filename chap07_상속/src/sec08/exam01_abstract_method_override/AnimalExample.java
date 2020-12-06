package sec08.exam01_abstract_method_override;

public class AnimalExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog = new Dog();
		Cat cat = new Cat();
		dog.sound();
		cat.sound();
		System.out.println("-----");
		
		Animal animal = null;
		animal = new Dog();
		animal.sound();
		animal = new Cat();
		animal.sound();
		System.out.println("-----");
		
		animalSound(dog);
		animalSound(cat);
	}
	public static void animalSound(Animal animal) {
		animal.sound();
	}
}