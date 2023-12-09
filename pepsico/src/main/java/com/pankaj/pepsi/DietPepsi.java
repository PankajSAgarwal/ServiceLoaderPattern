package com.pankaj.pepsi;

import com.pankaj.softdrink.SoftDrink;

public class DietPepsi implements SoftDrink {
    private final int size ;

    public DietPepsi(int size) {
        this.size = size;
    }
    public static DietPepsi provider(){
        return new DietPepsi(10);
    }

    @Override
    public String getName() {
        return "Diet Pepsi";
    }

    @Override
    public int getSize() {
        return size;
    }
}
