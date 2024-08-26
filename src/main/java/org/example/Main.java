package org.example;

public class Main {
    public static void main(String[] args) {
        BankAccount ba = new BankAccount("1234", 1000.0);
        Thread t1 = new Thread1(ba);
        Thread t2 = new Thread2(ba);
        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException var5) {
        }

        ba.showBalance();
    }
}
