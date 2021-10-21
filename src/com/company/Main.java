package com.company;

public class Main {

    public static void main(String[] args) {
        Account account = new Account(1122, 20000);
        account.setAnnualInterestRate(4.5);
        account.withdraw(2500);
        account.deposit(3000);
        System.out.println("Balance is : " + account.getBalance());
        System.out.println("Monthly interest is : " + account.getMonthlyInterest());
        System.out.println("Date when this account created is : " + account.getDateCreated());
    }
}
