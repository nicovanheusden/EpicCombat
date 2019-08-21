package com.nico.RuleGame;

import com.nico.Personnages.Personnage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Combat {

    public List<Integer> Combat(Personnage joueur1, Personnage joueur2, int interrupteur, int sc){
        int viePerso1 = joueur1.getLife();
        int viePerso2 = joueur2.getLife();
        String joueurAtk;
        String joueurDef;
        List<Integer> list = new ArrayList<>();
        if (interrupteur == 0){
            joueurAtk = "Joueur 1";
            joueurDef = "Joueur 2";
        } else{
            joueurAtk = "Joueur 2";
            joueurDef = "Joueur 1";

        }
        if (sc == 1 && interrupteur == 0) {
            viePerso2 = joueur1.basicAttack(viePerso2, joueurAtk, joueurDef);
            list.add(viePerso1);
            list.add(viePerso2);
        }
        else if (sc == 1 && interrupteur == 1){
            viePerso1 = joueur2.basicAttack(viePerso1, joueurAtk, joueurDef);
            list.add(viePerso1);
            list.add(viePerso2);

        }
        else if (sc == 2 && interrupteur == 1){
            list = joueur2.SpecialAttack(viePerso1, joueurAtk, joueurDef);
            Collections.swap(list, 0, 1);
        }
        else {
            list = joueur1.SpecialAttack(viePerso2, joueurAtk, joueurDef);
        }
        return list;
    }
}
