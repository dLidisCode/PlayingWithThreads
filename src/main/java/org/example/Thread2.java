package org.example;

class Thread2 extends Thread {
    BankAccount ba;

    public Thread2(BankAccount ba) {
        this.ba = ba;
    }

    public void run() {
        this.ba.deposit(203.75);
        this.ba.withdraw(100.0);
    }
}
