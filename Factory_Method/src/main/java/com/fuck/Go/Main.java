package com.fuck.Go;

import com.fuck.Go.Factory.AKFactory;
import com.fuck.Go.Factory.TankFactory;
import com.fuck.Go.Factory.WeaponFactory;
import com.fuck.Go.Weapon.Tank;
import com.fuck.Go.Weapon.Weapon;

public class Main {
    public static void main(String[] args) {
        WeaponFactory weaponFactory =new AKFactory();
        Weapon weapon = weaponFactory.get();
        weapon.attack();


    }
}