package characterclasses;

public abstract class Player {

    private String name;
    private int maxHP;
    private int currentHP;
    private int maxMP;
    private int currentMP;
    private int initiative;
    private String characterClass;
    private String quest;
    private boolean questCompleted;
    private String weapon;
    private String mainAttack;
    private String secondaryAttack;
    private int gold;

    public Player(String name, int maxHP, int maxMP, int initiative, String characterClass, String quest) {
        this.name = name;
        this.maxHP = maxHP;
        this.currentHP = maxHP;
        this.maxMP = maxMP;
        this.currentMP = maxMP;
        this.characterClass = characterClass;
        this.quest = quest;
        this.questCompleted = false;
        this.gold = 0;
    }

    public String getName() {
        return this.name;
    }

    public int getMaxHP() {
        return this.maxHP;
    }

    public int getCurrentHP() {
        return this.currentHP;
    }

    public String getClassType() {
        return this.characterClass;
    }

    public int getGold() {
        return this.gold;
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
}
