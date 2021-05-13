package rooms;

import characterclasses.Player;
import enemies.Enemy;
import enemies.Jackalope;
import enemies.Noble;
import loot.Loot;

import java.util.ArrayList;

public class TreasureRoom extends Room {

    private Noble noble1;
    private Noble noble2;
    private Jackalope jackalope1;
    private Loot CROWN;

    public TreasureRoom(String name, int roomNumber, ArrayList enemies, ArrayList directions, int loot) {
        super(name, roomNumber, enemies, directions, loot);
        setName("Treasure Room");
        setRoomNumber(2);
        enemies.add(noble1);
        enemies.add(noble2);
        enemies.add(jackalope1);
        setEnemies(enemies);
//        setDirections();
        setLoot(CROWN.getGoldValue());
    }

    public void roomDefeated(Player player) {
        if (getEnemies().size() <= 0) {
            System.out.println("Victory");
            player.addGold(getLoot());
        }
    }
}
