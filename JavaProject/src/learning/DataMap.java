package learning;

public class DataMap<K,V>
{

	private K key;
	private V value;
	
	public DataMap(K key,V value) {
		this.key = key;
		this.value = value;
	}

	public K getKey() {
		return key;
	}

	public V getValue() {
		return value;
	}

	@Override
	public String toString() {
		return "DataMap [key=" + key + ", value=" + value + "]";
	}
	
}










