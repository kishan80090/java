package AdvanceJava;

public class Bank {
    Person customer;
    String account_no;
    int balance;

    public Bank(Person customer, String account_no, int balance) {
        this.customer = customer;
        this.account_no = account_no;
        this.balance = balance;
    }

    public String toString() {
        String output = String.format("Account No: %s, Customer (%s),Balance=%s", account_no, customer, balance);
        return output;
    }

    public static void main(String[] args) {
        Bank b1 = new Bank(new Person("MS Dhoni", "Ranchi", "9335874326", 40), "101", 1000);
        System.out.println(b1);

    }
}
