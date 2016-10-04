package com.uzicorp.simple;

/**
 * Created by usman on 23/09/16.
 */
public enum Item {

    Rock("Scissors"),
    Paper("Rock", "Hammer"),
    Scissors("Paper"),
    Hammer("Rock", "Scissors");

    private String[] beats = null;

    Item(String... beats) {
        this.beats = beats;
    }

    public String[] getBeats() {
        return beats;
    }
}
