package com.syntax.class13;

public class Main {
    public static void main(String[] args) {

        Dog d1 = new Dog();
        d1.age = 3;
        d1.isFriendly = true;
        d1.name = "Lessie";
        d1.type = "Bulldog";
        d1.gender = 'F';
        d1.isHealthy = true;
        d1.bark();
        d1.fetch();
        d1.play("anyname");


        SmartPhone phone = new SmartPhone();
        phone.brand = "Samsung";
        phone.color = "Black";
        phone.model = "S 10";
        phone.call(347445328);
        phone.text(" Find a bug ");
        phone.dial();
        phone.pics();
        SmartPhone Iphone = new SmartPhone();
        Iphone.brand = "Iphone";
        Iphone.color = "Black";
        Iphone.model = "12 mini";
        Iphone.call(347445328);
        Iphone.text(" Text me ");
        Iphone.dial();
        Iphone.pics();


    }
}
