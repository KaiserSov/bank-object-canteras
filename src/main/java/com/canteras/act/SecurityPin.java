package com.canteras.act;

public class SecurityPin {

    Integer pin;
    Integer help;
    Integer TotalNumbers;

    //Constructor
    /**
     * Define los valores de las variables
     */
    protected SecurityPin () {
        this.pin = 526973;
        this.help = 5;
        this.TotalNumbers = 6;
    }

    //Metods
    public void getPin() {
        System.out.println("Your PIN is: 526973");
    }
    public void getHelp() {
        System.out.println("Your PIN start with: 5");
    }
    public void getTotalNumbers() {
        System.out.println("Your PIN have 6 numbers");
    }
}
