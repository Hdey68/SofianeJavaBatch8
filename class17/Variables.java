package com.syntax.class17;

public class Variables {
    public int instanceNum = 45;

    //break till 8:20
    public void varsDemo() {
        int number1 = 10;
        if (number1 > 10) {
            int number2 = 90;
        }



        System.out.println(number1);
    }

    public void varsDemo1() {
        int number2 = -10;
        System.out.println(number2);
    }

    public static void main(String[] args) {
        Variables variables=new Variables();
        Variables var2=new Variables();
        variables.varsDemo();
        variables.varsDemo1();
    }
}

