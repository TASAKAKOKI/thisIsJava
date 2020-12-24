package sec07_제네릭타입의상속과구현.exam01_generic_extends_implements;

public class StorageImpl<T> implements Storage<T> {
	private T[] array;
	
	public StorageImpl(int capacity) {
		array = (T[]) (new Object[capacity]);
	}
	
	@Override
	public void add(T item, int index) {
		if(index < array.length && index >= 0) {
			array[index] = item;			
		}
	}
	
	@Override
	public T get(int index) {
		if(index < array.length && index >= 0) {
			return array[index];
		}
		return null;
	}
}
