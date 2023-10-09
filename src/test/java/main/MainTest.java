package main;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MainTest {

    Main mt = new Main();

    @Test
    public void testsuma() {
        assertEquals(2.0, mt.suma(1, 1), 0);
    }


    @Test
    public void testsresta() {
        assertEquals(2.0, mt.resta(3, 1), 0);
    }
}
