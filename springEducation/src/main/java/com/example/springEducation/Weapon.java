package com.example.springEducation;

public abstract class Weapon {
    protected String name;
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public abstract int getPrice();
    public abstract float getKillTime();
    public abstract String getURL();
}
