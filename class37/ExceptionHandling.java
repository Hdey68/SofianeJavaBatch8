package com.syntax.class37;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionHandling {

    public static void main (String[] args) {
        Exception exception =new Exception();
        String path="C:\\Users\\Asghar Nazir\\IdeaProjects\\JavaBatch8\\src\\com\\syntax\\class37\\Book1.xlsx";
        File file=new File(path);
        if(file.exists()){

            try {
                FileInputStream fileInputStream=new FileInputStream(path);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }

        }else {
            System.out.println("File not found");
        }
        System.out.println("code after ");

        String name=null;
        if(name!=null){
            name.length();
        }
        int[] arr=new int[-1];

        int index=12;
        if(index>=0&&index<arr.length){
            System.out.println(arr[index]);
        }else {
            System.out.println("Please provide correct index");
        }
    }
}
