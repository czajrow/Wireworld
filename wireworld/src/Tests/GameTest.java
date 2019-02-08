package Tests;

import org.junit.Before;
import org.junit.Test;
import wireworld.Game;
import wireworld.Matrix;

import static org.junit.Assert.*;

public class GameTest {
    private Game game;

    @Before
    public void setUp() throws Exception {
        game = new Game();
    }

    @Test
    public void setRun() { // And IsRun()
        game.setRun(true);
        assertEquals(game.isRun(), true);
        game.setRun(false);
        assertEquals(game.isRun(), false);
        game.setRun(true);
        assertEquals(game.isRun(), true);
    }
}