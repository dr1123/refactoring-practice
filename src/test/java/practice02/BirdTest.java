package practice02;

import org.junit.Test;

import static org.junit.Assert.*;

public class BirdTest {

    @Test
    public void getSpeed() {
        Bird europeanBird = new European();
        assertEquals(60, europeanBird.getSpeed(), 0.0);

        Bird africanBird = new African();
        africanBird.setFactor(1.5);
        assertEquals(60 * 1.5, africanBird.getSpeed(), 0.0);

        Bird norwegianBird = new NorwegianBlue();
        norwegianBird.setFactor(1.3);
        assertEquals(60 * 1.3 * 1.3, norwegianBird.getSpeed(), 0.0);
    }
}
