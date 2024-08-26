package org.example;

import java.util.concurrent.locks.ReentrantLock;

class BankAccount {
    private double balance;
    private String accountNumber;
    private ReentrantLock lock;

    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
        this.lock = new ReentrantLock();
    }

    public void deposit(double amount) {
        this.lock.lock();

        try {
            this.balance += amount;
        } finally {
            this.lock.unlock();
        }

    }

    public void withdraw(double amount) {
        this.lock.lock();

        try {
            this.balance -= amount;
        } finally {
            this.lock.unlock();
        }

    }

    public void showBalance() {
        System.out.println("The balance is :" + this.balance);
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public void printAccountNumber() {
        System.out.println("Account number is : " + this.accountNumber);
    }
}
