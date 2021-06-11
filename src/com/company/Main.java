package com.company;

public class Main {

    public static void main(String[] args) {

        Boss boss = new Boss();
        boss.setName(" Tor ");
        boss.setHealth(500);
        boss.setDamage(100);
        boss.setSuperDefenctype(25);
        boss.setAtackLightning(110);
        System.out.println(boss.getName() + " " + boss.getHealth() + " " + boss.getDamage()+ " "
        + boss.getAtackLightning()+ " " + boss.getSuperDefenctype());

        Warrior warrior = new Warrior();
        warrior.setName("Tank");
        warrior.setHealth(600);
        warrior.setDamage(150);
        warrior.setAttackBolt(120);
        System.out.println(warrior.getName() + " " + warrior.getHealth()+ " " + warrior.getDamage()+ " "
        + warrior.getAttackBolt());

        Magical magical = new Magical();
        magical.setName("Rubik");
        magical.setHealth(500);
        magical.setDamage(50);
        magical.setAtackMagic(20);
        System.out.println(magical.getName() + " " + magical.getHealth() + " " + magical.getDamage()+ " "
        + magical.getAtackMagic());

        Mental mental = new Mental();
        mental.setName("Newer");
        mental.setHealth(550);
        mental.setDamage(60);
        mental.setSuperHeals(200);
        System.out.println(mental.getName() + " " + mental.getHealth() + " " + mental.getDamage()+ " "
        + mental.getSuperHeals());




    }
}
