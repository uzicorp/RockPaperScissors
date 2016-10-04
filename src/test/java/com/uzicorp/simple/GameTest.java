package com.uzicorp.simple;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by usman on 23/09/16.
 */
public class GameTest {

    Game game;

    @Before
    public void setUp() throws Exception {
        game = new Game();
    }

    @Test
    public void testThatRockBeatsScissors() throws Exception {

        Item winner = game.playGame(Item.Rock, Item.Scissors);
        assertEquals("The winning item should be a Rock", Item.Rock, winner);
    }

    @Test
    public void testThatRockLosesAgainstPaper() throws Exception {

        Item winner = game.playGame(Item.Rock, Item.Paper);
        assertEquals("The winning item should be Paper", Item.Paper, winner);
    }

    @Test
    public void testThatPaperBeatsRock() throws Exception {

        Item winner = game.playGame(Item.Paper, Item.Rock);
        assertEquals("The winning item should be Paper", Item.Paper, winner);
    }

    @Test
    public void testDrawCase() throws Exception {

        Item winner = game.playGame(Item.Rock, Item.Rock);
        assertEquals("The winning item should be Rock", Item.Rock, winner);
    }

    @Test
    public void testThatHammerBeatsRockAndScissors() throws Exception {

        Item winner = game.playGame(Item.Hammer, Item.Rock);
        assertEquals("The winning item should be Hammer", Item.Hammer, winner);

        winner = game.playGame(Item.Hammer, Item.Scissors);
        assertEquals("The winning item should be Hammer", Item.Hammer, winner);

        winner = game.playGame(Item.Hammer, Item.Paper);
        assertEquals("The winning item should be Paper", Item.Paper, winner);
    }
}