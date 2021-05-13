package characterclasses.support;

import characterclasses.Player;
import enemies.Enemy;

public class Necromancer extends Player {

    public Necromancer(String name, int maxHP, int maxMP, int initiative, boolean alive, String characterClass,
                       String quest, String weapon, String mainAttack, int mainAttackDamage, String secondaryAttack1,
                       int secondaryAttackDamage1, String secondaryAttack2, int secondaryAttackDamage2, int gold) {
        super(name, maxHP, maxMP, initiative, alive, characterClass, quest, weapon, mainAttack, mainAttackDamage,
                secondaryAttack1, secondaryAttackDamage1, secondaryAttack2, secondaryAttackDamage2, gold);
        setName("Vladimir");
        setMaxHP(180);
        setMaxMP(250);
        setInitiative(40);
        setAlive(true);
        setCharacterClass("Necromancer");
        setQuest("Drain!");
        setWeapon("String");
        setMainAttack("Push");
        setMainAttackDamage(15);
        setSecondaryAttack1("Transfusion");
        setSecondaryAttackDamage1(50);
        setSecondaryAttack2("Revive");
        setSecondaryAttackDamage2(300);
        setGold(0);

    }

    public void mainAttack(Enemy enemy) {
        System.out.println(getMainAttack());
        enemy.loseHP(getMainAttackDamage());
    }

    public void secondaryAttack1(Enemy enemy) {
        System.out.println(getSecondaryAttack1());
        enemy.loseHP(getSecondaryAttackDamage1());
    }

    public void secondaryAttack2(Enemy enemy) {
        System.out.println(getSecondaryAttack2());
        enemy.loseHP(getSecondaryAttackDamage2());
    }
}








//    Attack: reg attack drain mp from enemy
//    Skill: Drain hp give if below 50% heal himself,   Ressurection brings back with lower hp and attack
//}
