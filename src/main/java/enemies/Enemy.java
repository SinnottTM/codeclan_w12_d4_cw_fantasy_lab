package enemies;

public abstract class Enemy {

    private String name;
    private int maxHP;
    private int currentHP;
    private int maxMP;
    private int currentMP;
    private int initiative;
    private boolean alive;
    private String enemyType;
    private String weapon;
    private String mainAttack;
    private int mainAttackDamage;
    private String secondaryAttack;
    private int secondaryAttackDamage;
    private int gold;

    public Enemy(String name, int maxHP, int maxMP, int initiative, boolean alive, String enemyType,
                  String weapon, String mainAttack, int mainAttackDamage, String secondaryAttack,
                 int secondaryAttackDamage, int gold) {

        this.name = name;
        this.maxHP = maxHP;
        this.currentHP = maxHP;
        this.maxMP = maxMP;
        this.currentMP = maxMP;
        this.initiative = initiative;
        this.alive = alive;
        this.enemyType = enemyType;
        this.weapon = weapon;
        this.mainAttack = mainAttack;
        this.mainAttackDamage = mainAttackDamage;
        this.secondaryAttack = secondaryAttack;
        this.secondaryAttackDamage = secondaryAttackDamage;
        this.gold = gold;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxHP() {
        return maxHP;
    }

    public void setMaxHP(int maxHP) {
        this.maxHP = maxHP;
    }

    public int getMaxMP() {
        return maxMP;
    }

    public void setMaxMP(int maxMP) {
        this.maxMP = maxMP;
    }

    public int getInitiative() {
        return initiative;
    }

    public void setInitiative(int initiative) {
        this.initiative = initiative;
    }

    public String getEnemyType() {
        return enemyType;
    }

    public void setEnemyType(String enemyType) {
        this.enemyType = enemyType;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public String getMainAttack() {
        return mainAttack;
    }

    public void setMainAttack(String mainAttack) {
        this.mainAttack = mainAttack;
    }

    public String getSecondaryAttack() {
        return secondaryAttack;
    }

    public void setSecondaryAttack(String secondaryAttack) {
        this.secondaryAttack = secondaryAttack;
    }

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    public void loseHP(int damage) {
        this.currentHP -= damage;
    }

    public void gainHP(int heal) {
        if(heal + this.currentHP < this.maxHP) {
            this.currentHP += heal;
        }
        else {
            this.currentHP = this.maxHP;
        }
    }

    public void death(){
        if (currentHP <= 0){
            this.initiative = 0;
            this.currentHP = 0;
            this.alive = false;
        }
    }

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    public int getCurrentMP() {
        return currentMP;
    }

    public void setCurrentMP(int currentMP) {
        this.currentMP = currentMP;
    }

    public int getMainAttackDamage() {
        return mainAttackDamage;
    }

    public void setMainAttackDamage(int mainAttackDamage) {
        this.mainAttackDamage = mainAttackDamage;
    }

    public int getSecondaryAttackDamage() {
        return secondaryAttackDamage;
    }

    public void setSecondaryAttackDamage(int secondaryAttackDamage) {
        this.secondaryAttackDamage = secondaryAttackDamage;
    }
}
