package com.example.springEducation;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Gun extends Weapon {
    private int bullets, fireRate, recharge, damage;
    private String url;

    public Gun(){
        this.bullets=20;
        this.fireRate=2;
        this.recharge=3;
        this.damage=20;
        this.url = "https://www.air-gun.ru/images/news/4878.jpg";
    }

    public Gun(String name, int bullets, int fireRate, int recharge, int damage, String url){
        this.name = name;
        this.bullets=bullets;
        this.fireRate=fireRate;
        this.recharge=recharge;
        this.damage=damage;
        this.url = url;
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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public int getPrice() {
        return 1000 + bullets * 20 + fireRate * 300 - recharge * 100 + damage * 5;
    }

    @Override
    public float getKillTime() {
        return (float) 100 / damage;
    }

    @Override
    public String getURL() {
        return url;
    }

    @PostConstruct
    public void onInit() {
        System.out.println("Gun initialize");
    }

    @PreDestroy
    public void onDestroy() {
        System.out.println("Gun destroy");
    }
}
