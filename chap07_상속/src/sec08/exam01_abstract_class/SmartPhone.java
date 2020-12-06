package sec08.exam01_abstract_class;

//추상클래스 Phone을 상속한 SmartPhone 클래스 선언
public class SmartPhone extends Phone{
	//추상클래스를 상속받았으므로,
	//부모 클래스인 Phone의 생성자를 호출하여 부모 객체를 생성하여야 한다.
	public SmartPhone(String owner) {
		super(owner);
	}
	
	public void internetSearch() {
		System.out.println("인터넷 검색을 합니다.");
	}
}
