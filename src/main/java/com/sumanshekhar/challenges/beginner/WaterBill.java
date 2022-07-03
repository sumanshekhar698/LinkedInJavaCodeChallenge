package com.sumanshekhar.challenges.beginner;

import java.util.Scanner;

public class WaterBill {
    /*    Your water bill consists of two parts. First, there is a minimum charge of $18.84.
        This includes 1,496 gallons of water, or two CCFs.
        One CCF is equal to 748 gallons.
        If you use more than the included two CCFs,
        you are charged an extra $3.90 per additional CCF.
        This means if you use 1800 gallons of water in a given month,
        you will be charged the minimum $18.84, as well as an additional $3.90 for the extra volume of water used.
        For simplicity, we're not including tax in these calculations. (electronic bleeps) In the exercise files,
        we have a small program that calls the calculateWaterBill function. Your job is to*/
    public static void main(String[] args) {

        final Scanner sc = new Scanner(System.in);
        System.out.println("Enter Gallons USED in this month?");
        double waterUsedInGallons = sc.nextDouble();
        double bill = calculateWaterBill(waterUsedInGallons);
        System.out.println("BILL --> "+bill+" $");

    }

    protected static double calculateWaterBill(double waterUsedInGallons) {
        double minBill = 18.84;
        double numberOfGallonsIn1CCF = 748;
        double initialGallons = 748 * 2;

        if (waterUsedInGallons <= initialGallons)
            return minBill;
        else {
            double extraGallonsUsed = waterUsedInGallons - initialGallons;
            double extraAmount = Math.ceil(extraGallonsUsed / numberOfGallonsIn1CCF) * 3.9;
            return minBill + extraAmount;
        }
    }
}
