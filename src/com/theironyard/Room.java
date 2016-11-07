package com.theironyard;

/**
 * Created by VeryBarry on 11/7/16.
 */
public class Room {

    int row;
    int col;
    boolean wasVisted = false;
    boolean hasRight = true;
    boolean hasBottom = true;

    public Room(int row, int col) {
        this.row = row;
        this.col = col;
    }
}
