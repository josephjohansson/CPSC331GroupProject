package lists;

public class CompanyElement {
	private int ID;
	private String symbol;
	private String name;
	private float lastSale;
	private float marketCap;
	private int ipoYear;
	private String sector;
	private String industry;
	private String summaryQuote;

	public CompanyElement(int newID, String newName, String newSymbol, float newLastSale, float newMarketCap, int newIpoYear, String newSector,
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

	public int getID() {
		return ID;
	}

	public String getSymbol() {
		return symbol;
	}

	public float getLastSale() {
		return lastSale;
	}

	public float getMarketCap() {
		return marketCap;
	}

	public int getIPOYear() {
		return ipoYear;
	}

	public String getSector() {
		return sector;
	}

	public String getIndustry() {
		return industry;
	}

	public String getSummaryQuote() {
		return summaryQuote;
	}

	public String toString() {
		String output = "ID:" + ID + "symbol:" + symbol + "name:" + name + "lastSale:" + lastSale + "marketCap:" + marketCap + "ipoYear:" + ipoYear
				+ "sector:" + sector + "industry:" + industry + "summaryQuote:" + summaryQuote;
		return output;
	}
}
