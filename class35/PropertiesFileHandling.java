package com.syntax.class35;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFileHandling {

    public static void main(String[] args) throws IOException {

        String baseAddress=System.getProperty ( "user.dir" );
        String fileAddress=baseAddress+"\\"+"ConfigData.properties";
        System.out.println (fileAddress );

        FileInputStream fileInputStream=new FileInputStream ( fileAddress );
        Properties properties=new Properties (  );
        properties.load ( fileInputStream );
        String username=properties.getProperty ( "Username" );
        System.out.println (username);

        FileOutputStream fileOutputStream=new FileOutputStream ( fileAddress );
        properties.setProperty ( "phoneNumber","1234567890" );
        properties.store ( fileOutputStream,"Adding PhoneNumber" );



    }
}
