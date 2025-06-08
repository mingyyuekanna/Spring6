package com.fuck.Go.Factory;

import com.fuck.Go.Weapon.AK47;
import com.fuck.Go.Weapon.Weapon;

public class AKFactory extends WeaponFactory{

    @Override
    public Weapon get() {
        return new AK47();
    }
}
