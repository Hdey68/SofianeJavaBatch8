package com.syntax.class37;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Task2 {
    /*
    read data, have gender field, separate men and women into separate sheets
     */

    public static void main (String[] args) throws IOException {
         String dataFile="C:\\Users\\sofiane\\Desktop\\Book1.xlsx";
        System.out.println (dataFile );

        FileInputStream fileInputStream=new FileInputStream ( dataFile );

        XSSFWorkbook inputXXSFWorkbook=new XSSFWorkbook ( fileInputStream );
        XSSFWorkbook outputXXSFWorkbook=new XSSFWorkbook();

        Sheet sheet=inputXXSFWorkbook.getSheet ( "Sheet1" );

        List<MixedIndividuals> maleIndividualsList=new ArrayList<> (  );
        List<MixedIndividuals> femaleIndividualsList = new ArrayList<>();

        for (int i = 1; i < sheet.getPhysicalNumberOfRows(); i++) {
            Row rowData = sheet.getRow(i);
            MixedIndividuals mixedIndividuals = new MixedIndividuals();
            mixedIndividuals.setFirstName(rowData.getCell(0).getStringCellValue());
            mixedIndividuals.setLastName(rowData.getCell(1).getStringCellValue());
            mixedIndividuals.setAge((int) rowData.getCell(2).getNumericCellValue());
            mixedIndividuals.setGender(rowData.getCell(3).getStringCellValue().charAt(0));
            mixedIndividuals.setSalary(rowData.getCell(4).getNumericCellValue());

            if (mixedIndividuals.getGender() == 'M') {
                maleIndividualsList.add(mixedIndividuals);
            } else {
                femaleIndividualsList.add(mixedIndividuals);
            }
        }

        System.out.println(femaleIndividualsList);
        System.out.println(maleIndividualsList);

        fileInputStream.close();
        FileOutputStream genderOutputStream = new FileOutputStream(dataFile);

        List<MixedIndividuals> inputData=new ArrayList<>(maleIndividualsList);
        inputData.addAll(femaleIndividualsList);


        XSSFSheet inputSheet = outputXXSFWorkbook.createSheet("Sheet1");

        XSSFRow row = inputSheet.createRow(0);

        row.createCell(0).setCellValue("FirstName");
        row.createCell(1).setCellValue("LastName");
        row.createCell(2).setCellValue("Age");
        row.createCell(3).setCellValue("Gender");
        row.createCell(4).setCellValue("Salary");

        for (int i =1 ; i < inputData.size(); i++) {
            row = inputSheet.createRow(i);

            row.createCell(0).setCellValue(inputData.get(i-1).getFirstName());
            row.createCell(1).setCellValue(inputData.get(i-1).getLastName());
            row.createCell(2).setCellValue(inputData.get(i-1).getAge());
            row.createCell(3).setCellValue(String.valueOf(inputData.get(i-1).getGender()));
            row.createCell(4).setCellValue(inputData.get(i-1).getSalary());
        }


        XSSFSheet outputMaleSheet = outputXXSFWorkbook.createSheet("Males");
        for (int i = 0; i < maleIndividualsList.size(); i++) {
            XSSFRow row1 = outputMaleSheet.createRow(i);

            row1.createCell(0).setCellValue(maleIndividualsList.get(i).getFirstName());
            row1.createCell(1).setCellValue(maleIndividualsList.get(i).getLastName());
            row1.createCell(2).setCellValue(maleIndividualsList.get(i).getAge());
            row1.createCell(3).setCellValue(String.valueOf(maleIndividualsList.get(i).getGender()));
            row1.createCell(4).setCellValue(maleIndividualsList.get(i).getSalary());
        }


        XSSFSheet outputFemaleSheet = outputXXSFWorkbook.createSheet("Females");
        for (int i = 0; i < femaleIndividualsList.size(); i++) {
            XSSFRow row2 = outputFemaleSheet.createRow(i);
            row2.createCell(0).setCellValue(femaleIndividualsList.get(i).getFirstName());
            row2.createCell(1).setCellValue(femaleIndividualsList.get(i).getLastName());
            row2.createCell(2).setCellValue(femaleIndividualsList.get(i).getAge());
            row2.createCell(3).setCellValue(String.valueOf(femaleIndividualsList.get(i).getGender()));
            row2.createCell(4).setCellValue(femaleIndividualsList.get(i).getSalary());
        }
        outputXXSFWorkbook.write(genderOutputStream);

    }



}

