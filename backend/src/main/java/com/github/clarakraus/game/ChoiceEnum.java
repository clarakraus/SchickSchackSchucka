package com.github.clarakraus.game;

public enum ChoiceEnum {

    ROCK("rock"),
    PAPER("paper"),
    SCISSORS("scissors");

    private final String state;

    ChoiceEnum(String state) {
        this.state = state;
    }
}
