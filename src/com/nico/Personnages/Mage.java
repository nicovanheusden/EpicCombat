package com.nico.Personnages;

import java.util.ArrayList;
import java.util.List;

public class Mage extends Personnage {
    private int beginingLife;

    public Mage(int level, int strength, int agility, int intelligence) {
        super(level, strength, agility, intelligence);
        this.beginingLife = level*5;
    }

    @Override
    public int basicAttack(int pv, String joueurAtk, String joueurDef) {
        System.out.println(joueurAtk + " utilise son attaque Boule de Feu !!");
        System.out.println(joueurDef + " perd " + intelligence + " pv.");
        pv -= intelligence;
        lifeCheck(pv);
        return pv;
    }

    @Override
    public List<Integer> SpecialAttack(int pv, String joueurAtk, String joueurDef) {
        List<Integer> list = new ArrayList<>();
        System.out.println(joueurAtk + " utilise son attaque Soin !!");
        if (life + intelligence*2 > beginingLife){
            System.out.println(joueurAtk + " à 100% de vie");
            life = beginingLife;
        }
        else {
            System.out.println(joueurAtk + " gagne " + intelligence*2 + " pv.");
            life += intelligence*2;
        }
        list.add(life);
        list.add(pv);
        return list;
    }
}
