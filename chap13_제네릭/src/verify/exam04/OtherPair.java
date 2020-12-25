package verify.exam04;

public class OtherPair<K,V> {
	private K k;
	private V v;

	public OtherPair(K k, V v) {
		this.k = k;
		this.v = v;
	}

	public K getKey() { return k; }
	public V getValue() { return v; }
}