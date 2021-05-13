package rooms;

import characterclasses.Player;
import enemies.MotherFairy;
import enemies.Noble;
import loot.Loot;

import java.util.ArrayList;

public class MonstersDen extends Room{

    private MotherFairy motherFairy1;
    private MotherFairy motherFairy2;
    private Noble noble1;
    private Loot GEMS;

    public MonstersDen(String name, int roomNumber, ArrayList enemies, int loot) {
        super(name, roomNumber, enemies, loot);
        setName("Treasure Room");
        setRoomNumber(1);
        enemies.add(motherFairy1);
        enemies.add(motherFairy2);
        enemies.add(noble1);
        setEnemies(enemies);
//        setDirections();
        setLoot(GEMS.getGoldValue());
    }

    public void roomDefeated(Player player) {
        if (getEnemies().size() <= 0) {
            System.out.println("Victory");
            player.addGold(getLoot());
        }
    }
}

