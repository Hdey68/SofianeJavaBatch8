package com.syntax.class13;

public class Dog {

        //write some of the attribute that a dog can have
        String breed;
        String size;
        int age;
        String color;
        String name;
        String type;
        Boolean isFriendly;
        char gender;
        boolean isHealthy;

        void bark(){
            System.out.println("Dog barks");
        }
        void play(String name){
            System.out.println("My dog plays with my kid");
        }

        void sit(){
            System.out.println("Dog sits");
        }

        void fetch() {
            System.out.println("Fetches ball");
        }
        void sleep() {
            System.out.println("zZz");
        }

        public static void main(String[] args) {
            Dog d1=new Dog();
            d1.age= 3;
            d1.isFriendly=true;
            d1.name="Lessie";
            d1.type="Bulldog";
            d1.gender= 'F';
            d1.isHealthy= true;
            d1.bark();
            d1.fetch();

        }
}
