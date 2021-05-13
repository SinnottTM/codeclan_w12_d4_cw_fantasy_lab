package enemies;

import characterclasses.Player;

public class Noble extends Enemy{

    public Noble(String name, int maxHP, int maxMP, int initiative, boolean alive, String enemyType,
                 String weapon, String mainAttack, int mainAttackDamage, String secondaryAttack,
                 int secondaryAttackDamage, int gold) {

        super(name, maxHP, maxMP,initiative, alive, enemyType, weapon, mainAttack, mainAttackDamage,
                secondaryAttack, secondaryAttackDamage, gold);

        setName("Sir Fiddlesticks");
        setMaxHP(50);
        setMaxMP(10);
        setInitiative(5);
        setAlive(true);
        setEnemyType("Lord");
        setWeapon("Fine sword");
        setMainAttack("Thrust");
        setMainAttackDamage(10);
        setSecondaryAttack("Demands you leave");
        setSecondaryAttackDamage(0);
        setGold(300);
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
