import java.util.*;

public class Account {
    private int accountNumber;
    private double balance = 0.0;

    public Account(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
	    this.balance = balance;
    }

    public Account(int accountNumber) {
        this.accountNumber = accountNumber;
    }
    
    public void credit(double amount) {
        this.balance = balance + amount;
    }
    
    public void debit(double amount) {
        if(balance >= amount) {
            this.balance = balance - amount;
        } else {
            throw new IllegalArgumentException("Amount withdrawn exceeds balance!"); 
        }
    }

    public String toString(){//overriding the toString() method
        return String.format("A/C: %d , Balance: $%.2f", accountNumber, balance);  
    }    

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
	   return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
