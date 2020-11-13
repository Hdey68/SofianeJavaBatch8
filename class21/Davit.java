package com.syntax.class21;


    public class Davit extends Parent{
        Davit(){
            System.out.println("From Davit Constructor");
        }


        Davit(int money){
            super(money);
            System.out.println("From Davit Constructor");
        }


        public static void main(String[] args) {
            Davit davit=new Davit(1000);
            davit.print();
        }
}
