package com.sumanshekhar.challenges.beginner;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PasswordComplexityTest {

    @Test
    public void isPasswordComplexRegexed_true() {
        assertTrue(PasswordComplexity.isPasswordComplexRegexed("Happy12"));
        assertTrue(PasswordComplexity.isPasswordComplexRegexed("1SarahL ength"));
        assertTrue(PasswordComplexity.isPasswordComplexRegexed("Password12"));
        assertTrue(PasswordComplexity.isPasswordComplexRegexed("2PassW@ord1"));
        assertTrue(PasswordComplexity.isPasswordComplexRegexed("01Sall#y9"));
    }

    @Test
    public void isPasswordComplexRegexed_false() {
        assertFalse(PasswordComplexity.isPasswordComplexRegexed("12aB "));
        assertFalse(PasswordComplexity.isPasswordComplexRegexed("Ab112"));
        assertFalse(PasswordComplexity.isPasswordComplexRegexed("happy"));
        assertFalse(PasswordComplexity.isPasswordComplexRegexed("happy_1"));
        assertFalse(PasswordComplexity.isPasswordComplexRegexed("p assword12"));
        assertFalse(PasswordComplexity.isPasswordComplexRegexed("Sur18"));
        assertFalse(PasswordComplexity.isPasswordComplexRegexed(""));
    }

    @Test
    public void isPasswordComplex_true() {
        assertTrue(PasswordComplexity.isPasswordComplex("Happy12"));
        assertTrue(PasswordComplexity.isPasswordComplex("1SarahL ength"));
        assertTrue(PasswordComplexity.isPasswordComplex("Password12"));
        assertTrue(PasswordComplexity.isPasswordComplex("2PassW@ord1"));
        assertTrue(PasswordComplexity.isPasswordComplex("01Sall#y9"));
    }

    @Test
    public void isPasswordComplex_false() {
        assertFalse(PasswordComplexity.isPasswordComplex("12aB "));
        assertFalse(PasswordComplexity.isPasswordComplex("Ab112"));
        assertFalse(PasswordComplexity.isPasswordComplex("happy"));
        assertFalse(PasswordComplexity.isPasswordComplex("happy_1"));
        assertFalse(PasswordComplexity.isPasswordComplex("p assword12"));
        assertFalse(PasswordComplexity.isPasswordComplex("Sur18"));
        assertFalse(PasswordComplexity.isPasswordComplex(""));
    }
}
