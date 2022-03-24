package com.canteras.act;

public class BankAccount {

    Integer accountNumber;
    Boolean activated;

    //Constructors
    public BankAccount () {
        this.accountNumber = 625714;
        this.activated = true;
    }

    //Metodos
    public void watchNumber()
    {
        System.out.println("Your number account is: 625714");
    }
    public void status()
    {
        System.out.println("Your bank account is activated");
    }
}
