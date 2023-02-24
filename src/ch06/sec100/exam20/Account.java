package ch06.sec100.exam20;

import java.util.Scanner;

public class Account {

    private String accountNumber;
    private String accountOwner;
    private int balance;

    public Account(String accountNumber, String accountOwner, int balance){
        this.accountNumber = accountNumber;
        this.accountOwner = accountOwner;
        this.balance = balance;
    }

    public String getAccountNumber() {return accountNumber;}
    public void setAccountNumber() {this.accountNumber = accountNumber;}
    public String getAccountOwner() {return accountOwner;}
    public void setAccountOwner() {this.accountOwner = accountOwner;}
    public int getBalance() {return balance;}
    public void setBalance(int balance) {this.balance = balance;}

}
