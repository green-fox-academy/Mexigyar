package com.greenfox.resttest.Model;

public class Yondu {

    int distance;
    int time;
    int speed;

    public Yondu(int distance, int time) {
        this.distance = distance;
        this.time = time;
        this.speed = distance / time;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getDistance() {
        return distance;
    }

    public int getTime() {
        return time;
    }

    public int getSpeed() {
        return speed;
    }
}
