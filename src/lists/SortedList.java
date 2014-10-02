package lists;

public class SortedList extends DynamicList {
	public SortedList() {
	}

	public SortedList(int initialCapacity) {
		super(initialCapacity);
	}

	/**
	 * Inserts the specified elements in this list such that the list remains in
	 * sorted order (ascending by key).
	 * 
	 * @param elem
	 *            the element to insert.
	 */
	public void insert(CompanyElement elem) {
		if (size >= elements.length) {
			increaseCapacity();
		}

		int index = size;
		while (index > 0 && elem.getKey() < elements[index - 1].getKey()) {
			// The new element must go before the current one. Shift
			// this current one to the right to make space.
			elements[index] = elements[index - 1];
			index--;
		}
		elements[index] = elem;
		size++;
	}

	/**
	 * Does a binary search to find the index of the element with specified key.
	 * (Recursive implementation.)
	 * 
	 * @param key
	 *            the key of the element we are searching for.
	 * @param begin
	 *            the start index of the segment of the array we're searching.
	 * @param end
	 *            the last index (inclusive), of the segment of the array we're
	 *            searching.
	 * @return the index of the element with specified key or -1 if there is no
	 *         element with specified key.
	 */
	private int binarySearch(int key, int begin, int end) {
		if (begin > end) {
			return -1;
		}
		int mid = (begin + end) / 2;
		if (elements[mid].getKey() == key) {
			return mid;
		}
		else if (elements[mid].getKey() > key) {
			return binarySearch(key, begin, mid - 1);
		}
		else {
			return binarySearch(key, mid + 1, end);
		}
	}

	/**
	 * This overrides the getIndex implementation in DynamicList. Returns the
	 * index of the element with specified key. If there is no element with the
	 * specified key, this method will return -1. (If there is more than one
	 * element with specified key, the first with the required key is returned.)
	 * <p>
	 * The search algorithm used is binary search.
	 * 
	 * @param key
	 *            the key of the element we are searching for.
	 * @return the index of the element with specified key or -1 if there is no
	 *         element with specified key.
	 */
	protected int getIndex(int key) {
		return binarySearch(key, 0, size - 1);
	}

}
