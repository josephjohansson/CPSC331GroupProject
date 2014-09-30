package lists;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * This class implements a simple file reader for a company list csv
 * 
 * @author CPSC 331 - Fall 2014 - T06-5
 * @version 1.0
 */

public class readCompanyList {

	// filename of file to be read
	private String fileName;
	// new buffered reader
	private BufferedReader br = null;
	// temp variable to hold the contents of the line in a file
	private String lineInFile = "";
	// the character to split by in the csv
	private String cvsSplitChar = ",";

	// Temporary variables to store all elements in the java
	// company element
	private int ID;
	private String symbol;
	private String name;
	private float lastSale;
	private float marketCap;
	private int ipoYear = 0;
	private String sector;
	private String industry;
	private String summaryQuote;

	/**
	 * This constructs a new readCompanyList with a filename and a unsorted list
	 * to fill.
	 * 
	 * @param newFileName
	 *            the file name of the file to be read
	 * @param listOfCompanies
	 *            the unsortedlist to read the file info into
	 */
	public readCompanyList(String newFileName, unsortedList listOfCompanies) {
		fileName = newFileName;
		listOfCompanies = new unsortedList();
	}

	/**
	 * This method reads in all the information from a csv and inserts it into a
	 * list
	 * 
	 * @param listOfCompanies
	 */
	public void readList(unsortedList listOfCompanies) {
		try {
			// new file reader
			br = new BufferedReader(new FileReader(fileName));

			// Remove column name line
			lineInFile = br.readLine();

			// loop to read in all lines in the file
			while ((lineInFile = br.readLine()) != null) {
				processLine(lineInFile);

				CompanyElement elem = new CompanyElement(ID, symbol, name, lastSale, marketCap, ipoYear, sector, industry, summaryQuote);

				listOfCompanies.insert(elem);
			}
		} catch (FileNotFoundException e) {
			System.out.println("file not found");
		} catch (IOException e) {

		}

		System.out.println(listOfCompanies.getElement(943));
	}

	/**
	 * This method processes a string from the company list csv and splits it
	 * into its respective pieces of information
	 * 
	 * @param lineInFile
	 *            a string from the csv containing all the information for one
	 *            company
	 */
	public void processLine(String lineInFile) {
		String[] splitInformation = lineInFile.split(cvsSplitChar + "(?=([^\"]*\"[^\"]*\")*[^\"]*$)");

		ID = Integer.parseInt(splitInformation[0]);
		symbol = splitInformation[1];
		name = splitInformation[2];

		if (splitInformation[3].equals("n/a")) {
			lastSale = -1;
		}
		else {
			lastSale = Float.valueOf(splitInformation[3]);
		}

		if (splitInformation[4].equals("n/a")) {
			marketCap = -1;
		}
		else {
			marketCap = Float.valueOf(splitInformation[4]);
		}

		if (splitInformation[5].equals("n/a")) {
			ipoYear = -1;
		}
		else {
			ipoYear = Integer.parseInt(splitInformation[5]);
		}
		sector = splitInformation[6];
		industry = splitInformation[7];
		summaryQuote = splitInformation[8];
	}
}
