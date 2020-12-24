package sec06_와일드카드타입.exam01_genericWildCard;

public class Course<T> {
	private String name;
	private T[] students;
	
	public Course(String name, int capacity) {
		this.name = name;
		students = (T[]) (new Object[capacity]);//아직 T타입이 결정되지 않은 상태에서 배열의 크기를 정하고, 배열객체를 생성할 수 없음: new T[capacity] 생성은 불가능
	}
	
	public String getName() {return name;}
	public T[] getStudents() {return students;}

	public void add(T t) {
		for(int i =0; i<students.length; i++) {
			if(students[i] == null) {
				students[i] = t;
				break;
			}
		}
	}
}