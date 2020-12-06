package com.syntax.classReview07;

class Dog {
    //default values
    String name; //null
    //Dog dog;
    int age; //0
    double weight; //0.0
    boolean isAggressive; //false

    void printProperties() {
        System.out.println("Name " + name +
                " Age " + age +
                " Weight " + weight +
                " isAggressive " + isAggressive);
    }

}
public class InstanceVarDemo2 {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.name = "Bobby";
        dog1.age = 20;
        dog1.weight = 20.5;
        dog1.isAggressive = true;
        dog1.printProperties();

        Dog dog2 = new Dog();
        dog2.name = "Spanky";
        dog2.age = 10;
        dog2.weight = 5.5;
        dog2.isAggressive = true;
        dog2.printProperties();


        Dog dog3 = new Dog();
        dog3.name = "Jerry";
        dog3.age = 25;
        dog3.weight = 15.5;
        dog3.isAggressive = false;
        dog3.printProperties();

    }
}



