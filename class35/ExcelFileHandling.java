package com.syntax.class35;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelFileHandling {

    public static void main (String[] args) throws IOException {
        String path="C:\\Users\\sofiane\\eclipse-workspace\\JavaBatch8Test1\\src\\com\\syntax\\class35\\Test.xlsx";
        System.out.println (path );
        FileInputStream fileInputStream=new FileInputStream ( path );

        XSSFWorkbook workbook=new XSSFWorkbook ( fileInputStream );
        Sheet sheet=workbook.getSheet ( "FirstPage" );
        Row row=sheet.getRow ( 0 );
        Cell cell=row.getCell ( 0 );
        System.out.println (cell.toString () );


    }
}
