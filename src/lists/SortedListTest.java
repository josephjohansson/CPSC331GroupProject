package lists;
import static org.junit.Assert.*;

import java.util.Random;

import org.junit.Assert;
import org.junit.Test;


public class SortedListTest {
	@Test
	public void test_insertThreeInAscendingOrderIntoEmptylist() {
		// setup
		SortedList emptyList = new SortedList();
		Element e0 = new IntegerElement(0);
		Element e1 = new IntegerElement(1);
		Element e2 = new IntegerElement(2);
		
		// test
		emptyList.insert(e0);
		emptyList.insert(e1);
		emptyList.insert(e2);
		
		// verify
		Element[] expectedResult = new Element[10];
		expectedResult[0] = e0;
		expectedResult[1] = e1;
		expectedResult[2] = e2;
		for (int index = 3; index < 10; index++) {
			expectedResult[index] = null;
		}
		Assert.assertArrayEquals("Elements not inserted as expected.", expectedResult, emptyList.toArray() );
	}
	@Test
	public void test_insertThreeInDescendingOrderIntoEmptylist() {
		// setup
		SortedList emptyList = new SortedList();
		Element e0 = new IntegerElement(2);
		Element e1 = new IntegerElement(1);
		Element e2 = new IntegerElement(0);
		
		// test
		emptyList.insert(e0);
		emptyList.insert(e1);
		emptyList.insert(e2);
		
		// verify
		Element[] expectedResult = new Element[10];
		expectedResult[0] = e2;
		expectedResult[1] = e1;
		expectedResult[2] = e0;
		for (int index = 3; index < 10; index++) {
			expectedResult[index] = null;
		}
		Assert.assertArrayEquals("Elements not inserted as expected.", expectedResult, emptyList.toArray() );
	}

	@Test
	public void test_insertInMiddleOfFive() {
		// setup
		SortedList emptyList = new SortedList();
		Element e0 = new IntegerElement(0);
		Element e1 = new IntegerElement(1);
		Element e2 = new IntegerElement(2);
		Element e3 = new IntegerElement(4);
		Element e4 = new IntegerElement(5);
		emptyList.insert(e0);
		emptyList.insert(e1);
		emptyList.insert(e2);
		emptyList.insert(e3);
		emptyList.insert(e4);
		
		// test
		Element e5 = new IntegerElement(3);
		emptyList.insert(e5);
		
		// verify
		Element[] expectedResult = new Element[10];
		expectedResult[0] = e0;
		expectedResult[1] = e1;
		expectedResult[2] = e2;
		expectedResult[3] = e5;
		expectedResult[4] = e3;
		expectedResult[5] = e4;
		Assert.assertArrayEquals("Elements not inserted as expected.", expectedResult, emptyList.toArray() );
	}
	@Test
	public void test_insertWhenCapacityIncreased() {
		// setup
		SortedList emptyList = new SortedList();
		Element e0 = new IntegerElement(0);
		Element e1 = new IntegerElement(1);
		Element e2 = new IntegerElement(2);
		Element e3 = new IntegerElement(3);
		Element e4 = new IntegerElement(4);
		Element e5 = new IntegerElement(5);
		Element e6 = new IntegerElement(6);
		Element e7 = new IntegerElement(7);
		Element e8 = new IntegerElement(8);
		Element e9 = new IntegerElement(9);
		emptyList.insert(e0);
		emptyList.insert(e1);
		emptyList.insert(e2);
		emptyList.insert(e3);
		emptyList.insert(e4);
		emptyList.insert(e5);
		emptyList.insert(e6);
		emptyList.insert(e7);
		emptyList.insert(e8);
		emptyList.insert(e9);
		
		// test
		Element e10 = new IntegerElement(10);
		emptyList.insert(e10);
		
		// verify
		Element[] expectedResult = new Element[20];
		expectedResult[0] = e0;
		expectedResult[1] = e1;
		expectedResult[2] = e2;
		expectedResult[3] = e3;
		expectedResult[4] = e4;
		expectedResult[5] = e5;
		expectedResult[6] = e6;
		expectedResult[7] = e7;
		expectedResult[8] = e8;
		expectedResult[9] = e9;
		expectedResult[10] = e10;
		Assert.assertArrayEquals("Elements not inserted as expected.", expectedResult, emptyList.toArray() );
	}

	@Test
	public void test_findEmptyList() {
		// setup
		SortedList emptyList = new SortedList();
		
		// run test
		Element actualResult = emptyList.find(1);
		
		//verify result
		Assert.assertNull("Finding from an empty list should return null.", actualResult);
	}

	@Test
	public void test_findOnlyElementInList() {
		// setup
		SortedList list = new SortedList();
		Element e1 = new IntegerElement(1);
		list.insert(e1);
		
		// run test
		Element actualResult = list.find(1);
		
		//verify result
		Assert.assertSame(e1, actualResult);
	}

	@Test
	public void test_findFirstFromListOfThree() {
		// setup
		SortedList list = new SortedList();
		Element e0 = new IntegerElement(0);
		Element e1 = new IntegerElement(1);
		Element e2 = new IntegerElement(2);
		list.insert(e0);
		list.insert(e1);
		list.insert(e2);
		
		// run test
		Element actualResult = list.find(0); 
		
		// verify
		Assert.assertSame(e0, actualResult);
	}

	@Test
	public void test_findSecondFromListOfThree() {
		// setup
		SortedList list = new SortedList();
		Element e0 = new IntegerElement(0);
		Element e1 = new IntegerElement(1);
		Element e2 = new IntegerElement(2);
		list.insert(e0);
		list.insert(e1);
		list.insert(e2);
		
		// run test
		Element actualResult = list.find(1); 
		
		// verify
		Assert.assertSame(e1, actualResult);
	}

	@Test
	public void test_findThirdFromListOfThree() {
		// setup
		SortedList list = new SortedList();
		Element e0 = new IntegerElement(0);
		Element e1 = new IntegerElement(1);
		Element e2 = new IntegerElement(2);
		list.insert(e0);
		list.insert(e1);
		list.insert(e2);
		
		// run test
		Element actualResult = list.find(2); 
		
		// verify
		Assert.assertSame(e2, actualResult);
	}

	public void test_findFirstAfterListCapacityIncreased() {
		// setup
		SortedList list = new SortedList();
		Random generator = new Random();
		int key0 = 0;
		Element e0 = new IntegerElement(key0);
		Element e1 = new IntegerElement(1);
		Element e2 = new IntegerElement(2);
		Element e3 = new IntegerElement(3);
		Element e4 = new IntegerElement(4);
		Element e5 = new IntegerElement(5);
		Element e6 = new IntegerElement(6);
		Element e7 = new IntegerElement(7);
		Element e8 = new IntegerElement(8);
		Element e9 = new IntegerElement(9);
		Element e10 = new IntegerElement(10);
		list.insert(e0);
		list.insert(e1);
		list.insert(e2);
		list.insert(e3);
		list.insert(e4);
		list.insert(e5);
		list.insert(e6);
		list.insert(e7);
		list.insert(e8);
		list.insert(e9);
		list.insert(e10);
		
		// run test
		Element actualElem = list.find(key0);
		
		
		// verify
		Assert.assertSame(e0, actualElem);
	}

	public void test_findFifthAfterListCapacityIncreased() {
		// setup
		SortedList list = new SortedList();
		Random generator = new Random();
		int key4 = 4;
		Element e0 = new IntegerElement(0);
		Element e1 = new IntegerElement(1);
		Element e2 = new IntegerElement(2);
		Element e3 = new IntegerElement(3);
		Element e4 = new IntegerElement(key4);
		Element e5 = new IntegerElement(5);
		Element e6 = new IntegerElement(6);
		Element e7 = new IntegerElement(7);
		Element e8 = new IntegerElement(8);
		Element e9 = new IntegerElement(9);
		Element e10 = new IntegerElement(10);
		list.insert(e0);
		list.insert(e1);
		list.insert(e2);
		list.insert(e3);
		list.insert(e4);
		list.insert(e5);
		list.insert(e6);
		list.insert(e7);
		list.insert(e8);
		list.insert(e9);
		list.insert(e10);
		
		// run test
		Element actualElem = list.find(key4);
		
		
		// verify
		Assert.assertSame(e4, actualElem);
	}

	public void test_findLastAfterListCapacityIncreased() {
		// setup
		SortedList list = new SortedList();
		Random generator = new Random();
		int key10 = 10;
		Element e0 = new IntegerElement(0);
		Element e1 = new IntegerElement(1);
		Element e2 = new IntegerElement(2);
		Element e3 = new IntegerElement(3);
		Element e4 = new IntegerElement(4);
		Element e5 = new IntegerElement(5);
		Element e6 = new IntegerElement(6);
		Element e7 = new IntegerElement(7);
		Element e8 = new IntegerElement(8);
		Element e9 = new IntegerElement(9);
		Element e10 = new IntegerElement(10);
		list.insert(e0);
		list.insert(e1);
		list.insert(e2);
		list.insert(e3);
		list.insert(e4);
		list.insert(e5);
		list.insert(e6);
		list.insert(e7);
		list.insert(e8);
		list.insert(e9);
		list.insert(e10);
		
		// run test
		Element actualElem = list.find(key10);
		
		
		// verify
		Assert.assertSame(e10, actualElem);
	}

	public void test_findNonExistingKeysInLargeList() {
		// setup
		SortedList list = new SortedList();
		Random generator = new Random();
		int nextKey = generator.nextInt();
		int smallest = nextKey;
		int middle = nextKey + 1;
		int largest = nextKey;
		for (int index = 0; index < 500; index++) {
			list.insert(new IntegerElement(nextKey));
			if (nextKey < smallest) {
				smallest = nextKey;
			}
			if (nextKey > largest) {
				largest = nextKey;
			}
			do {
				nextKey = generator.nextInt();
			} while (nextKey == middle);
		}

		// run test and verify
		Assert.assertNull("All elements in list contain key greater than " + (smallest - 1) +
						" so find should have returned null.", list.find(smallest - 1));
		Assert.assertNull("All elements in list are either larger or smaller than " + middle +
				" so find should have returned null.", list.find(middle));
		Assert.assertNull("All elements in list contain key smaller than " + (largest + 1) +
				" so find should have returned null.", list.find(largest + 1));
	}

	@Test
	public void test_delete() {
	}

	@Test
	public void test_toArray() {
	}

	@Test
	public void test_sort() {
	}

}
