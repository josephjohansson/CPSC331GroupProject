package lists;

public class IntegerElement extends Element {
	int key;
	public IntegerElement(int aKey) {
		key = aKey;
	}
	public int getKey() {
		return key;
	}
	public String toString() {
		return Integer.toString(key);
	}
}
