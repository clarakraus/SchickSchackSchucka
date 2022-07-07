package com.github.clarakraus.game;

import org.springframework.stereotype.Service;

@Service
public class GameService {
    public ChoiceEnum getRandomChoice() {

        int random = (int) (Math.random() * 3);
        return switch (random) {
            case 0 -> ChoiceEnum.ROCK;
            case 1 -> ChoiceEnum.PAPER;
            default -> ChoiceEnum.SCISSORS;
        };
    }

    public String validate(ChoiceEnum given, ChoiceEnum answer) {
        re
    }
}
