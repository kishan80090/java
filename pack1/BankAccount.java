package pack1;

public class BankAccount {
    private int balance;
    private String name,accountno;
    static BankAccount[]accounts={new BankAccount(1000,"Rahul","1"),new BankAccount(1000,"Sachin","2")};
    public BankAccount(int balance,String name,String account){
        this.balance=balance;
        this.name=name;
        this.accountno=account;
    }
    public int getBalance(){
        return balance;
    }
    public String getName(){
        return name;
    }
    public String getAccountno(){
        return accountno;
    }
    public static BankAccount[] accounts(){
        return accounts;
    }
    @Override
    public String toString(){
        return "BankAccount{"+"Balance = "+balance+",Name = "+name+",Accountno = "+accountno+"}";
    }
}
