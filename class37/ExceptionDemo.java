package com.syntax.class37;

public class ExceptionDemo {
    public static void main (String[] args) {

    int[] arr = {0};
        try {
        System.out.println("important code ");
        System.out.println(10/0);
        doCalculations(arr);
        System.out.println("more Important");
    }
        catch (NullPointerException npe) {
        System.out.println("Please don't provide null array");
    } catch (ArithmeticException ae) {
        System.out.println("Please do not try bto divide by zero");
    } catch (Exception e) {
        System.out.println("Something went wrong");
    }
}
    public static void doCalculations(int[] arr) {
        int[] arry = new int[-1];
        System.out.println(arr[2] / arr[3]);
    }
}
