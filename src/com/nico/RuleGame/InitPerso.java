package com.nico.RuleGame;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InitPerso {

    public int initHeros(int num){
        System.out.println("Bienvenue dans MagiWorld, le jeu de combat épique !!");
        System.out.println("Création du personnage du Joueur " + num + ":");
        int choixHero = 0;
        do {
            System.out.println("Veuillez selectionner un héros : (1 : Guerrier, 2 : Rodeur, 3 : Mage) ");
            Scanner scanner = new Scanner(System.in);
            try {
                choixHero = scanner.nextInt();
            } catch (InputMismatchException e){
                System.out.println("Merci d'entrer un chiffre !");
                scanner.next();
            }
        }while (choixHero != 1 && choixHero != 2 && choixHero != 3);

        return choixHero;
    }

    public int initCaractHero(String caract){
        int numcaract = 1;
        boolean goodResponse;
        do{
            System.out.println(caract + " du Héro :" );
            Scanner sc = new Scanner(System.in);
            try {
                numcaract = sc.nextInt();
                goodResponse = (numcaract > 0 || numcaract < 100);
            } catch (InputMismatchException e){
                System.out.println("Merci d'entrer un chiffre !");
                goodResponse = false;
                sc.next();
            }
            if (caract == "Niveau" && numcaract < 1){
                System.out.println("Niveau initialiser à 1");
                numcaract = 1;
            }
        } while (!goodResponse);

        return numcaract;
    }
}
