package lists;

/**
 * This class implements a company element which contains all the information
 * needed for company listed on the NASDAQ
 * 
 * @author CPSC 331 - Fall 2014 - T06-5
 * @version 1.0
 */

public class CompanyElement extends Element {
	private int ID;
	private String symbol;
	private String name;
	private float lastSale;
	private float marketCap;
	private int ipoYear;
	private String sector;
	private String industry;
	private String summaryQuote;

	/**
	 * This constructor creates a new CompanyElement with all the information
	 * that is required
	 * 
	 * @param newID
	 *            the ID number of the company in the list
	 * @param newSymbol
	 *            the character symbol of the company (EX: APPL)
	 * @param newName
	 *            the name of the company (Ex: Facebook, Inc. )
	 * @param newLastSale
	 *            the last sale price of the stock
	 * @param newMarketCap
	 *            the market capital of the company
	 * @param newIpoYear
	 *            the first year the company offered IPO shares
	 * @param newSector
	 *            the sector that the company is involved in
	 * @param newIndustry
	 *            the industry that the company is in
	 * @param newSummaryQuote
	 *            an web link to more information regarding the company
	 */
	public CompanyElement(int newID, String newSymbol, String newName, float newLastSale, float newMarketCap, int newIpoYear, String newSector,
			String newIndustry, String newSummaryQuote) {
		ID = newID;
		symbol = newSymbol;
		name = newName;
		lastSale = newLastSale;
		marketCap = newMarketCap;
		ipoYear = newIpoYear;
		sector = newSector;
		industry = newIndustry;
		summaryQuote = newSummaryQuote;
	}

	/**
	 * Returns the ID number of the company
	 * 
	 * @return the ID number of the company
	 */
	public int getKey() {
		return ID;
	}

	/**
	 * Returns the symbol of the company
	 * 
	 * @return the symbol of the company
	 */
	public String getSymbol() {
		return symbol;
	}

	/**
	 * Returns the lastSale of the company
	 * 
	 * @return the lastSale of the company
	 */
	public float getLastSale() {
		return lastSale;
	}

	/**
	 * Returns the marketCap of the company
	 * 
	 * @return the marketCap of the company
	 */
	public float getMarketCap() {
		return marketCap;
	}

	/**
	 * Returns the ipoYear of the company
	 * 
	 * @return the ipoYear of the company
	 */
	public int getIPOYear() {
		return ipoYear;
	}

	/**
	 * Returns the sector of the company
	 * 
	 * @return the sector of the company
	 */
	public String getSector() {
		return sector;
	}

	/**
	 * Returns the industry of the company
	 * 
	 * @return the industry of the company
	 */
	public String getIndustry() {
		return industry;
	}

	/**
	 * Returns the web link relating to the companies information
	 * 
	 * @return the web link of the company
	 */
	public String getSummaryQuote() {
		return summaryQuote;
	}

	/**
	 * Returns a String with all the company information in the following
	 * format:
	 * 
	 * {@code ID + "," + symbol + "," + name + "," + lastSale + "," + marketCap
	 * + "," + ipoYear + "," + sector + "," + industry + "," + summaryQuote}
	 * 
	 * 
	 * @return the ID number of the company
	 */
	public String toString() {
		String output = ID + "," + symbol + "," + name + "," + lastSale + "," + marketCap + "," + ipoYear + "," + sector + "," + industry + ","
				+ summaryQuote;
		return output;
	}

}
