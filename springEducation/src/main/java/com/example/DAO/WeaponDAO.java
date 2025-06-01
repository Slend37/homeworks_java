package com.example.DAO;

import com.example.springEducation.Weapon;
import com.example.springEducation.Gun;
import com.example.springEducation.Rifle;
import com.example.springEducation.Knife;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class WeaponDAO {
    private static int COUNT_WEAPON;
    public List<Weapon> weapons;
    public WeaponDAO()
    {
        COUNT_WEAPON = 0;
        weapons = new ArrayList<>();

        weapons.add(new Gun("testGun", 20, 2, 3, 20, "https://www.air-gun.ru/images/news/4878.jpg"));
        COUNT_WEAPON++;
        weapons.add(new Rifle("testRifle", 30, 4, 3, 95, "https://cs10.pikabu.ru/post_img/2018/01/13/5/og_og_1515824852237999239.jpg"));
        COUNT_WEAPON++;
        weapons.add(new Knife("testKnife", 500, 3.0f, "https://i.pinimg.com/736x/a1/c7/e3/a1c7e3ca4646efee93c76bd4d141329b.jpg"));
        COUNT_WEAPON++;
    }

    public List<Weapon> index(){
        return weapons;
    }

    public Weapon show(String name)
    {
        return weapons.stream()
                .filter(weapon -> weapon.getName().equals(name))
                .findAny()
                .orElse(null);
    }

    public void save(Weapon weapon)
    {
        weapons.add(weapon);
        COUNT_WEAPON++;
    }

    public Weapon getObject(String name)
    {
        for (Weapon weapon : weapons)
        {
            if (weapon.getName().equals(name))
                return weapon;
        }
        return null;
    }

    public int getIndex(Weapon weapon)
    {
        for (int i = 0; i < weapons.size(); i++)
        {
            if (weapons.get(i).getName().equals(weapon.getName()))
                return i;
        }
        return -1;
    }

    public List<Weapon> sortPrice(){
        List<Weapon> sorted;
        sorted = new ArrayList<>();
        for (Weapon weapon : weapons) {
            if (sorted.isEmpty()) {
                sorted.add(weapon);
            } else {
                int last_sorted_size = sorted.size();
                for (int j = 0; j < sorted.size(); j++) {
                    if (weapon.getPrice() > sorted.get(j).getPrice()) {
                        sorted.add(j, weapon);
                        break;
                    }
                }
                if (last_sorted_size == sorted.size()){
                    sorted.add(weapon);
                }
            }
        }
        return sorted;
    }

    public List<Weapon> sortKillTime(){
        List<Weapon> sorted2;
        sorted2 = new ArrayList<>();
        for (Weapon weapon : weapons) {
            if (sorted2.isEmpty()) {
                sorted2.add(weapon);
            } else {
                int last_sorted_size = sorted2.size();
                for (int j = 0; j < sorted2.size(); j++) {
                    if (weapon.getKillTime() > sorted2.get(j).getKillTime()) {
                        sorted2.add(j, weapon);
                        break;
                    }
                }
                if (last_sorted_size == sorted2.size()){
                    sorted2.add(weapon);
                }
            }
        }
        return sorted2;
    }

    public void remove(Weapon weapon)
    {
        weapons.remove(weapon);
        COUNT_WEAPON--;
    }

    public void update(Weapon oldWeapon, Weapon newWeapon)
    {
        if (this.getIndex(oldWeapon) != -1)
            weapons.set(this.getIndex(oldWeapon), newWeapon);
    }
}