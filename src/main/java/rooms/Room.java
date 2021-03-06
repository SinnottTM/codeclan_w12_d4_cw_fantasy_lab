package rooms;

import enemies.Enemy;
import loot.Loot;

import java.util.ArrayList;

public abstract class Room {

    private String name;
    private int roomNumber;
    private ArrayList<Enemy> enemies;
    private int loot;

    public Room(String name, int roomNumber, ArrayList enemies, int loot){
        this.name = name;
        this.roomNumber = roomNumber;
        this.enemies = new ArrayList<Enemy>(enemies);
        this.loot = loot;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Enemy> getEnemies() {
        return enemies;
    }

    public void setEnemies(ArrayList<Enemy> enemies) {
        this.enemies = enemies;
    }

    public int getLoot() {return loot;}

    public void setLoot(int loot) {this.loot = loot;}

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }
}
