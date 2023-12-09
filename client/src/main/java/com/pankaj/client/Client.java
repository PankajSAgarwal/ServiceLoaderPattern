package com.pankaj.client;
import com.pankaj.softdrink.SoftDrink;

import java.util.ServiceLoader;

public class Client {
    public static void main(String[] args) {
        System.out.println("Let's look for softdrinks : ");
        var softDrinks = ServiceLoader.load(SoftDrink.class);
        System.out.println("got the softdrinks...");
        softDrinks.stream()
                .map(ServiceLoader.Provider::get)
                .map(softDrink -> softDrink.getName() + " : " + softDrink.getSize())
                .forEach(System.out::println);
        /*for(var softDrink:softDrinks){
            System.out.println(softDrink.getName() + ": " + softDrink.getSize());
        }*/

        System.out.println("--------- reload and reiterate --------");
        softDrinks.reload(); // create objects again instead of fetching from cache
        for(var softDrink:softDrinks){
            System.out.println(softDrink.getName() + ": " + softDrink.getSize());
        }
    }

}
