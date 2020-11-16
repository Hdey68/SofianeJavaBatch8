package com.syntax.class24;


    class A
    {

    }

    class B extends A
    {

    }

    class C extends B {


        static void overloadedMethod(A a) {
            System.out.println("ONE");
        }

        static void overloadedMethod(B b) {
            System.out.println("TWO");
        }

        static void overloadedMethod(Object obj) {
            System.out.println("THREE");
        }

        public static class PracticeQuestion {
            public static void main(String[] args) {
                C c = new C();

                Object object = new Object();
                overloadedMethod(object);
                overloadedMethod(c);
            }
        }
    }
