package com.syntax.classReview04;

public class Recap {

    public static void main(String[] args) {
        /*
        increment and decrement operators very helpful in loops and can reduce
        your code length
         */
        int num1 = 0;

        System.out.println("int num1=0; \n " + num1);
        num1 = num1 + 1;
        System.out.println("num1=num1+1; \n " + num1);
        num1 += 1;
        System.out.println(" num1+=1; \n" + num1);
        num1++;
        System.out.println("  num1++; \n " + num1);

        int num2 = 10;
        num1 = 0;
        System.out.println("int num1=0; int num2=10; \n " + num1);
        num1 = num1 + num2 + 1;
        System.out.println("num1=num1+num2+1; \n " + num1);
        num1 += num2 + 1;
        System.out.println(" num1+=num2+1; \n" + num1);
        num1++;
        System.out.println("  num1++; \n " + num1);

        num1 = 0;

        System.out.println("int num1=0; \n " + num1);
        num1 = num1 - 1;
        System.out.println("num1=num1-1; \n " + num1);
        num1 -= 1;
        System.out.println(" num1-=1; \n" + num1);
        num1--;
        System.out.println("  num1--; \n " + num1);

        num2 = 10;
        num1 = 0;
        System.out.println("int num1=0; int num2=10; \n " + num1);
        num1 = num1 - num2 - 1;
        System.out.println("num1=num1-num2-1; \n " + num1);
        num1 -= num2 - 1;
        System.out.println(" num1-=num2-1; \n" + num1);
        num1--;
        System.out.println("  num1--; \n " + num1);

        //we can do the upper two with other operators like multiple div and modulo

        num1 = 2;

        System.out.println("int num1=0; \n " + num1);
        num1 = num1 * 10;
        System.out.println("num1=num1*10; \n " + num1);
        num1 *= 2;
        System.out.println("  num1*=2; \n" + num1);

    }
}
