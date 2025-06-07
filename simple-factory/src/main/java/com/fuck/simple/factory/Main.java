package com.fuck.simple.factory;

public class Main {
    public static void main(String[] args) {
        /**
         * 对于客户端来说 生产细节我不关心 我向工厂索要即可
         * 工厂模式达到了->职责分离 客户端不需要关心产品生产细节
         * 客户端只负责消费 工厂端负责生产 职责分离 ->简单工厂模式的作用
         */
        Weapon tank = WeaponFactory.get("TANK");
        tank.fright();
        Weapon ak47 = WeaponFactory.get("AK47");
        ak47.fright();
    }
}
