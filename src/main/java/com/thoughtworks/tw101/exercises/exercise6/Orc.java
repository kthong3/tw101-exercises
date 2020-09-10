package com.thoughtworks.tw101.exercises.exercise6;

public class Orc implements Monster {
    private int damageHits;
    private int hitPoints;

    public Orc() {
        this.damageHits = 0;
        this.hitPoints = 20;
    }

    @Override
    public void takeDamage(int amount){
        this.damageHits += amount;
    }

    @Override
    public void reportStatus(){
        System.out.println("Orc damage points: " + this.damageHits);
        System.out.println("Orc hit points: " + this.hitPoints);
    }
}
