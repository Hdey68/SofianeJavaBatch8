package com.syntax.class36;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadWriteExcel {

    public static void main (String[] args) throws IOException {

        String inputFilePath="C:\\Users\\sofiane\\Desktop\\Task1.xlsx";//filePath for input file
        String outputFilePath="C:\\Users\\sofiane\\Desktop\\OutputTask.xlsx";//filePath for output file

        FileInputStream fileInputStream=new FileInputStream(inputFilePath); //creating the input stream to read the data
        FileOutputStream fileOutputStream=new FileOutputStream(outputFilePath); //creating the output stream to write the data

        XSSFWorkbook inputXSSWorkbook=new XSSFWorkbook(fileInputStream); //used to manipulate the file with extension xlsx
        /// HSSFWorkbook hssfWorkbook=new HSSFWorkbook(); To manipulate the files with extension xls
        XSSFWorkbook outputXSSWorkbook=new XSSFWorkbook(); // we don't need to specify the output stream in the constructor

        Sheet sheet=inputXSSWorkbook.getSheet("PersonData1");
        List<PersonInfo> personInfoList=new ArrayList<>();
        for (int i = 1; i <sheet.getPhysicalNumberOfRows() ; i++) {
            Row row=sheet.getRow(i);
            PersonInfo personInfo=new PersonInfo();
            personInfo.setFirstName(row.getCell(0).getStringCellValue());
            personInfo.setLastName(row.getCell(1).toString());
            personInfo.setAge((int)row.getCell(2).getNumericCellValue());
            personInfo.setSalary(row.getCell(3).getNumericCellValue());
            if(personInfo.getSalary()>100000){
                personInfoList.add(personInfo);
            }


        }

        System.out.println(personInfoList);

        XSSFSheet outputSheet = outputXSSWorkbook.createSheet("OutputSheet");
        for (int i = 0; i < personInfoList.size(); i++) {
            XSSFRow row = outputSheet.createRow(i);
            PersonInfo personInfo = personInfoList.get(i);

            row.createCell(0).setCellValue(personInfo.getFirstName());
            row.createCell(1).setCellValue(personInfo.getLastName());
            row.createCell(2).setCellValue(personInfo.getAge());
            row.createCell(3).setCellValue(personInfo.getSalary());
        }

        outputXSSWorkbook.write(fileOutputStream);
        }
    }




