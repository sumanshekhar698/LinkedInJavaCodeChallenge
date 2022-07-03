package com.sumanshekhar.challenges.noob;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Collection;
import java.util.Comparator;
import java.util.Optional;

@Getter
@Setter
@AllArgsConstructor
public class StoreItem {
    String name;
    double retailPrice;
    double discount;

    public static Optional<StoreItem> findLeastExpensive(Collection<StoreItem> items) {

        return items.stream().min(Comparator.comparing(StoreItem::calculateCurrentPrice));
    }

    private double calculateCurrentPrice() {

        return retailPrice - (retailPrice * discount);
    }

    @Override
    public String toString() {
        return "Name: " + name + ", " + "Retail price: " +
                retailPrice + ", " + "Discount " + discount;
    }
}
