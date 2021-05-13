package enemies;

import characterclasses.Player;

public class MotherFairy extends Enemy {

    public MotherFairy(String name, int maxHP, int maxMP, int initiative, boolean alive, String enemyType,
                 String weapon, String mainAttack, int mainAttackDamage, String secondaryAttack,
                 int secondaryAttackDamage, int gold) {

        super(name, maxHP, maxMP,initiative, alive, enemyType, weapon, mainAttack, mainAttackDamage,
                secondaryAttack, secondaryAttackDamage, gold);

        setName("Violet");
        setMaxHP(30);
        setMaxMP(30);
        setInitiative(10);
        setAlive(true);
        setEnemyType("Fairy");
        setWeapon("Wand");
        setMainAttack("Stupify");
        setMainAttackDamage(20);
        setSecondaryAttack("Fairy Dust Tornado");
        setSecondaryAttackDamage(15);
        setGold(200);
    }

    public void mainAttack(Player player) {
        System.out.println(getMainAttack());
        player.loseHP(getMainAttackDamage());
    }

    public void secondaryAttack(Player player) {
        System.out.println(getSecondaryAttack());
        player.loseHP(getSecondaryAttackDamage());
    }
}
