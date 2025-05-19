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

        weapons.add(new Gun("testGun", 20, 2, 3, 20));
        COUNT_WEAPON++;
        weapons.add(new Rifle("testRifle", 30, 4, 3, 95));
        COUNT_WEAPON++;
        weapons.add(new Knife("testKnife", 500, 3.0f));
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