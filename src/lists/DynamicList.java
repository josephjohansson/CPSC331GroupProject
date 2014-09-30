package lists;

public class DynamicList {
	protected Element[] elements = null;
	protected int size;
	
	public DynamicList() {
		this(10);
	}
	
	public DynamicList(int initialCapacity) {
		size = 0;
		elements = new Element[initialCapacity];
		for (int index = 0; index < initialCapacity; index++) {
			elements[index] = null;
		}
	}
	
	protected void increaseCapacity() {
		Element[] temp = new Element[elements.length * 2];
		for (int index = 0; index < elements.length; index++) {
			temp[index] = elements[index];
		}
		elements = temp;
	}
	
/**	protected void decreaseCapacity() {
		int newCapacity = elements.length / 2;
		if (newCapacity < 10) {
			if (elements.length <= 10) return;
			newCapacity = 10;
		}
		Element[] temp = new Element[newCapacity];
		for (int index = 0; index < newCapacity; index++) {
			temp[index] = elements[index];
		}
		elements = temp;
	}
	*/
	public void insert(Element elem){
		
	}
	
	/**
	 * Returns the index of the element with specified key.  If there is no element with
	 * the specified key, this method will return -1.  (If there is more than
	 * one element with specified key, the first with the required key is returned.)
	 * @param key the key of the element we are searching for.
	 * @return the index of the element with specified key or -1 if there is no element with specified key.
	 */
	protected int getIndex(int key) {
		for (int index = 0; index < size; index++) {
			if (key == elements[index].getKey()) {
				return index;
			}
		}
		return -1;
	}

	/**
	 * Does a linear search to find the element with the specified key.  If there is no
	 * element with the specified key this method will return null.  (If there is more than
	 * one element with specified key, the first with the required key is returned.)
	 * @param key the key of the element we are searching for.
	 * @return the element in this list that has specified key.
	 */
	public Element find(int key) {
		int index = getIndex(key);
		if (index == -1) {
			return null;
		} else {
			return elements[index];
		}
	}
	
	/**
	 * Deletes element with specified key from the array if such an element exists.
	 * Elements are shifted to ensure there is no empty space in the list.  When the array
	 * is less than 1/3 full the capacity of the underlying structure is shrunk to half the
	 * size.  (Minimum size will be 10.)
	 * @param key the key of the element to delete
	 * @return The element that was deleted.
	 */
	public Element delete(int key) {
		Element deletedElement = null;
		int index = getIndex(key);
		if (index >= 0) {
			deletedElement = elements[index];
			for (; index < size-1; index++) {
				elements[index] = elements[index + 1];
			}
			//If you uncomment this line, the tests will pass.
			elements[size-1] = null;
			size--;
		}
/**		if (size < elements.length/3) {
			decreaseCapacity();
		}*/
		return deletedElement;
	}
	
	public Element[] toArray() {
		return elements;
	}
	
	public Element[] bubblesort() {
		Element[] sortedList = new Element[size];
		for (int index = 0; index < size; index++) {
			sortedList[index] = elements[index];
		}
		
		// Consider entire array first.  After first pass, we know biggest will
		// be at the end.  So next iteration we don't have to consider last
		// element anymore.
	    for (int ignoreLength = 0; ignoreLength < size - 1; ignoreLength++) {
	    	for (int index = 0; index < size - ignoreLength - 1; index++) {
	    		// See if current element needs to be shifted to the back.
	    		if (sortedList[index].getKey() > sortedList[index+1].getKey())
	    		{
	    			Element swap = sortedList[index];
	    			sortedList[index] = sortedList[index+1];
	    			sortedList[index+1] = swap;
	    		}
	    	}
	    }
	 
		return sortedList;
	}

	public Element[] sort() {
		return bubblesort();
	}
}
