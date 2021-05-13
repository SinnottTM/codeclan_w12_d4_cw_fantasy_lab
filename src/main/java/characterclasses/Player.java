package characterclasses;

public abstract class Player {

    private String name;
    private int maxHP;
    private int currentHP;
    private int maxMP;
    private int currentMP;
    private int initiative;
    private boolean alive;
    private String characterClass;
    private String quest;
    private boolean questCompleted;
    private String weapon;
    private String mainAttack;
    private int mainAttackDamage;
    private String secondaryAttack1;
    private int secondaryAttackDamage1;
    private String secondaryAttack2;
    private int secondaryAttackDamage2;
    private int gold;

    public Player(String name, int maxHP, int maxMP, int initiative, boolean alive, String characterClass,
                  String quest, String weapon,String mainAttack, int mainAttackDamage, String secondaryAttack1,
                  int secondaryAttackDamage1, String secondaryAttack2, int secondaryAttackDamage2, int gold) {

        this.name = name;
        this.maxHP = maxHP;
        this.currentHP = maxHP;
        this.maxMP = maxMP;
        this.currentMP = maxMP;
        this.initiative = initiative;
        this.alive = true;
        this.characterClass = characterClass;
        this.quest = quest;
        this.questCompleted = false;
        this.weapon = weapon;
        this.mainAttack = mainAttack;
        this.mainAttackDamage = mainAttackDamage;
        this.secondaryAttack1 = secondaryAttack1;
        this.secondaryAttackDamage1 = secondaryAttackDamage1;
        this.secondaryAttack2 = secondaryAttack2;
        this.secondaryAttackDamage2 = secondaryAttackDamage2;
        this.gold = 0;
    }

    public void setQuest(String newQuest){
        this.quest = newQuest;
    }

    public void completedQuest(){
        this.questCompleted = true;
    }

    public void addGold(int gold) {
        this.gold += gold;
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

    public int getMaxMP() {
        return maxMP;
    }

    public void setMaxMP(int maxMP) {
        this.maxMP = maxMP;
    }

    public int getCurrentMP() {
        return currentMP;
    }

    public void setMaxHP(int maxHP){
        this.maxHP = maxHP;
    }

    public void setCurrentMP(int currentMP) {
        this.currentMP = currentMP;
    }

    public int getInitiative() {
        return initiative;
    }

    public void setInitiative(int initiative) {
        this.initiative = initiative;
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

    public String getSecondaryAttack1() {
        return secondaryAttack1;
    }

    public void setSecondaryAttack1(String secondaryAttack1) {
        this.secondaryAttack1 = secondaryAttack1;
    }

    public String getSecondaryAttack2() {
        return secondaryAttack2;
    }

    public void setSecondaryAttack2(String secondaryAttack2) {
        this.secondaryAttack2 = secondaryAttack2;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCharacterClass() {
        return characterClass;
    }

    public void setCharacterClass(String characterClass) {
        this.characterClass = characterClass;
    }

    public String getQuest() {
        return quest;
    }

    public boolean isQuestCompleted() {
        return questCompleted;
    }

    public void setQuestCompleted(boolean questCompleted) {
        this.questCompleted = questCompleted;
    }

    public int getMainAttackDamage() {
        return mainAttackDamage;
    }

    public void setMainAttackDamage(int mainAttackDamage) {
        this.mainAttackDamage = mainAttackDamage;
    }

    public int getSecondaryAttackDamage1() {
        return secondaryAttackDamage1;
    }

    public void setSecondaryAttackDamage1(int secondaryAttackDamage1) {
        this.secondaryAttackDamage1 = secondaryAttackDamage1;
    }

    public int getSecondaryAttackDamage2() {
        return secondaryAttackDamage2;
    }

    public void setSecondaryAttackDamage2(int secondaryAttackDamage2) {
        this.secondaryAttackDamage2 = secondaryAttackDamage2;
    }

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }
}
