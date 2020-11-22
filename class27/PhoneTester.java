package com.syntax.class27;

public class PhoneTester {
    public static void main(String[] args) {

        Phone iphone = new Iphone();
        iphone.call();
        iphone.text();
        iphone.playMusic();
        iphone.takePicture();
        Phone samsung = new Samsung();

        samsung.call();
        samsung.text();
        samsung.playMusic();
        samsung.takePicture();

        //same output
        //Break till 09:00

        Phone[] allPhones = {iphone, samsung};
        for (Phone phone : allPhones
        ) {
            phone.call();
            phone.text();
            phone.playMusic();
            phone.takePicture();
        }

    }
}

