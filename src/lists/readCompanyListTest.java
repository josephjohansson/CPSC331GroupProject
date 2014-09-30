package lists;

import org.junit.Test;

public class readCompanyListTest {

	@Test
	public void test() {
		unsortedList listOfCompanies = new unsortedList();

		readCompanyList reading = new readCompanyList("src/lists/NASDAQCompanyList.csv", listOfCompanies);
		reading.readList();

		System.out.println(listOfCompanies.getElement(112).getIndustry());
	}
}
