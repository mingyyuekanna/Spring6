package com.fuck.simple.factory;

public class WeaponFactory {
    /**
     * 静态方法 想要获取什么武器 就看你传递什么参数 传tank获取坦克...
     * 简单工厂模式中有一个静态方法 故称之为 静态工厂方法模式
     * @param weaponType
     * @return
     */
    public static Weapon get(String weaponType){
        if("TANK".equals(weaponType)){
            return new TANK();
        } else if ("AK47".equals(weaponType)) {
            return new AK47();
        } else if ("Dagger".equals(weaponType)) {
            return new Dagger();
        }else {
            throw new RuntimeException("暂时无法生产此武器");
        }
    }
}
