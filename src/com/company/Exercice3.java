package com.company;

import java.util.Scanner;

import static com.company.Main.scan;

public class Exercice3 {

    public static void pret() {
        System.out.println("How much loan do you want ?");
        double c = scan.nextInt();
        System.out.println("For,how many years ? ");
        double n = scan.nextInt();
        System.out.println("put a interestRate : ");
        double t = scan.nextFloat();

        double costFinal = (c * (t / 12)) / (1 - Math.pow((1 + (t/12)) , (-12) * n));
        System.out.println(costFinal);
        //return (int) costFinal;

    }
}
