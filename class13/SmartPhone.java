package com.syntax.class13;

public class SmartPhone {
    String brand;
    String color;
    String model;

    void call(int phoneNumber) {
        System.out.println(" Calling " + phoneNumber);
    }
    void dial() {
        System.out.println(brand + " can dial");
    }
    void text(String text) {
        System.out.println(brand + model + " can text " + text);
    }
    void pics() {
        System.out.println(brand + " can take a picture " );
    }

    void call(String phoneNumber) {
        System.out.println("Calling" + phoneNumber);
    }

}
