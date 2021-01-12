package com.syntax.classReview20;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ExcelFilesDemo {
    public static void main (String[] args) throws IOException {
        String path="C:\\Users\\sofiane\\eclipse-workspace\\JavaBatch8Test1\\src\\com\\syntax\\classReview20\\Book3.xlsx";
        FileInputStream fileInputStream=new FileInputStream ( path );
        XSSFWorkbook workbook=new XSSFWorkbook ( fileInputStream );
        Sheet sheet=workbook.getSheet ( "Sheet1" );

        List<Person> allFileData=new ArrayList<> (  );

        for (int i = 1; i < sheet.getPhysicalNumberOfRows (); i++) {
            Row row=sheet.getRow ( i );
            Person person=new Person ( );
            person.setFirstName ( row.getCell ( 0 ).toString () );
            person.setLastName ( row.getCell ( 1 ).toString () );
            person.setAge ((int )( row.getCell ( 2 ).getNumericCellValue () ));
            allFileData.add ( person );

        }
        System.out.println (allFileData );

    }
}
