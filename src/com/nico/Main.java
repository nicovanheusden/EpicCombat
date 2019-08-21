package com.nico;

import com.nico.Personnages.Personnage;
import com.nico.RuleGame.*;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // PLAYER 1
        InitPerso player1 = new InitPerso();
        int choixPerso1 = player1.initHeros(1);
        int levelPerso1 = player1.initCaractHero("Niveau");
        int strengthPerso1 = player1.initCaractHero("Force");
        int agilityPerso1 = player1.initCaractHero("Agilité");
        int intelligencePerso1 = player1.initCaractHero("Intelligence");

        CreatePerso perso1 = new CreatePerso(levelPerso1, strengthPerso1, agilityPerso1, intelligencePerso1);
        Personnage heros1 = perso1.creationHero(choixPerso1);

        //PLAYER 2
        InitPerso player2 = new InitPerso();
        int choixPerso2 = player2.initHeros(2);
        int levelPerso2 = player2.initCaractHero("Niveau");
        int strengthPerso2 = player2.initCaractHero("Force");
        int agilityPerso2 = player2.initCaractHero("Agilité");
        int intelligencePerso2 = player2.initCaractHero("Intelligence");

        CreatePerso perso2 = new CreatePerso(levelPerso2, strengthPerso2, agilityPerso2, intelligencePerso2);
        Personnage heros2 = perso2.creationHero(choixPerso2);

        //GAME PARTY
        int interrupteur = 0;
        int attaqueChoisi = 0;
        List list;
        do {
            int numHeros = interrupteur+1;
            System.out.println("hero 1 : vie = " + heros1.getLife() + ", hero 2 : vie = " + heros2.getLife());
            if (interrupteur == 0){
                System.out.println("Joueur " + numHeros + " (" + heros1.getLife() + " vitalité) veuillez choisir votre action (1 : Attaque Basique, 2 : Attaque Spécial): ");
            }else{
                System.out.println("Joueur " + numHeros + " (" + heros2.getLife() + " vitalité) veuillez choisir votre action (1 : Attaque Basique, 2 : Attaque Spécial): ");
            }
            Scanner sc = new Scanner(System.in);
            try {
                attaqueChoisi = sc.nextInt();
                if (attaqueChoisi < 1 || attaqueChoisi > 2){
                    System.out.println("Merci de choisir entre 1 et 2");
                    continue;
                }
            } catch (InputMismatchException e){
                System.out.println("Merci d'entrer un chiffre !");
                sc.next();
            }

            Combat combat = new Combat();
            list = combat.Combat(heros1, heros2, interrupteur, attaqueChoisi);

            System.out.println(list.get(0) + ", " + list.get(1));
            heros1.setLife((Integer) list.get(0));
            heros2.setLife((Integer) list.get(1));
            interrupteur = 1 - interrupteur;

        } while(heros1.getLife() > 0 && heros2.getLife() > 0);

        if (heros1.getLife() == 0){
            System.out.println(" Joueur 1 à Perdu");
        }else{
            System.out.println(" Joueur 2 à Perdu");

        }



    }
}
