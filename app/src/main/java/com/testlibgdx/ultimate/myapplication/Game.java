package com.testlibgdx.ultimate.myapplication;

import com.google.android.gms.games.Player;

/**
 * Created by ultimate on 2/19/2015.
 */
public class Game {
    Player P1;
    Map map;

    public Player getP1() {
        return P1;
    }

    public void setP1(Player p1) {
        P1 = p1;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }
}
