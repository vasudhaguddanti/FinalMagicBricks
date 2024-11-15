package com.utilityClasses;


import java.io.FileInputStream;
import java.util.Properties;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileUtility {
	/**
	 * Fetches data from a specified cell in an Excel sheet.
	 * @param sheetName
	 * @param rowNum
	 * @param cellNum
	 * @return
	 * @throws Exception
	 */
	public String getDataFromExcel(String sheetName, int rowNum, int cellNum) throws Exception {
		FileInputStream fis = new FileInputStream(UtilityConstants.excelPath);
		Workbook wb = WorkbookFactory.create(fis);
		String data = wb.getSheet(sheetName).getRow(rowNum).getCell(cellNum).toString();
		wb.close();
		return data;
	}

	/**
	 * Fetches data from a properties file using a specified key.
	 * @param Key
	 * @return
	 * @throws Exception
	 */
	public String getDataFromPropertiesFiles(String Key) throws Exception {
		FileInputStream fis = new FileInputStream(UtilityConstants.propertyPath);
		Properties pObj = new Properties();
		pObj.load(fis);
		String data = pObj.getProperty(Key);
		return data;
	}
}