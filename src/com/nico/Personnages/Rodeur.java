package com.nico.Personnages;

import java.util.ArrayList;
import java.util.List;

public class Rodeur extends Personnage {

    public Rodeur(int level, int strength, int agility, int intelligence) {
        super(level, strength, agility, intelligence);
    }

    @Override
    public int basicAttack(int pv, String joueurAtk, String joueurDef) {
        System.out.println(joueurAtk + " utilise son attaque Tir à l'arc !!");
        System.out.println(joueurDef + " perd " + agility + " pv.");
        pv -= agility;
        pv = lifeCheck(pv);
        return pv;
    }

    @Override
    public List<Integer> SpecialAttack(int pv, String joueurAtk, String joueurDef) {
        System.out.println(joueurAtk + " utilise son attaque Concentration !! ");
        System.out.println(joueurAtk + " gagne " + agility/2 + " en Niveau.");
        level += agility/2;
        List<Integer> list = new ArrayList<>();
        list.add(life);
        list.add(pv);
        return list;
    }
}
