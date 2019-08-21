package com.nico.Personnages;

import java.util.List;

public abstract class Personnage {

    protected int level;
    protected int life;
    protected int strength;
    protected int agility;
    protected int intelligence;

    public Personnage(int level, int strength, int agility, int intelligence) {
        this.level = level;
        this.life = level * 5;
        this.strength = strength;
        this.agility = agility;
        this.intelligence = intelligence;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getAgility() {
        return agility;
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int basicAttack(int pv, String joueurAtk, String joueurDef){

        return pv;
    }

    public List<Integer> SpecialAttack(int pv, String joueurAtk, String joueurDef){

        return null;
    }

    public int lifeCheck(int pv){
        if (pv < 0 ){
            return 0;
        }
        else{
            return pv;
        }
    }



}
