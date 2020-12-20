package com.syntax.class36;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class WhyTryCatch {

    public static void main(String[] args) throws IOException {
        String path="C:\\Users\\sofiane\\Desktop\\TestData.xlsx";

        String backupFilepath="C:\\Users\\sofiane\\Desktop\\TestData.xlsx";


        System.out.println("Before the try block");
        try {
            FileInputStream fileInputStream=new FileInputStream(path);

            XSSFWorkbook xssfWorkbook=new XSSFWorkbook(fileInputStream);

            Sheet sheet=xssfWorkbook.getSheet("PersonData");

            fileInputStream.close();
            System.out.println("In the Try block");
        }catch (java.lang.Exception exception){
            System.out.println("File Not found");

            System.out.println("executing the backup");

        }


        System.out.println("Important code ");



        File file=new File(path);
        if(file.exists()){
            FileInputStream fileInputStream=new FileInputStream(path);

            XSSFWorkbook xssfWorkbook=new XSSFWorkbook(fileInputStream);

            Sheet sheet=xssfWorkbook.getSheet("PersonData");
        }else {
            System.out.println("File Not found");

            System.out.println("executing the backup");
        }

        System.out.println("Important code ");
    }
}
