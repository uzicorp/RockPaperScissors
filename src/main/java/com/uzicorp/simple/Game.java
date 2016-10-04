package com.uzicorp.simple;

import org.apache.commons.lang3.ArrayUtils;

/**
 * Created by usman on 23/09/16.
 */
public class Game {

    public Game() {
    }

    /**
     * Data structure that represents a game. Two items are presented and the Item returned is the winner between them
     *
     * @param item1 Item first presented to the game
     * @param item2 Item second presented to the game
     * @return Item that wins between the two
     */
    public Item playGame(Item item1, Item item2) {

        return beats(item2, item1) ? item2 : item1;
    }

    public boolean beats(Item item1, Item item2) {

        return ArrayUtils.contains(item1.getBeats(), item2.toString());
    }
}
