package verify.exam04;

public class Util{
	// ���1
	public static <K,V> V getValue(Pair<K,V> pair, K k) {
		if(pair.getKey() ==k) {
			return pair.getValue();
		}
		return null;
	}
	 
	
	/* ���2
	public static <P extends Pair<K,V>, K, V> V getValue(P p, K k) {
		if(p.getKey() == k) {
			return p.getValue();
		}
		return null;
	}
	*/
}