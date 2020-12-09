package sec02_runtime_exception;

public class ClassCastExceptionExample {
	public static void main(String[] args) {
		Animal animal1 = new Dog();
		Dog dog1 = (Dog) animal1;
//		Cat cat1 = (Cat) animal1; //ClassCastException가 발생한다.
		
		Animal animal2 = new Dog();
		Dog dog2 = (Dog) animal2;
		changeDog(dog2);

		Cat cat2 = new Cat();
		changeDog(cat2);
		
	}
	public static void changeDog(Animal animal) {
		//매개값으로 주어진 animal 객체가 Dog객체를 참조하고 있지 않는 경우,
		//ClassCastException이 발생하므로, 이를 방지하기 위해 if문 처리해주었다.
		if(animal instanceof Dog) {
			Dog dog = (Dog) animal;
		} else {
			System.out.println("Dog타입으로 변환이 어렵습니다.");
		}
	}
}
class Animal {}
class Dog extends Animal {}
class Cat extends Animal {}