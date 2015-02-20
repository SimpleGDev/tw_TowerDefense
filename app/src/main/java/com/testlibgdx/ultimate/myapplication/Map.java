package com.testlibgdx.ultimate.myapplication;

/**
 * Created by ultimate on 2/19/2015.
 */
public class Map {
    public boolean isPossible() {
        return possible;
    }

    public void setPossible(boolean possible) {
        this.possible = possible;
    }

    public int getLevel() {
        return Level;
    }

    public void setLevel(int level) {
        Level = level;
    }

    boolean possible;
    int Level;
}
