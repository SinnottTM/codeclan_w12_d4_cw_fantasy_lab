import enemies.Jackalope;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class JackalopeTest {

    Jackalope jackalope1;

    @Before
    public void before() {
        jackalope1 = new Jackalope("The Killer Rabbit of Caerbannog", 20, 10, 7,
                true, "Rabbit/Deer", "Teeth and Fury", "Bite", 25,
                "Nibbles on your garments", 5, 50);
    }

    @Test
    public void enemyHasName() {
        assertNotNull(jackalope1.getName());
    }

    @Test
    public void enemyCanSetName() {
        jackalope1.setName("Sir Hops");
        assertEquals("Sir Hops", jackalope1.getName());
    }

    @Test
    public void enemyHasMaxHP() {
        assertEquals(20, jackalope1.getMaxHP());
    }

    @Test
    public void enemyCanSetMaxHP() {
        jackalope1.setMaxHP(30);
        assertEquals(30, jackalope1.getMaxHP());
    }

    @Test
    public void enemyHasMaxMP() {
        assertEquals(10, jackalope1.getMaxMP());
    }

    @Test
    public void enemyCanSetMaxMP() {
        jackalope1.setMaxMP(20);
        assertEquals(20, jackalope1.getMaxMP());
    }

    @Test
    public void enemyHasInitiative() {
        assertEquals(7, jackalope1.getInitiative());
    }

    @Test
    public void enemyCanSetInitiative() {
        jackalope1.setInitiative(10);
        assertEquals(10, jackalope1.getInitiative());
    }

    @Test
    public void enemyIsAlive() {
        assertEquals(true, jackalope1.isAlive());
    }

    @Test
    public void enemyCanDie() {
        jackalope1.setAlive(false);
        assertEquals(false, jackalope1.isAlive());
    }

    @Test
    public void enemyHasEnemyType() {
        assertEquals("Rabbit/Deer", jackalope1.getEnemyType());
    }

    @Test
    public void enemyCanSetEnemyType() {
        jackalope1.setEnemyType("Furry menace");
        assertEquals("Furry menace", jackalope1.getEnemyType());
    }

    @Test
    public void enemyHasWeapon() {
        assertEquals("Teeth and Fury", jackalope1.getWeapon());
    }

    @Test
    public void enemyCanSetWeapon() {
        jackalope1.setWeapon("Raw fury");
        assertEquals("Raw fury", jackalope1.getWeapon());
    }

    @Test
    public void enemyHasMainAttack() {
        assertEquals("Bite", jackalope1.getMainAttack());
    }

    @Test
    public void enemyCanSetMainAttack() {
        jackalope1.setMainAttack("Knives (Somehow)");
        assertEquals("Knives (Somehow)", jackalope1.getMainAttack());
    }

    @Test
    public void enemyHasMainAttackDamage() {
        assertEquals(25, jackalope1.getMainAttackDamage());
    }

    @Test
    public void enemyCanSetMainAttackDamage() {
        jackalope1.setMainAttackDamage(30);
        assertEquals(30, jackalope1.getMainAttackDamage());
    }

    @Test
    public void enemyHasSecondaryAttack() {
        assertEquals("Nibbles on your garments", jackalope1.getSecondaryAttack());
    }

    @Test
    public void enemyCanSetSecondaryAttack() {
        jackalope1.setSecondaryAttack("An UZI?!");
        assertEquals("An UZI?!", jackalope1.getSecondaryAttack());
    }

    @Test
    public void enemyHasSecondaryAttackDamage() {
        assertEquals(5, jackalope1.getSecondaryAttackDamage());
    }

    @Test
    public void enemyCanSetSecondaryAttackDamage() {
        jackalope1.setSecondaryAttackDamage(10);
        assertEquals(10, jackalope1.getSecondaryAttackDamage());
    }

    @Test
    public void enemyHasGold(){
    assertEquals(50, jackalope1.getGold());
    }

    @Test
    public void enemyCanSetGold(){
        jackalope1.setGold(100);
        assertEquals(100, jackalope1.getGold());
    }
}