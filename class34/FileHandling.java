package com.syntax.class34;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class FileHandling {
    public static void main (String[] args) throws IOException {

        //Storing the path of the file in a String variable
        String path = "C:\\Users\\sofiane\\eclipse-workspace\\JavaBatch8Test1\\src\\com\\syntax\\class34\\Credentials.properties";

        //creating a connection to file
        FileInputStream fileInputStream = new FileInputStream ( path );


        Properties properties = new Properties ( );
        //Loading the data from file to java program
        properties.load ( fileInputStream );

        //getting the values
        String username = properties.getProperty ( "username" );
        String pass = properties.getProperty ( "password" );
        int number = Integer.parseInt ( properties.getProperty ( "phoneNumber" ) );
        System.out.println ( number );


        //storing the data to file


        System.setProperty ( "webdriver.chrome.driver", "drivers/chromedriver.exe" );
        WebDriver driver = new ChromeDriver ( );
        driver.get ( "https://www.facebook.com/" );
        driver.findElement ( By.id ( "email" ) ).sendKeys ( username );
        driver.findElement ( By.id ( "pass" ) ).sendKeys ( pass );
    }
}






