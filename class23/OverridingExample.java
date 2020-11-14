package com.syntax.class23;


    class Bank {
        double bankBalance;

        public Bank(double bankBalance) {
            this.bankBalance = bankBalance;
        }

        void printTransferFee() {
            System.out.println("Transfer Fee " + bankBalance * 0.1);
        }

    }

    class BOA extends Bank {

        public BOA(double bankBalance) {
            super(bankBalance);
        }
    }

    class Chase extends Bank {

        public Chase(double bankBalance) {
            super(bankBalance);
        }

        public void printTransferFee() {
            System.out.println("Transfer Fee " + bankBalance * 0.01);
        }

    }

    public class OverridingExample {

        public static void main(String[] args) {
            Chase chase = new Chase(1000);
            chase.printTransferFee();
            BOA boa = new BOA(1000);
            boa.printTransferFee();
        }


    }
