package com.syntax.class37;

import java.io.FileInputStream;
import java.io.IOException;

public class ExceptionDemo2 {

    public static void main (String[] args) {

            try{
                handlFille();
            }catch (Exception e){
                System.out.println(" error occured");
            }
        }
        public static void handlFille(
                )  {
            String dataFile = "C:\\Users\\Asghar Nazir\\IdeaProjects\\JavaBatch8\\src\\com\\syntax\\class37\\TestData.xlsx";
            FileInputStream fileInputStream = null;
            try {
                fileInputStream = new FileInputStream(dataFile);
                System.out.println("in the try block");
            }
            catch (IOException ioe){
                System.out.println("handling the IO exception ");
            }
            catch (Exception e) {
                System.out.println("Backup code");
            }finally {
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("outside of try catch may never gets executed if we face an exception");
    }
}
