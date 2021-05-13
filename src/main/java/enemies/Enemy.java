package enemies;

public abstract class Enemy {

    private String name;
    private int maxHP;
    private int currentHP;
    private int maxMP;
    private int currentMP;
    private String weapon;
    private String mainAttack;
    private String secondaryAttack;
    private int gold;

    public Enemy(String name, int maxHP, String weapon){
        this.name = name;
        this.maxHP = maxHP;
        this.weapon = sword;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Sword getSword(){
        return this.sword;
    }


//   Method Can take damage


}
