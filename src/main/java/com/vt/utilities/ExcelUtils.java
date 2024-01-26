package com.vt.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import com.vt.constants.FrameworkConstants;
import com.vt.exceptions.FrameworkException;
import com.vt.exceptions.InvalidPathForExcelException;

public final class ExcelUtils {

	private ExcelUtils() {
	}

	public static Object[][] readMultipleData(String sheetName) {

		try (FileInputStream fis = new FileInputStream(FrameworkConstants.getExcelpath())) {
			Workbook wb = WorkbookFactory.create(fis);
			Sheet sh = wb.getSheet(sheetName);
			int lastRow = sh.getLastRowNum();
			int lastCel = sh.getRow(0).getLastCellNum();

			Object[][] data = new Object[lastRow][lastCel];

			for (int i = 0; i < lastRow; i++) {
				for (int j = 0; j < lastCel; j++) {
					data[i][j] = sh.getRow(i + 1).getCell(j).getStringCellValue();
				}
			}
			return data;
		} catch (FileNotFoundException e) {
			throw new InvalidPathForExcelException("Excel File you trying to read is not found");
		} catch (IOException e) {
			throw new FrameworkException("Some io exception happened  while reading excel file");
		}
	}
}
