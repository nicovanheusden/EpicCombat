package com.nico.RuleGame;

import com.nico.Personnages.Guerrier;
import com.nico.Personnages.Mage;
import com.nico.Personnages.Personnage;
import com.nico.Personnages.Rodeur;

public class CreatePerso {

    protected int lifePerso;
    protected int levelPerso;
    protected int strengthPerso;
    protected int agilityPerso;
    protected int intelligencePerso;

    public CreatePerso(int levelPerso, int strengthPerso, int agilityPerso, int intelligencePerso) {
        this.levelPerso = levelPerso;
        this.strengthPerso = strengthPerso;
        this.agilityPerso = agilityPerso;
        this.intelligencePerso = intelligencePerso;
        this.lifePerso = levelPerso * 5;
    }

    public Personnage creationHero(int choixPerso){
        Personnage personnage = null;

        switch (choixPerso){
            case 1:
                System.out.println("Je suis un guerrier de niveau " + levelPerso + " je possède " + lifePerso + " de pv , " + strengthPerso + " de force, " + agilityPerso + " d'agilité, et " + intelligencePerso + " d'intelligence.");
                Personnage guerrier = new Guerrier(levelPerso, strengthPerso, agilityPerso, intelligencePerso);
                personnage  = guerrier;
                break;
            case 2:
                System.out.println("Je suis un rodeur de niveau " + levelPerso + " je possède " + lifePerso + " de pv, " + strengthPerso + " de force, " + agilityPerso + " d'agilité, et " + intelligencePerso + " d'intelligence.");
                Personnage rodeur = new Rodeur(levelPerso, strengthPerso, agilityPerso, intelligencePerso);
                personnage = rodeur;
                break;
            case 3:
                System.out.println("Je suis un mage de niveau " + levelPerso + " je possède " + lifePerso + " de pv, " + strengthPerso + " de force, " + agilityPerso + " d'agilité, et " + intelligencePerso + " d'intelligence.");
                Personnage mage = new Mage(levelPerso ,strengthPerso ,agilityPerso ,intelligencePerso );
                personnage = mage;
                break;
            default:
                System.out.println("merci de chosir un héros correspondant");
        }
        return personnage;
    }
}
