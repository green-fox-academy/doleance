import org.junit.Test;

import static org.junit.Assert.*;

public class AnimalTest {

    Animal animal = new Animal();

    @Test
    public void hungerMinusOne() {
        animal.hunger = 51;
        animal.eat();
        assertEquals(50, animal.hunger);
    }

    @Test
    public void hungerCantBeNegative() {
        animal.hunger = 0;
        animal.eat();
        assertEquals(0, animal.hunger);
    }

    @Test
    public void thirstMinusOne() {
        animal.thirst = 51;
        animal.drink();
        assertEquals(50, animal.thirst);
    }

    @Test
    public void thirstCantBeNegative() {
        animal.thirst = 0;
        animal.drink();
        assertEquals(0, animal.thirst);
    }

    @Test
    public void play() {
        animal.hunger = 49;
        animal.thirst = 49;
        animal.play();
        assertEquals(50, animal.hunger);
        assertEquals(50, animal.thirst);
    }
}