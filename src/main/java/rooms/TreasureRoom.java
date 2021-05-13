package rooms;

import characterclasses.Player;
import enemies.Enemy;
import enemies.Jackalope;
import enemies.Noble;
import loot.Loot;

import java.util.ArrayList;

public class TreasureRoom extends Room {

    private ArrayList<Enemy> enemies;

    public TreasureRoom(String name, int roomNumber, ArrayList enemies, int loot) {
        super(name, roomNumber, enemies, loot);

        setName("Treasure Room");
        setRoomNumber(2);
        setEnemies(enemies);
        setLoot(100);
    }

    public void roomDefeated(Player player) {
        if (getEnemies().size() <= 0) {
            System.out.println("Victory");
            player.addGold(getLoot());
        }
    }
}
