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

	protected void getIndex() {

	}

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

	public CompanyElement getElement(int key) {
		return elements[key];
	}
}
