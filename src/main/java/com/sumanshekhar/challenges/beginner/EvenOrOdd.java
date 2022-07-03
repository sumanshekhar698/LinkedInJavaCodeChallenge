package com.sumanshekhar.challenges.beginner;

import java.util.Scanner;

public class EvenOrOdd {

    public static void main(String[] args) {
        System.out.println("Enter the number to check for ODD and EVEN");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        boolean ans = isEven(input);
        System.out.println(ans);
    }

     static boolean isEven(int input) {
//        return (input % 2 == 0) ? true : false;
        return input % 2 == 0;// best as readabilty is good

//         return  (input & 1)==0;
/*         it's a little less readable as most don't use Bitwise operators very often.
         It's a little faster and was often used when there weren't pre optimizers in our code.
         But now that optimization exists at a lower level, readability often becomes more important.
         So we'll switch back to our previous implementation.
         Many common mathematical operations can be reduced into simple programs, just like this one.*/


    }

}
