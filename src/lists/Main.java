package lists;

public class Main {
	public static void main(String[] args) {
		System.out.println("CPSC 331 - Project 1.3");

		UnsortedList listOfCompanies = new UnsortedList();

		readCompanyList reading = new readCompanyList("src/lists/NASDAQCompanyList.csv", listOfCompanies);
		reading.readList();

		CompanyElement e = listOfCompanies.find(913);

		System.out.println(listOfCompanies.find(913));
		System.out.println(listOfCompanies.delete(913));
		System.out.println(listOfCompanies.find(913));

		System.out.println(listOfCompanies.getIndex(15));
		listOfCompanies.sort();
		System.out.println(listOfCompanies.getIndex(15));
	}
}
