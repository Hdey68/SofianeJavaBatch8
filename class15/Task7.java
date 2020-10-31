package com.syntax.class15;

import java.util.regex.Pattern;

public class Task7 {
    public static void main(String[] args) {

       // How would you reverse a String word by word?

       String string="Welcome to Syntax";
        Pattern p = Pattern.compile("\\s");
        System.out.println("The original string is: " + string);
        String[] temp = p.split(string);
        String rev = "";
        for (int i = 0; i < temp.length; i++) {
            if (i == temp.length - 1)
                rev = temp[i] + rev;
            else
                rev = " " + temp[i] + rev;
        }
        System.out.println("The reversed string is: " + rev);
    }
    }
    

