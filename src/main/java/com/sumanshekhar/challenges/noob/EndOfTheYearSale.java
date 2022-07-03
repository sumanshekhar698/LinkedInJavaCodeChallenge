package com.sumanshekhar.challenges.noob;

import java.util.List;
import java.util.Optional;

/*
 It's the end-of-year sale and items in the store are marked off at varying rates.
 Each store item has a name, retail price and discount.
 As a part of this challenge, you'll model the store item objects using Java.
 Then you'll create an algorithm that calculates the least expensive store item in a collection of items.
*/
public class EndOfTheYearSale {

    public static void main(String[] args) {

        List<StoreItem> items = List.of(
                new StoreItem("T-Shirt", 19.99, .4),
                new StoreItem("Dress", 34.99, .75),
                new StoreItem("Record Player", 92.99, .1),
                new StoreItem("T-Shirt", 54.99, .65)
        );

        Optional<StoreItem> leastExpensiveOpt = StoreItem.findLeastExpensive(items);
        leastExpensiveOpt.ifPresent(
                leastExpensive -> System.out.println("The least expensive item is ~> " + leastExpensive)
        );


    }
}