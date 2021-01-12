package com.syntax.classReview20;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFileDemo {

    public static void main (String[] args) throws IOException {

        String path = "C:\\Users\\sofiane\\eclipse-workspace\\JavaBatch8Test1\\src\\com\\syntax\\classReview20\\Test.properties";
        FileInputStream fileInputStream=new FileInputStream ( path );

        Properties properties=new Properties (  );
        properties.load ( fileInputStream );//always load the data before making any changes if you want to retain the data from your files
        System.out.println ( properties.getProperty ( "Username" ));
        System.out.println (properties.getProperty ( "Pass" ) );
        properties.setProperty ( "Pass","pas123" );
        fileInputStream.close ();
        FileOutputStream fileOutputStream=new FileOutputStream ( path );
        properties.store ( fileOutputStream,"changed the password" );

    }
}