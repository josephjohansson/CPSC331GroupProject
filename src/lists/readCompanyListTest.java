package lists;

import org.junit.Test;

public class readCompanyListTest {

	@Test
	public void test() {
		readCompanyList reading = new readCompanyList("src/lists/NASDAQCompanyList.csv");
		reading.readList();
		// fail("Not yet implemented");
	}

}
