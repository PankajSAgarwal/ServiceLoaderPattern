package com.pankaj.coke;

import com.pankaj.softdrink.SoftDrink;

public class Coke implements SoftDrink {
    public Coke() {
        System.out.println("created ..." + this);
    }

    public String getName(){
        return "coke";
    }
    public int getSize(){
        return 12;
    }
}
