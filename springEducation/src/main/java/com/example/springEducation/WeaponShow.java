package com.example.springEducation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class WeaponShow {
    @Autowired
    @Qualifier("gun")
    private Weapon weapon;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //    public WeaponShow(Weapon weapon){
//        this.weapon = weapon;
//    }
    public WeaponShow(){

    }

    public Weapon getWeapon() {
        return weapon;
    }

    @Autowired
    public void setWeapon(@Qualifier("gun") Weapon weapon) {
        this.weapon = weapon;
    }

    public void show(){
        System.out.println("Name: " + weapon.getClass().getName() + "\n" + "Price: " + weapon.getPrice() + "\n" + "killTime: " + weapon.getKillTime());
    }
    @Override
    public String toString() {
        return "FigureShow { name: " + this.name + " figure: " + weapon.getClass().getName() + " }";
    }
}
