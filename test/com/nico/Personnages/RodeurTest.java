package com.nico.Personnages;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RodeurTest {

    Rodeur rodeur1 = new Rodeur(5,2,10,20);
    Rodeur rodeur2 = new Rodeur(5,2,10,20);
    String joueur1 = "Joueur1";
    String joueur2 = "Joueur2";

    @Test
    void Given_LessPv_When_RodeurAttacks_ThenReturnGoodPv() {
        rodeur2.life = rodeur1.basicAttack(rodeur2.life, joueur1, joueur2 );
        assertEquals(15,rodeur2.life);

    }

    @Test
    void Given_MoreLevel_When_MageUseSpecialAttacks_Then_IncreaseTheGoodLevel() {
        List<Integer> list = rodeur1.SpecialAttack(0, joueur1, joueur2); // arg sans importance
        rodeur1.level = list.get(0);
        assertEquals(10, rodeur1.level);

    }
}