package sec07_제네릭타입의상속과구현.exam01_generic_extends_implements;

public interface Storage<T> {
	public void add(T item, int index);
	public T get(int index);
}
