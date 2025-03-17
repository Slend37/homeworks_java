package com.example.springEducation;

public class WeaponShow {
    private Weapon weapon;

    public WeaponShow(Weapon weapon){
        this.weapon = weapon;
    }

    public void show(){
        System.out.println("Name: " + weapon.getClass().getName() + "\n" + "Price: " + weapon.getPrice() + "\n" + "killTime: " + weapon.getKillTime());
    }
}
