package sec02_runtime_exception;

public class ClassCastExceptionExample {
	public static void main(String[] args) {
		Animal animal1 = new Dog();
		Dog dog1 = (Dog) animal1;
//		Cat cat1 = (Cat) animal1; //ClassCastException�� �߻��Ѵ�.
		
		Animal animal2 = new Dog();
		Dog dog2 = (Dog) animal2;
		changeDog(dog2);

		Cat cat2 = new Cat();
		changeDog(cat2);
		
	}
	public static void changeDog(Animal animal) {
		//�Ű������� �־��� animal ��ü�� Dog��ü�� �����ϰ� ���� �ʴ� ���,
		//ClassCastException�� �߻��ϹǷ�, �̸� �����ϱ� ���� if�� ó�����־���.
		if(animal instanceof Dog) {
			Dog dog = (Dog) animal;
		} else {
			System.out.println("DogŸ������ ��ȯ�� ��ƽ��ϴ�.");
		}
	}
}
class Animal {}
class Dog extends Animal {}
class Cat extends Animal {}