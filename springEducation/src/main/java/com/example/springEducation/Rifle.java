package com.example.springEducation;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Rifle extends Weapon{
    private int bullets, fireRate, recharge, damage;

    public Rifle(){
        this.bullets=30;
        this.fireRate=4;
        this.recharge=3;
        this.damage=95;
    }

    public Rifle(String name, int bullets, int fireRate, int recharge, int damage){
        this.name=name;
        this.bullets=bullets;
        this.fireRate=fireRate;
        this.recharge=recharge;
        this.damage=damage;
    }

    public int getBullets() {
        return bullets;
    }

    public void setBullets(int bullets) {
        this.bullets = bullets;
    }

    public int getFireRate() {
        return fireRate;
    }

    public void setFireRate(int fireRate) {
        this.fireRate = fireRate;
    }

    public int getRecharge() {
        return recharge;
    }

    public void setRecharge(int recharge) {
        this.recharge = recharge;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    @Override
    public int getPrice() {
        return 1000 + bullets * 20 + fireRate * 300 - recharge * 100 + damage * 5;
    }

    @Override
    public float getKillTime() {
        return (float) 100 / damage;
    }
}
