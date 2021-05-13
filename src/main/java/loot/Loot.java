package loot;

public enum Loot {

    EMPTY (0),
    COINS (250),
    GEMS (500),
    CROWN (1000);

    private final int goldValue;

    Loot(int goldValue){
        this.goldValue = goldValue;
    }

    public int getGoldValue() {
        return goldValue;
    }
}
