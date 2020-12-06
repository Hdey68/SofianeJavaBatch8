package com.syntax.classReview06;

public class MethodsExample2 {

    public static void main(String[] args) {

        printNTime("Please Study ",10);
    }

    static void printNTime(String word, int nTimes) {
        for (int i = 0; i < nTimes ; i++) {
            System.out.println(word);
        }

    }
    void printRainInfo(){
        isItRaining(false);
        printNTime("Please Study ",10);

    }
    public void isItRaining(boolean isRaining){
        if(isRaining){
            System.out.println("Please take the umbrella");

        }else{
            System.out.println("Let s go for walk");
        }
    }


}
