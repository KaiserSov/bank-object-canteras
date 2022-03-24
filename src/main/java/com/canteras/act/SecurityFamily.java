package com.canteras.act;

public class SecurityFamily {

    Integer quantity;
    Integer telN1;
    Integer telN2;
    String name1;
    String name2;
    String parentage1;
    String parentage2;

    //Constructor
    public SecurityFamily()
    {
        this.quantity = 2;
        this.telN1 = 301545145;
        this.telN2 = 300441598;
        this.name1 = "Marie Doe";
        this.name2 = "Jon Doe";
        this.parentage1 = "Sister";
        this.parentage2 = "Father";
    }

    //Metods
    public void getFamilyInfo()
    {
        System.out.println("Your security family is:");
        System.out.println("Parentage |   Name    | Tel");
        System.out.println("Sister      Marie Doe   301545145");
        System.out.println("Father      Jon Doe     300441598");
    }
}
