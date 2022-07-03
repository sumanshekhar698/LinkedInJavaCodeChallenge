package com.sumanshekhar.challenges.novice;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

//The game had a series of rounds and during each round,
// a given player and their partner got a series of points.
// Given the team results from each round,
// your challenge is to write a program that automatically determines the overall
// winner and prints out the final score results in descending order.
@Getter
public class Team {

    private final String player1;
    private final String player2;
    private final List<Integer> scores;

    public Team(String player1, String player2) {

        this.player1 = player1;
        this.player2 = player2;
        scores = new ArrayList<>();
    }

    public int sumTotalScore() {

        return scores.stream()
                .filter(score -> score > 0)
                .reduce(Integer::sum)
                .orElse(0);
    }
}

