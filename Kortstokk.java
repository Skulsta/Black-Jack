package com.example.android.myapplication;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Skulstad on 08.08.2016.
 */
public class Kortstokk {

    private ArrayList<Integer> kortstokk = new ArrayList<Integer>();

    /**
     * Constructor for objects of class Kortstokk
     */
    public Kortstokk() {
        ArrayList<Integer> kortstokk = new ArrayList<Integer>();
    }

    @Override
    public String toString() {
        return "Kortstokk: " + kortstokk;
    }

    public void addCard() {

        int i;
        for (i = 0; i < 52; i++) {
            i = i;
            kortstokk.add(i);
        }
    }

    public void shuffle() {
        Collections.shuffle(kortstokk);
    }

    public void visInfo() {
        for (int i : kortstokk) {
            System.out.println(i);
        }
    }

    public int trekkKort() {
        int k1 = kortstokk.get(0);
        return k1;
    }

    public void fjernKort() {
        kortstokk.remove(0);
    }
}
