package com.company;

import java.util.ArrayList;

public class Weapons implements Methods{
    ArrayList<String> weapons = new ArrayList<String>();
    public int count;
    public Weapons() {
        weapons.add("Knife");
        weapons.add("Sword");
        weapons.add("Exe-Bow");
        weapons.add("Pistol");
        weapons.add("Machine gun");
        weapons.add("Spear");
        count = weapons.size();
    }

    @Override
    public void addStuff(String n) {
        weapons.add(n);
    }
}
