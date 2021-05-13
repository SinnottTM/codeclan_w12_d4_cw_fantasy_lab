package rooms;

import java.util.ArrayList;

public class Room {

    private String name;
//    private String location;
    private ArrayList<Direction> directions;
    private ArrayList<Enemies> enemies;
    private ArrayList<Loot> loot;

    public Room(String name, ArrayList enemies, ArrayList loot){
        this.name = name;
//        this.location = location;
        this.directions = new ArrayList<>();
        this.enemies = new ArrayList<Enemies>();
        this.loot = new ArrayList<Loot>();
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    public String getLocation() {
//        return location;
//    }
//
//    public void setLocation(String location) {
//        this.location = location;
//    }

    public ArrayList<Direction> getDirections() {
        return directions;
    }

    public void setDirections(ArrayList<Direction> directions) {
        this.directions = directions;
    }

    public ArrayList<Enemies> getEnemies() {
        return enemies;
    }

    public void setEnemies(ArrayList<Enemies> enemies) {
        this.enemies = enemies;
    }

    public ArrayList<Loot> getLoot() {
        return loot;
    }

    public void setLoot(ArrayList<Loot> loot) {
        this.loot = loot;
    }
}
