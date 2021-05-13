package characterclasses.support;

import characterclasses.Player;
import enemies.Enemy;

public class Chanter extends Player {

        public Chanter(String name, int maxHP, int maxMP, int initiative, boolean alive, String characterClass,
                      String quest, String weapon, String mainAttack, int mainAttackDamage, String secondaryAttack1,
                      int secondaryAttackDamage1, String secondaryAttack2, int secondaryAttackDamage2, int gold) {
            super(name, maxHP, maxMP, initiative, alive, characterClass, quest, weapon, mainAttack, mainAttackDamage,
                    secondaryAttack1, secondaryAttackDamage1, secondaryAttack2, secondaryAttackDamage2, gold);
            setName("Siva");
            setMaxHP(250);
            setMaxMP(150);
            setInitiative(50);
            setAlive(true);
            setCharacterClass("Chanter");
            setQuest("Protect!");
            setWeapon("String");
            setMainAttack("Throw");
            setMainAttackDamage(15);
            setSecondaryAttack1("Nature's Blessing");
            setSecondaryAttackDamage1(50);
            setSecondaryAttack2("Healing Rhythms");
            setSecondaryAttackDamage2(150);
            setGold(0);

        }

        public void mainAttack(Enemy enemy){
            System.out.println(getMainAttack());
            enemy.loseHP(getMainAttackDamage());
        }

        public void secondaryAttack1(Enemy enemy){
            System.out.println(getSecondaryAttack1());
            enemy.loseHP(getSecondaryAttackDamage1());
        }

        public void secondaryAttack2(Enemy enemy) {
            System.out.println(getSecondaryAttack2());
            enemy.loseHP(getSecondaryAttackDamage2());
        }
}
