package com.syntax.class35;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExcelFileHandlingDemo3 {

    public static void main (String[] args) throws IOException {
        String path = "C:\\Users\\sofiane\\eclipse-workspace\\JavaBatch8Test1\\src\\com\\syntax\\class35\\Test.xlsx";
        System.out.println ( path );//path to the file
        FileInputStream fileInputStream = new FileInputStream ( path );//creating connection
        XSSFWorkbook workbook = new XSSFWorkbook ( fileInputStream );//creating the object of XSSFWorkbook to manipulate xlsx files
        Sheet sheet = workbook.getSheet ( "Sheet2" );//accessing the sheet
        Row row = sheet.getRow ( 1 );//access the row by index
        Cell cell = row.getCell ( 2 );//access the cell by index
        cell.setCellValue ( "mahmut" );
        System.out.println ( cell );//printing the results
        FileOutputStream fileOutputStream=new FileOutputStream ( path );//creating the connection to write the data
        workbook.write ( fileOutputStream );//writing the data
    }
}
