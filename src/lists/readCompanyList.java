package lists;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class readCompanyList {
	private String fileName;
	private BufferedReader br = null;
	private String lineInFile = "";
	private String cvsSplitChar = ",";

	private int ID;
	private String symbol;
	private String name;
	private float lastSale;
	private float marketCap;
	private int ipoYear = 0;
	private String sector;
	private String industry;
	private String summaryQuote;

	public readCompanyList(String newFileName) {
		fileName = newFileName;
	}

	public void readList() {
		try {
			br = new BufferedReader(new FileReader(fileName));
			lineInFile = br.readLine();

			while ((lineInFile = br.readLine()) != null) {
				System.out.println(lineInFile);

				String[] splitInformation = lineInFile.split(cvsSplitChar);

				ID = Integer.parseInt(splitInformation[0]);
				symbol = splitInformation[1];
				name = splitInformation[2];
				lastSale = Float.valueOf(splitInformation[3]);
				marketCap = Float.valueOf(splitInformation[4]);
				ipoYear = -1;
				if (splitInformation[5] != "n/a") {
					ipoYear = Integer.parseInt(splitInformation[5]);
				}
				sector = splitInformation[6];
				industry = splitInformation[7];
				summaryQuote = splitInformation[8];

				CompanyElement elem = new CompanyElement(ID, symbol, name, lastSale, marketCap, ipoYear, sector, industry, summaryQuote);

				System.out.println(elem.toString());
			}
		} catch (FileNotFoundException e) {
			System.out.println("file not found");
		} catch (IOException e) {

		}

	}
}
