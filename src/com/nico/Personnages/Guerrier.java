package com.nico.Personnages;

import java.util.ArrayList;
import java.util.List;

public class Guerrier extends Personnage {

    public Guerrier(int level, int strength, int agility, int intelligence) {
        super(level, strength, agility, intelligence);
    }

    @Override
    public int basicAttack(int pv, String joueurAtk, String joueurDef) {
        System.out.println(joueurAtk + " utilise son attaque Coup d'Épée !! ");
        System.out.println(joueurDef + " perd " + strength + " pv.");
        pv -= strength;
        pv = lifeCheck(pv);
        return pv;

    }

    @Override
    public List<Integer> SpecialAttack(int pv, String joueurAtk, String joueurDef) {
        System.out.println(joueurAtk + " utilise son attaque Coup de Rage !! ");
        System.out.println(joueurDef + " perd "+ strength*2 + " pv.");
        System.out.println(joueurAtk + " perd "+ strength/2 + " pv.");
        pv -= strength * 2;
        life -= strength /2;
        pv = lifeCheck(pv);
        life = lifeCheck(life);
        List<Integer> list = new ArrayList<>();
        list.add(life); // vie joueur1
        list.add(pv); // vie joueur2
        return list;
    }
}
