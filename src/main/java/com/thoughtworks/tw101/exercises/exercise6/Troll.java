package com.thoughtworks.tw101.exercises.exercise6;

public class Troll implements Monster {
    private int damageHits;
    private int hitPoints;

    public Troll() {
        this.damageHits = 0;
        this.hitPoints = 40;
    }

    @Override
    public void takeDamage(int amount) {
        this.damageHits += amount/2;
    }

    @Override
    public void reportStatus() {
        System.out.println("Troll damage points: " + this.damageHits);
        System.out.println("Troll hit points: " + this.hitPoints);
    }
}
