package com.syntax.class15;

public class Task9 {
    public static void main(String[] args) {

       // How would you swap  2 strings without a temporary variable?
        String x= "Burger";
        String y = "King";
        System.out.println( y + " " + y);

        x = x + y;
        y = x.substring(0, x.length() - y.length());
        x = x.substring(y.length());
        System.out.println( x + " " + y);
    }
}


