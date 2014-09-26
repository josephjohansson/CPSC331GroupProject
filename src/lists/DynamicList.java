package lists;

public class DynamicList {
	protected CompanyElement[] elements = null;
	protected int size;

	public DynamicList() {
		this(10);
	}

	public DynamicList(int initialCapacity) {
		size = 0;
		elements = new CompanyElement[initialCapacity];
		for (int index = 0; index < initialCapacity; index++) {
			elements[index] = null;
		}
	}

	protected void increaseCapacity() {
		CompanyElement[] temp = new CompanyElement[elements.length * 2];
		for (int index = 0; index < elements.length; index++) {
			temp[index] = elements[index];
		}
		elements = temp;
	}

	public void insert(CompanyElement elem) {

	}

	/**
	 * Returns the index of the element with specified key. If there is no
	 * element with the specified key, this method will return -1. (If there is
	 * more than one element with specified key, the first with the required key
	 * is returned.)
	 * 
	 * @param key
	 *            the key of the element we are searching for.
	 * @return the index of the element with specified key or -1 if there is no
	 *         element with specified key.
	 */
	protected void getIndex() {

	}

	/**
	 * Does a linear search to find the element with the specified key. If there
	 * is no element with the specified key this method will return null. (If
	 * there is more than one element with specified key, the first with the
	 * required key is returned.)
	 * 
	 * @param key
	 *            the key of the element we are searching for.
	 * @return the element in this list that has specified key.
	 */
	public void find() {

	}

	public CompanyElement delete(int key) {
		return null;
	}

	public CompanyElement[] toArray() {
		return elements;
	}

	public CompanyElement[] sort() {
		return null;
	}
}
