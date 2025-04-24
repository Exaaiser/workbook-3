package com.pluralsight;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class SearchInventory {
    public static void main(String[] args) {
       ArrayList<String> musics =  getInventory();
    }
    public static ArrayList<String> getInventory() {
        ArrayList<String> mickGordonMusics = new ArrayList<>();

        mickGordonMusics.add("The New Colossus");
        mickGordonMusics.add("The New Order");
        mickGordonMusics.add("Hellwalker");
        mickGordonMusics.add("Protype");
        mickGordonMusics.add("Rust, Dust& Guts");


        System.out.println(mickGordonMusics.get(4));
        System.out.println(mickGordonMusics);

        return mickGordonMusics;
    }
}
