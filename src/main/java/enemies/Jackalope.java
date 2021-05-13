package enemies;

import characterclasses.Player;

public class Jackalope extends Enemy{

    public Jackalope(String name, int maxHP, int maxMP, int initiative, boolean alive, String enemyType,
                 String weapon, String mainAttack, int mainAttackDamage, String secondaryAttack,
                 int secondaryAttackDamage, int gold) {

        super(name, maxHP, maxMP,initiative, alive, enemyType, weapon, mainAttack, mainAttackDamage,
                secondaryAttack, secondaryAttackDamage, gold);

        setName("The Killer Rabbit of Caerbannog");
        setMaxHP(20);
        setMaxMP(10);
        setInitiative(7);
        setAlive(true);
        setEnemyType("Rabbit/Deer");
        setWeapon("Teeth and Fury");
        setMainAttack("Bite");
        setMainAttackDamage(25);
        setSecondaryAttack("Nibbles on your garments");
        setSecondaryAttackDamage(5);
        setGold(50);
    }

    public void mainAttack(Player player){
        System.out.println(getMainAttack());
        player.loseHP(getMainAttackDamage());
    }

    public void secondaryAttack(Player player){
        System.out.println(getSecondaryAttack());
        player.loseHP(getSecondaryAttackDamage());
    }
}
