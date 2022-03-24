package com.canteras.act;

public class Fruit {

    String name;
    Double averageWeight;
    String colors;

    //Constructors
    public Fruit () {
        this.name = "Pear";
        this.averageWeight = 11.1;
        this.colors = "Green";
    }

    //Metodos
    public String GetPear()
    {
        return this.name;
    }
    public Double GetWeight()
    {
        return this.averageWeight;
    }
    public String GetColors()
    {
        return this.colors;
    }

    public void bonus ()
    {
        System.out.println("We give you a pear");
    }
}
