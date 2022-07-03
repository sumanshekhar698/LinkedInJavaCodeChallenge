package com.sumanshekhar.challenges.noob;


import java.util.List;

/*
You want to start investing, so you decide for every purchase,
 you'll invest the change. In this challenge,
 your job is to figure out the average amount invested per purchase.
 This month, you decided to invest the leftover change from each purchase into the stock market.
 For example, when you purchase your $5.20 coffee,
 you put 73 cents into your investment account.
 Given a list of each purchase made,
 your challenge is to create a function that returns the average amount you invested in the stock market.
*/
public class InvestingChange {

    public static void main(String[] args) {
        List<Double> purchases = List.of(12.38, 38.29, 5.27, 3.21);
        double investment = calculateAvgChangeInvested(purchases);

    }

     static double calculateAvgChangeInvested(List<Double> purchases) {
        return purchases.stream().mapToDouble(x->Math.ceil(x)-x).average().orElse(0);
        //orElse() to have optional unpacek safely
    }
}
