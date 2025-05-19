package com.example.springEducation;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Knife extends Weapon{
    private int price;
    private float killTime;

    public Knife(){
        this.price = 500;
        this.killTime = 3.0f;
    }

    public Knife(String name, int price, float killTime){
        this.name = name;
        this.price = price;
        this.killTime = killTime;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setKillTime(float killTime) {
        this.killTime = killTime;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public float getKillTime() {
        return killTime;
    }
}
