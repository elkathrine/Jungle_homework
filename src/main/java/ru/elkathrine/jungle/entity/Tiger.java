package ru.elkathrine.jungle.entity;

public class Tiger {

    private int health = 100;
    private int energy = 100;

    public void setHealth(int health) {
        this.health = health;
        if (this.health > 100) {
            this.health = 100;
        } else if (this.health < 0) {
            this.health = 0;
        }
    }

    public int getHealth() {
        return this.health;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
        if (this.energy > 100) {
            this.energy = 100;
        } else if (this.energy < 0) {
            this.energy = 0;
        } else if (this.energy < 0) {
            this.health = this.getHealth() - 10;
            this.setHealth(health);
        } else if (this.energy > 0) {
            this.setHealth(health);
        }
    }

    public int getEnergy() {
        return this.energy;
    }

}
