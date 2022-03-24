package com.canteras.act;

public class Bank {

    Integer totalMoney;
    String bankName;
    String typeBank;

    //Constructors
    /**
     * Define los valores de las variables
     */
    public Bank () {
        this.totalMoney = 625714;
        this.bankName = "Bank Solutions";
        this.typeBank = "Savings";
    }

    //Metods
    public void watchMoney()
    {
        System.out.println("In your account you have: 5.000.000");
    }
    public void BankName()
    {
        System.out.println("Your bank is: Bank Solutions");
    }
    public void showType()
    {
        System.out.println("Your type of bank is: Savings ");
    }
}
