package com.canteras.act;

public class Person {

    String name;
    String lastName1;
    String lastName2;
    Double height;

    //Constructors
    private Person () {
        this.name = "Jon Jr.";
        this.lastName1 = "Doe";
        this.lastName2 = "Smith";
        this.height = 1.81;
    }

    //Metodos
    public String GetName()
    {
        return this.name;
    }
    public String GetLastName1()
    {
        return this.lastName1;
    }
    public String GetLastName2()
    {
        return this.lastName2;
    }
    public Double GetHeight()
    {
        return this.height;
    }
}
