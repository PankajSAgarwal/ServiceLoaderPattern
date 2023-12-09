package com.pankaj.pepsi;

import com.pankaj.softdrink.SoftDrink;

public class Pepsi implements SoftDrink {


    @Override
    public String getName() {
        return "pepsi";
    }

    @Override
    public int getSize() {
        return 12;
    }
}
