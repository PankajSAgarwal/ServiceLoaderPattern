package com.pankaj.coke;

import com.pankaj.softdrink.SoftDrink;

public class DietCoke implements SoftDrink {
    @Override
    public String getName() {
        return "DietCoke";
    }

    @Override
    public int getSize() {
        return 12;
    }
}
