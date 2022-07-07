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

    public ResultDTO validate(ChoiceEnum player1, ChoiceEnum player2) {
        ResultDTO result = new ResultDTO();

        switch(player1) {
            case ROCK -> {
                if(player2.equals(ChoiceEnum.SCISSORS)){
                    result.setPlayer1("win");
                    result.setPlayer2("lose");
                    break;
                } else if(player2.equals(ChoiceEnum.PAPER)) {
                    result.setPlayer1("lose");
                    result.setPlayer2("win");
                    break;
                } else {

                }
            }
            case PAPER -> {
                if(player2.equals(ChoiceEnum.SCISSORS)){
                    result.setPlayer1("win");
                    result.setPlayer2("lose");
                    break;
                } else if(player2.equals(ChoiceEnum.PAPER)) {
                    result.setPlayer1("lose");
                    result.setPlayer2("win");
                    break;
                }
            }

    }
}
