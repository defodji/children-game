package au.com.servicevic.game;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameExecutionTest {

    @Test
    void testPlayOneChild() {
        assertEquals("Winner: 1", GameExecution.play(1, 3));
    }

    @Test
    void testPlayManyChildren() {
        assertEquals("3 6 1 5 2 8 4 Winner: 7", GameExecution.play(8, 3));
    }

    @Test
    void testPlayManyChildrenByOne() {
        assertEquals("1 2 3 Winner: 4", GameExecution.play(4, 1));
    }
}