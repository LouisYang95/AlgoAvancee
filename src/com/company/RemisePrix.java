package com.company;

public class RemisePrix {

    public static float prixFinale(int premiereRemise, int secondeRemise){
        float n = 10;
        float moitie = n*premiereRemise/100;
        float x = moitie - moitie*secondeRemise/100;
        if (premiereRemise>secondeRemise){
            System.out.println("le prix finale est de : "+ x);
        }else {
            System.out.println("Erreur : les valeurs doivent ecrites de manieres croissantes");
        }
        return x;
    }


    public static void paiement(float argent , float prix){
        String billetDe10 = String.valueOf(10);
        String billetDe5  = String.valueOf(5);
        String pieceDe1   = String.valueOf(1);
        String piedeDe50  = String.valueOf(0.50);
        if(argent > prix){
            System.out.println("Le client donne : " + argent);
          float i = argent - prix;
          if ()
            System.out.println("Vous devez rendre : " + i);
        }else {
            System.out.println("Il n'y a pas assez d'argent!");
        }
    }










}
