import enemies.Enemy;
import enemies.Jackalope;
import org.junit.Before;
import org.junit.Test;
import rooms.TreasureRoom;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class TreasureRoomTest {

    TreasureRoom treasureRoom1;
    Jackalope jackalope1;
    Jackalope jackalope2;
    ArrayList<Enemy> enemies;

    @Before
    public void before() {

        jackalope1 = new Jackalope("The Killer Rabbit of Caerbannog", 20, 10, 7,
                true, "Rabbit/Deer", "Teeth and Fury", "Bite", 25,
                "Nibbles on your garments", 5, 50);

        jackalope2 = new Jackalope("The Killer Rabbit of Caerbannog", 20, 10, 7,
                true, "Rabbit/Deer", "Teeth and Fury", "Bite", 25,
                "Nibbles on your garments", 5, 50);

        enemies = new ArrayList<>(enemies);
        enemies.add(jackalope1);
        enemies.add(jackalope2);

        treasureRoom1 = new TreasureRoom("Treasure Room", 2, enemies, 1000);
    }

//    @Test
//    public void roomHasName() {
//        assertNotNull(treasureRoom1.getName());}

//    @Test
//    public void roomCanSetName() {
//        treasureRoom1.setName("Vault");
//        assertEquals("Vault", treasureRoom1.getName());}

//    @Test
//    public void roomHasRoomNumber() {
//        assertEquals(1, treasureRoom1.getRoomNumber());}
//
//    @Test
//    public void roomCanSetRoomNumber() {
//        treasureRoom1.setRoomNumber(2);
//        assertEquals(2, treasureRoom1.getRoomNumber());}
//
//    @Test
//    public void roomHasEnemies(){
//        assertEquals(2, enemies.size());}
//
//    @Test
//    public void roomCanSetEnemies(){
//        treasureRoom1.setEnemies(null);
//        assertEquals(0, enemies.size());}
//
//    @Test
//    public void roomHasLoot(){
//        assertEquals(100, treasureRoom1.getLoot());}

//    @Test
//    public void roomCanSetLoot(){
//        treasureRoom1.setLoot(2000);
//        assertEquals(2000, treasureRoom1.getLoot());}

}
