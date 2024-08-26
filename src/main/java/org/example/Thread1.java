package org.example;

class Thread1 extends Thread {
    BankAccount ba;

    public Thread1(BankAccount ba) {
        this.ba = ba;
    }

    public void run() {
        this.ba.deposit(300.0);
        this.ba.withdraw(50.0);
    }
}
