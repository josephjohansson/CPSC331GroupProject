package lists;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class readCompanyList {
	String fileName;
	BufferedReader br = null;
	String lineInFile = "";
	String cvsSplitChar = ",";

	public readCompanyList(String newFileName) {
		fileName = newFileName;

	}

	public void readList() {
		try {
			br = new BufferedReader(new FileReader(fileName));

			while ((lineInFile = br.readLine()) != null) {
				String[] splitInformation = lineInFile.split(cvsSplitChar);

			}
		} catch (FileNotFoundException e) {

		} catch (IOException e) {

		}

	}
}
