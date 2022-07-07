package com.github.clarakraus.game;

import org.springframework.stereotype.Service;

import java.awt.*;

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

    public ResultDTO validate(ChoiceEnum player1, ChoiceEnum player2) {
        ResultDTO result = new ResultDTO();

        switch (player1) {
            case ROCK -> {
                if (player2.equals(ChoiceEnum.SCISSORS)) {
                    result.setPlayer1("win");
                    result.setPlayer2("lose");
                } else if (player2.equals(ChoiceEnum.PAPER)) {
                    result.setPlayer1("lose");
                    result.setPlayer2("win");
                } else if (player2.equals(ChoiceEnum.ROCK)) {
                    result.setPlayer1("draw");
                    result.setPlayer2("draw");
                }
            }
            case PAPER -> {
                if (player2.equals(ChoiceEnum.SCISSORS)) {
                    result.setPlayer1("lose");
                    result.setPlayer2("win");
                } else if (player2.equals(ChoiceEnum.ROCK)) {
                    result.setPlayer1("win");
                    result.setPlayer2("lose");
                } else if (player2.equals(ChoiceEnum.PAPER)) {
                    result.setPlayer1("draw");
                    result.setPlayer2("draw");
                }
            }
            case SCISSORS -> {
                if (player2.equals(ChoiceEnum.PAPER)) {
                    result.setPlayer1("win");
                    result.setPlayer2("lose");
                } else if (player2.equals(ChoiceEnum.ROCK)) {
                    result.setPlayer1("lose");
                    result.setPlayer2("win");
                } else if (player2.equals(ChoiceEnum.SCISSORS)) {
                    result.setPlayer1("draw");
                    result.setPlayer2("draw");
                }
            }
        }
        return result;
    }


    public ResultDTO playAgainstBot(String player1Choice) {
        ChoiceEnum player1Enum = ChoiceEnum.valueOf(player1Choice);
        ChoiceEnum botEnum = getRandomChoice();
        return validate(player1Enum, botEnum);
    }
}
