package com.canteras.act;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BankAccount Ba;
        Ba = new BankAccount();

        Fruit f;
        f = new Fruit();

        Bank b;
        b = new Bank();

        SecurityPin sp;
        sp = new SecurityPin();

        SecurityFamily se;
        se = new SecurityFamily();

        System.out.println("Hello you, below you will see your bank details depending on which option you choose");
        System.out.println(" ");
        System.out.println("Option            |  code");
        System.out.println("Bank account      |  a");
        System.out.println("Your bonus fruit  |  b");
        System.out.println("Bank information  |  c");
        System.out.println("Security PIN      |  d");
        System.out.println("Security family   |  e");

        Scanner option = new Scanner(System.in);
        String num = option.nextLine();

        switch (num){
            case "a":
                Ba.watchNumber();
                break;
            case "b":
                f.bonus();
                break;
            case "c":
                b.BankName();
                b.showType();
                b.watchMoney();
            case "d":
                sp.getPin();
                sp.getTotalNumbers();
                sp.getHelp();
                break;
            case "e":
                se.getFamilyInfo();
                break;
            default:
                System.out.println("Have a nice day");
        }
    }
}
