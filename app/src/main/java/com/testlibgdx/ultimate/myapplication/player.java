package com.testlibgdx.ultimate.myapplication;

import java.util.Timer;

/**
 * Created by ultimate on 2/19/2015.
 */
public class player {
    String Name;
    int Money;
    Object mObject;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getMoney() {
        return Money;
    }

    public void setMoney(int money) {
        Money = money;
    }

    public Object getmObject() {
        return mObject;
    }

    public void setmObject(Object mObject) {
        this.mObject = mObject;
    }

    public Private getmPrivate() {
        return mPrivate;
    }

    public void setmPrivate(Private mPrivate) {
        this.mPrivate = mPrivate;
    }

    public Timer getmTimer() {
        return mTimer;
    }

    public void setmTimer(Timer mTimer) {
        this.mTimer = mTimer;
    }

    public Game getmGame() {
        return mGame;
    }

    public void setmGame(Game mGame) {
        this.mGame = mGame;
    }

    Private mPrivate;
    Timer mTimer;
    Game mGame;

}
