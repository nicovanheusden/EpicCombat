package com.nico.Personnages;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GuerrierTest {

    Guerrier guerrier1 = new Guerrier(2,5,1,0);
    Guerrier guerrier2 = new Guerrier(2,5,1,0);
    String joueur1 = "Joueur1";
    String joueur2 = "Joueur2";

    @Test
    void Given_LessPv_When_GuerrierAttacks_ThenReturnGoodPv() {
        guerrier2.life = guerrier1.basicAttack(guerrier2.life, joueur1, joueur2);
        assertEquals(5, guerrier2.life);

    }

    @Test
    void Given_LessPvAndLessLife_When_GuerrierSpecialAttacks_ThenReturnGoodPvAndLife() {
        List<Integer> list = guerrier1.SpecialAttack(guerrier2.life, joueur1, joueur2);
        guerrier2.life = list.get(0);
        guerrier1.life = list.get(1);
        assertEquals(0, guerrier2.life);
        assertEquals(8, guerrier1.life);
    }

    @Test
    void Given_0Pv_When_PlayerDie_Then_Return0Pv(){
        guerrier2.life = guerrier1.basicAttack(guerrier2.life, joueur1, joueur2);
        List<Integer> list = guerrier1.SpecialAttack(guerrier2.life, joueur1, joueur2);
        guerrier2.life = list.get(0);
        guerrier1.life = list.get(1);
        assertEquals(0, guerrier2.life); // ne retourne jamais un pv négatif
        assertEquals(8, guerrier1.life);

    }
}