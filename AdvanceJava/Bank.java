package AdvanceJava;

import java.util.Scanner;

public class Bank {
    Person customer;
    String account_no;
    int balance;
    Scanner scanner;

    public Bank(Person customer, String account_no, int balance) {
        this.customer = customer;
        this.account_no = account_no;
        this.balance = balance;
        scanner = new Scanner(System.in);
    }

    public void deposit() {
        System.out.print("Enter amount to deposit : ");
        int amount = Integer.parseInt(scanner.nextLine());
        if (amount >= 0) {
            balance += amount;
        } else {
            System.out.println("Not deposite");
        }
    }
    public void withdrow() {
        System.out.print("Enter amount to withdrow : ");
        int amount = Integer.parseInt(scanner.nextLine());
        if (balance >= amount) {
            if (amount >= 0) {
                balance = balance - amount;
            } else {
                System.out.println("Not Withdrow Negative Balance");
            }
        } else {
            System.out.println("Balance Not Available");
        }
    }
    public String toString() {
        String output = String.format("Account No: %s, Customer (%s),Balance=%s", account_no, customer, balance);
        return output;
    }
    public static void main(String[] args) {
        Bank b1 = new Bank(new Person("MS Dhoni", "Ranchi", "9335874326", 40), "101", 1000);
        System.out.println(b1);
        b1.deposit();
        System.out.println(b1);
        b1.withdrow();
        System.out.println(b1);
    }
}