package lists;
import static org.junit.Assert.*;

import java.util.Random;

import org.junit.Assert;
import org.junit.Test;


public class UnsortedListTest {

	@Test
	public void test_insertOneIntoEmptylist() {
		// setup
		UnsortedList emptyList = new UnsortedList();
		Element e = new IntegerElement(1);
		
		// test
		emptyList.insert(e);
		
		// verify
		Element[] expectedResult = new Element[10];
		expectedResult[0] = e;
		for (int index = 1; index < 10; index++) {
			expectedResult[index] = null;
		}
		Assert.assertArrayEquals("Element not inserted as expected.", expectedResult, emptyList.toArray() );
	}

	@Test
	public void test_insertThreeIntoEmptylist() {
		// setup
		UnsortedList emptyList = new UnsortedList();
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

	public void test_insertTenIntoEmptylistWithDefaultCapacity() {
		// setup
		UnsortedList emptyList = new UnsortedList();
		Random generator = new Random();
		Element e0 = new IntegerElement(generator.nextInt());
		Element e1 = new IntegerElement(generator.nextInt());
		Element e2 = new IntegerElement(generator.nextInt());
		Element e3 = new IntegerElement(generator.nextInt());
		Element e4 = new IntegerElement(generator.nextInt());
		Element e5 = new IntegerElement(generator.nextInt());
		Element e6 = new IntegerElement(generator.nextInt());
		Element e7 = new IntegerElement(generator.nextInt());
		Element e8 = new IntegerElement(generator.nextInt());
		Element e9 = new IntegerElement(generator.nextInt());
		
		// test
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
		
		// verify
		Element[] expectedResult = new Element[10];
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
		Assert.assertArrayEquals("Elements not inserted as expected.", expectedResult, emptyList.toArray() );
	}

	public void test_insertElevenIntoEmptylistWithDefaultCapacity10() {
		// setup
		UnsortedList emptyList = new UnsortedList();
		Random generator = new Random();
		Element e0 = new IntegerElement(generator.nextInt());
		Element e1 = new IntegerElement(generator.nextInt());
		Element e2 = new IntegerElement(generator.nextInt());
		Element e3 = new IntegerElement(generator.nextInt());
		Element e4 = new IntegerElement(generator.nextInt());
		Element e5 = new IntegerElement(generator.nextInt());
		Element e6 = new IntegerElement(generator.nextInt());
		Element e7 = new IntegerElement(generator.nextInt());
		Element e8 = new IntegerElement(generator.nextInt());
		Element e9 = new IntegerElement(generator.nextInt());
		Element e10 = new IntegerElement(generator.nextInt());
		
		// test
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
		for (int index = 11; index < 20; index++) {
			expectedResult[index] = null;
		}
		Assert.assertArrayEquals("Elements not inserted as expected.", expectedResult, emptyList.toArray() );
	}

	public void test_insert21IntoEmptylistWithDefaultCapacity10() {
		// setup
		UnsortedList emptyList = new UnsortedList();
		Random generator = new Random();
		Element e0 = new IntegerElement(generator.nextInt());
		Element e1 = new IntegerElement(generator.nextInt());
		Element e2 = new IntegerElement(generator.nextInt());
		Element e3 = new IntegerElement(generator.nextInt());
		Element e4 = new IntegerElement(generator.nextInt());
		Element e5 = new IntegerElement(generator.nextInt());
		Element e6 = new IntegerElement(generator.nextInt());
		Element e7 = new IntegerElement(generator.nextInt());
		Element e8 = new IntegerElement(generator.nextInt());
		Element e9 = new IntegerElement(generator.nextInt());
		Element e10 = new IntegerElement(generator.nextInt());
		Element e11 = new IntegerElement(generator.nextInt());
		Element e12 = new IntegerElement(generator.nextInt());
		Element e13 = new IntegerElement(generator.nextInt());
		Element e14 = new IntegerElement(generator.nextInt());
		Element e15 = new IntegerElement(generator.nextInt());
		Element e16 = new IntegerElement(generator.nextInt());
		Element e17 = new IntegerElement(generator.nextInt());
		Element e18 = new IntegerElement(generator.nextInt());
		Element e19 = new IntegerElement(generator.nextInt());
		Element e20 = new IntegerElement(generator.nextInt());
		
		// test
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
		emptyList.insert(e10);
		emptyList.insert(e11);
		emptyList.insert(e12);
		emptyList.insert(e13);
		emptyList.insert(e14);
		emptyList.insert(e15);
		emptyList.insert(e16);
		emptyList.insert(e17);
		emptyList.insert(e18);
		emptyList.insert(e19);
		emptyList.insert(e20);
		
		// verify
		Element[] expectedResult = new Element[40];
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
		expectedResult[11] = e11;
		expectedResult[12] = e12;
		expectedResult[13] = e13;
		expectedResult[14] = e14;
		expectedResult[15] = e15;
		expectedResult[16] = e16;
		expectedResult[17] = e17;
		expectedResult[18] = e18;
		expectedResult[19] = e19;
		expectedResult[20] = e20;
		for (int index = 21; index < 40; index++) {
			expectedResult[index] = null;
		}
		Assert.assertArrayEquals("Elements not inserted as expected.", expectedResult, emptyList.toArray() );
	}

	@Test
	public void test_findEmptyList() {
		// setup
		UnsortedList emptyList = new UnsortedList();
		
		// run test
		Element actualResult = emptyList.find(1);
		
		//verify result
		Assert.assertNull("Finding from an empty list should return null.", actualResult);
	}

	@Test
	public void test_findOnlyElementInList() {
		// setup
		UnsortedList list = new UnsortedList();
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
		UnsortedList list = new UnsortedList();
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
		UnsortedList list = new UnsortedList();
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
		UnsortedList list = new UnsortedList();
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
		UnsortedList list = new UnsortedList();
		Random generator = new Random();
		int key0 = generator.nextInt();
		Element e0 = new IntegerElement(key0);
		Element e1 = new IntegerElement(generator.nextInt());
		Element e2 = new IntegerElement(generator.nextInt());
		Element e3 = new IntegerElement(generator.nextInt());
		Element e4 = new IntegerElement(generator.nextInt());
		Element e5 = new IntegerElement(generator.nextInt());
		Element e6 = new IntegerElement(generator.nextInt());
		Element e7 = new IntegerElement(generator.nextInt());
		Element e8 = new IntegerElement(generator.nextInt());
		Element e9 = new IntegerElement(generator.nextInt());
		Element e10 = new IntegerElement(generator.nextInt());
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
		UnsortedList list = new UnsortedList();
		Random generator = new Random();
		int key4 = generator.nextInt();
		Element e0 = new IntegerElement(generator.nextInt());
		Element e1 = new IntegerElement(generator.nextInt());
		Element e2 = new IntegerElement(generator.nextInt());
		Element e3 = new IntegerElement(generator.nextInt());
		Element e4 = new IntegerElement(key4);
		Element e5 = new IntegerElement(generator.nextInt());
		Element e6 = new IntegerElement(generator.nextInt());
		Element e7 = new IntegerElement(generator.nextInt());
		Element e8 = new IntegerElement(generator.nextInt());
		Element e9 = new IntegerElement(generator.nextInt());
		Element e10 = new IntegerElement(generator.nextInt());
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
		UnsortedList list = new UnsortedList();
		Random generator = new Random();
		int key10 = generator.nextInt();
		Element e0 = new IntegerElement(generator.nextInt());
		Element e1 = new IntegerElement(generator.nextInt());
		Element e2 = new IntegerElement(generator.nextInt());
		Element e3 = new IntegerElement(generator.nextInt());
		Element e4 = new IntegerElement(generator.nextInt());
		Element e5 = new IntegerElement(generator.nextInt());
		Element e6 = new IntegerElement(generator.nextInt());
		Element e7 = new IntegerElement(generator.nextInt());
		Element e8 = new IntegerElement(generator.nextInt());
		Element e9 = new IntegerElement(generator.nextInt());
		Element e10 = new IntegerElement(key10);
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
		Assert.assertSame(key10, actualElem);
	}

	public void test_findNonExistingKeysInLargeList() {
		// setup
		UnsortedList list = new UnsortedList();
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
	public void test_deleteFromEmptyList() {
		// setup
		UnsortedList list = new UnsortedList();
		
		// run test
		Element actual = list.delete(1);
		
		// verify result
		Element[] expectedArray = new IntegerElement[10];
		Assert.assertNull("Expected deleted element from empty list to be null.", actual);
		Assert.assertArrayEquals(expectedArray, list.toArray());
	}

	@Test
	public void test_deleteOfOnlyElementInList() {
		// setup
		UnsortedList list = new UnsortedList();
		Element e0 = new IntegerElement(0);
		list.insert(e0);
		
		// run test
		Element actual = list.delete(0);
		
		// verify result
		Assert.assertSame(e0, actual);
		Element[] expectedArray = new IntegerElement[10];
		Assert.assertArrayEquals(expectedArray, list.toArray());
	}

	@Test
	public void test_deleteFirstFromListOfThree() {
		// setup
		UnsortedList list = new UnsortedList();
		Element e0 = new IntegerElement(0);
		Element e1 = new IntegerElement(1);
		Element e2 = new IntegerElement(2);
		list.insert(e0);
		list.insert(e1);
		list.insert(e2);
		
		// run test
		Element actualResult = list.delete(0); 
		
		// verify
		Assert.assertSame(e0, actualResult);
		Element[] expectedArray = new IntegerElement[10];
		expectedArray[0] = e1;
		expectedArray[1] = e2;
		Assert.assertArrayEquals(expectedArray, list.toArray());
	}

	@Test
	public void test_deleteSecondFromListOfThree() {
		// setup
		UnsortedList list = new UnsortedList();
		Element e0 = new IntegerElement(0);
		Element e1 = new IntegerElement(1);
		Element e2 = new IntegerElement(2);
		list.insert(e0);
		list.insert(e1);
		list.insert(e2);
		
		// run test
		Element actualResult = list.delete(1); 
		
		// verify
		Assert.assertSame(e1, actualResult);
		Element[] expectedArray = new IntegerElement[10];
		expectedArray[0] = e0;
		expectedArray[1] = e2;
		Assert.assertArrayEquals(expectedArray, list.toArray());
	}

	@Test
	public void test_deleteThirdFromListOfThree() {
		// setup
		UnsortedList list = new UnsortedList();
		Element e0 = new IntegerElement(0);
		Element e1 = new IntegerElement(1);
		Element e2 = new IntegerElement(2);
		list.insert(e0);
		list.insert(e1);
		list.insert(e2);
		
		// run test
		Element actualResult = list.delete(2); 
		
		// verify
		Assert.assertSame(e2, actualResult);
		Element[] expectedArray = new IntegerElement[10];
		expectedArray[0] = e0;
		expectedArray[1] = e1;
		Assert.assertArrayEquals(expectedArray, list.toArray());
	}

	public void test_deleteCausingListCapacityDecrease() {
		// setup
		UnsortedList list = new UnsortedList();
		Random generator = new Random();
		int key0 = generator.nextInt();
		Element e0 = new IntegerElement(key0);
		Element e1 = new IntegerElement(generator.nextInt());
		Element e2 = new IntegerElement(generator.nextInt());
		Element e3 = new IntegerElement(generator.nextInt());
		Element e4 = new IntegerElement(generator.nextInt());
		Element e5 = new IntegerElement(generator.nextInt());
		Element e6 = new IntegerElement(generator.nextInt());
		Element e7 = new IntegerElement(generator.nextInt());
		Element e8 = new IntegerElement(generator.nextInt());
		Element e9 = new IntegerElement(generator.nextInt());
		Element e10 = new IntegerElement(generator.nextInt());
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
		// We have capacity 20.  At below 20/3 = 6, capacity should go down to 10
		list.delete(10);
		list.delete(9);
		list.delete(8);
		list.delete(7);
		list.delete(6);
		list.delete(5);
		
		// verify
		Element[] expectedArray = new IntegerElement[10];
		expectedArray[0] = e0;
		expectedArray[1] = e1;
		expectedArray[2] = e2;
		expectedArray[3] = e3;
		expectedArray[4] = e4;
		Assert.assertArrayEquals(expectedArray, list.toArray());
	}

	@Test
	public void test_sortEmptyList() {
		// setup
		UnsortedList list = new UnsortedList();
		
		// run test
		Element[] actualSorted = list.sort(); 
		
		// verify
		Element[] expectedSorted = new Element[0];
		Element[] expectedUnderlying = new Element[10];
		Assert.assertArrayEquals("Expected result to be empty list.", expectedSorted, actualSorted);
		Assert.assertArrayEquals("Expected underlying array to remain empty.", expectedUnderlying, list.toArray());
	}

	@Test
	public void test_sortListWithSingleElement() {
		// setup
		UnsortedList list = new UnsortedList();
		Element e0 = new IntegerElement(0);
		list.insert(e0);
		
		// run test
		Element[] actualSorted = list.sort(); 
		
		// verify
		Element[] expectedSorted = new Element[1];
		Element[] expectedUnderlying = new Element[10];
		expectedSorted[0] = e0;
		expectedUnderlying[0] = e0;
		Assert.assertArrayEquals("Expected result to be list with single element.", expectedSorted, actualSorted);
		Assert.assertArrayEquals("Expected underlying array to still contain single element.", expectedUnderlying, list.toArray());
	}

	@Test
	public void test_sortListWithThreeInAscendingOrder() {
		// setup
		UnsortedList list = new UnsortedList();
		Element e0 = new IntegerElement(0);
		Element e1 = new IntegerElement(1);
		Element e2 = new IntegerElement(2);
		list.insert(e0);
		list.insert(e1);
		list.insert(e2);
		
		// run test
		Element[] actualSorted = list.sort(); 
		
		// verify
		Element[] expectedSorted = new Element[3];
		Element[] expectedUnderlying = new Element[10];
		expectedSorted[0] = e0;
		expectedSorted[1] = e1;
		expectedSorted[2] = e2;
		expectedUnderlying[0] = e0;
		expectedUnderlying[1] = e1;
		expectedUnderlying[2] = e2;
		Assert.assertArrayEquals("Sorted result:", expectedSorted, actualSorted);
		Assert.assertArrayEquals("Underlying array should be unchanged:", expectedUnderlying, list.toArray());
	}

	@Test
	public void test_sortListWithThreeInDescendingOrder() {
		// setup
		UnsortedList list = new UnsortedList();
		Element e0 = new IntegerElement(2);
		Element e1 = new IntegerElement(1);
		Element e2 = new IntegerElement(0);
		list.insert(e0);
		list.insert(e1);
		list.insert(e2);
		
		// run test
		Element[] actualSorted = list.sort(); 
		
		// verify
		Element[] expectedSorted = new Element[3];
		Element[] expectedUnderlying = new Element[10];
		expectedSorted[0] = e2;
		expectedSorted[1] = e1;
		expectedSorted[2] = e0;
		expectedUnderlying[0] = e0;
		expectedUnderlying[1] = e1;
		expectedUnderlying[2] = e2;
		Assert.assertArrayEquals("Sorted result:", expectedSorted, actualSorted);
		Assert.assertArrayEquals("Underlying array should be unchanged:", expectedUnderlying, list.toArray());
	}

	@Test
	public void test_sortListWith15InRandomOrder() {
		// setup
		UnsortedList list = new UnsortedList();
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
		Element e11 = new IntegerElement(11);
		Element e12 = new IntegerElement(12);
		Element e13 = new IntegerElement(13);
		Element e14 = new IntegerElement(14);
		list.insert(e5);
		list.insert(e2);
		list.insert(e10);
		list.insert(e6);
		list.insert(e12);
		list.insert(e1);
		list.insert(e14);
		list.insert(e4);
		list.insert(e9);
		list.insert(e13);
		list.insert(e8);
		list.insert(e11);
		list.insert(e0);
		list.insert(e3);
		list.insert(e7);
		
		// run test
		Element[] actualSorted = list.sort(); 
		
		// verify
		Element[] expectedSorted = new Element[15];
		Element[] expectedUnderlying = new Element[20];
		expectedSorted[0] = e0;
		expectedSorted[1] = e1;
		expectedSorted[2] = e2;
		expectedSorted[3] = e3;
		expectedSorted[4] = e4;
		expectedSorted[5] = e5;
		expectedSorted[6] = e6;
		expectedSorted[7] = e7;
		expectedSorted[8] = e8;
		expectedSorted[9] = e9;
		expectedSorted[10] = e10;
		expectedSorted[11] = e11;
		expectedSorted[12] = e12;
		expectedSorted[13] = e13;
		expectedSorted[14] = e14;
		expectedUnderlying[0] = e5;
		expectedUnderlying[1] = e2;
		expectedUnderlying[2] = e10;
		expectedUnderlying[3] = e6;
		expectedUnderlying[4] = e12;
		expectedUnderlying[5] = e1;
		expectedUnderlying[6] = e14;
		expectedUnderlying[7] = e4;
		expectedUnderlying[8] = e9;
		expectedUnderlying[9] = e13;
		expectedUnderlying[10] = e8;
		expectedUnderlying[11] = e11;
		expectedUnderlying[12] = e0;
		expectedUnderlying[13] = e3;
		expectedUnderlying[14] = e7;
		Assert.assertArrayEquals("Sorted result:", expectedSorted, actualSorted);
		Assert.assertArrayEquals("Underlying array should be unchanged:", expectedUnderlying, list.toArray());
	}
}
