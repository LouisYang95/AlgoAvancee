package com.company;

import static com.company.Main.scan;

public class Exercice4 {
    public static float Remuneration(){
        System.out.println("How much do you want to put ? ");
        float somme = scan.nextFloat();
        System.out.println("Interest rate : ");
        float interestRate = scan.nextFloat();
        System.out.println("How long it has been there ? ");
        int years = scan.nextInt();
        float finalValue = somme*(1+interestRate*years);
        System.out.printf("This is how much you have : " + finalValue);
        return finalValue;
    }
}
