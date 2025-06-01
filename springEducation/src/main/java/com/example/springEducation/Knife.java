package com.example.springEducation;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Knife extends Weapon{
    private int price;
    private float killTime;
    private String url;

    public Knife(){
        this.price = 500;
        this.killTime = 3.0f;
        this.url = "https://i.pinimg.com/736x/a1/c7/e3/a1c7e3ca4646efee93c76bd4d141329b.jpg";
    }

    public Knife(String name, int price, float killTime, String url){
        this.name = name;
        this.price = price;
        this.killTime = killTime;
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
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

    @Override
    public String getURL() {
        return url;
    }
}
