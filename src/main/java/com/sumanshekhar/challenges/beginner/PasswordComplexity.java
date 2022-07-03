package com.sumanshekhar.challenges.beginner;

import java.util.Scanner;

public class PasswordComplexity {

    public static void main(String[] args) {
        System.out.println("Enter the password for Complexity");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        boolean ans = isPasswordComplex(input);
        System.out.println(ans);
    }

    /*
        In order for a password to be valid,
        it must have at least six characters,
        one upper case letter,
        one lowercase letter,
        and one number.
    */
    static boolean isPasswordComplex(String pwd) {

        if(pwd.length() < 6)
            return  false;

        boolean hasLowerCase = false;
        boolean hasUpperCase = false;
        boolean hasNumber = false;

        for (int i = 0; i < pwd.length() || (!hasLowerCase && !hasUpperCase && !hasNumber); i++) {

            char currentCharacter = pwd.charAt(i);

            if(Character.isDigit(currentCharacter))
                hasNumber = true;
            else if (Character.isUpperCase(currentCharacter))
                hasUpperCase = true;
            else if (Character.isLowerCase(currentCharacter))
                hasLowerCase = true;
        }

        return hasLowerCase && hasUpperCase && hasNumber;
    }


    static boolean isPasswordComplexRegexed(String password) {

        return password.length() >= 6 &&
                password.matches(".*\\d.*") &&
                password.matches(".*[a-z].*") &&
                password.matches(".*[A-Z].*");
    }

}
