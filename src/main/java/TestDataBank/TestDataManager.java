package TestDataBank;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TestDataManager implements TestDataUtils<String, Integer> {

    static String filePath = "D:\\Travelport\\testLoc.xlsx";
    static File file;
    static XSSFWorkbook wb;
    static Iterator<Sheet> sheetIterator;
    static DataFormatter dataFormattter;

    /***
     * Static initializer block for worbook object, File Object, and data formatter
     * generic string data formatter to be used as an excel might have multiple kind of data format
     * which needs to supported for an application output
     */   
    
    static {
	try {
	    file = new File(filePath);
	    wb = new XSSFWorkbook(file);
	    dataFormattter = new DataFormatter();
	} catch (InvalidFormatException | IOException e) {

	    e.printStackTrace();
	}
    }
    

    @Override
    public String getdataFromRowColoumNumber(Integer sheetIndex, Integer RwoIndex, Integer ColumINdex) {

	return dataFormattter.formatCellValue(wb.getSheetAt(sheetIndex).getRow(RwoIndex).getCell(ColumINdex));
    }

    @Override
    public List<String> getAllRowValue() {
	List<String> alldata = new ArrayList<>();
	try {

	    sheetIterator = wb.sheetIterator();
	    while (sheetIterator.hasNext()) {
		Sheet sheet = sheetIterator.next();
		Iterator<Row> iterateRow = sheet.rowIterator();
		alldata.addAll(getCellValueFromEachRow(iterateRow));
	    }

	} catch (Exception e) {
	    e.printStackTrace();
	}
	return null;

    }

    private List<String> getCellValueFromEachRow(Iterator<Row> iterateRow) {
	List<String> alldata = new ArrayList<>();
	while (iterateRow.hasNext()) {
	    Row row = iterateRow.next();
	    Consumer<? super Cell> action = p -> alldata.add(dataFormattter.formatCellValue(p));
	    row.cellIterator().forEachRemaining(action);
	}
	return alldata;
    }
}
