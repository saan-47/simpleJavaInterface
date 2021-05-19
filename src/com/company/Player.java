package com.company;

import java.util.ArrayList;

public class Player implements Methods{
    ArrayList<String> player = new ArrayList<>();
    public int count;

    public Player() {
        player.add("Racer");
        player.add("Hunter");
        player.add("Astronaut");
        player.add("Policeman");
        player.add("Batman");
        count = player.size();
    }

    @Override
    public void addStuff(String n) {
        player.add(n);
    }
}
