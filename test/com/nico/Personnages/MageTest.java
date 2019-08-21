package com.nico.Personnages;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MageTest {
    Mage mage1 = new Mage(10,1,2,20);
    Mage mage2 = new Mage(10,1,2,20);
    String joueur1 = "Joueur1";
    String joueur2 = "Joueur2";

    @Test
    void Given_LessPv_When_MageAttacks_ThenReturnGoodPv() {
        mage2.life = mage1.basicAttack(mage2.life, joueur1, joueur2);
        assertEquals(30, mage2.life);

    }

    @Test
    void Given_NoMorePv_whenMageUseSpecialAttacks_Then_ReturnCorrectPv() {
        List<Integer> list = mage1.SpecialAttack(0, joueur1, joueur2);
        assertEquals(50, mage1.life);
    }

    @Test
    void Given_MorePv_whenMageUseSpecialAttacks_Then_ReturnCorrectPv(){
        mage1.life = mage2.basicAttack(mage1.life, joueur1, joueur2);
        mage1.life = mage2.basicAttack(mage1.life, joueur1, joueur2);
        List<Integer> list = mage1.SpecialAttack(0, joueur1, joueur2);
        assertEquals(50, mage1.life);


    }

}