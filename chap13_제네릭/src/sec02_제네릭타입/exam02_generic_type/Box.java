package sec02_���׸�Ÿ��.exam02_generic_type;
/*Ŭ����/�������̽��� ������ ��, �̸� �Ķ���� Ÿ���� �Բ� �������ش�.*/
public class Box<T> {
	private T t;
	
	public void set(T t) {
		this.t = t;
	}
	
	public T get() {
		return this.t;
	}
}