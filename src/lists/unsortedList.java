package lists;

public class unsortedList extends DynamicList {
	public unsortedList() {
		this(10);
	}

	public unsortedList(int initialCapacity) {
		super(initialCapacity);
	}

	public void insert(CompanyElement comp) {
		if (size >= elements.length) {
			increaseCapacity();
		}

		elements[size] = comp;
		size++;
	}
}
