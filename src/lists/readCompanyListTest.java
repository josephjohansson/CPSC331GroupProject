package lists;

import org.junit.Test;

public class readCompanyListTest {

	@Test
	public void test() {
		UnsortedList listOfCompanies = new UnsortedList();

		readCompanyList reading = new readCompanyList("src/lists/NASDAQCompanyList.csv", listOfCompanies);
		reading.readList();

		System.out.println(listOfCompanies.toArray()[0]);

	}
}
