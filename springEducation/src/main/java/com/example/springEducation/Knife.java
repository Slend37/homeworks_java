package com.example.springEducation;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component ("knife")
@Scope("prototype")
public class Knife implements Weapon{
    @Override
    public int getPrice() {
        return 500;
    }

    @Override
    public float getKillTime() {
        return 3.0f;
    }
}
