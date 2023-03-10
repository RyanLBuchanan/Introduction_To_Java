package program;

public class KVPUtilities {

	public static <K, V> boolean equality(KeyValuePair<K, V> p1, KeyValuePair<K, V> p2) {
		return p1.getKey().equals(p2.getKey()) &&
				p1.getValue().equals(p2.getValue());
	}
}
