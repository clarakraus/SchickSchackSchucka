package com.github.clarakraus.game;


import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GameServiceTest {

    @Test
    void shouldTestIfEitherRockPaperOrScissorsIsReturned() {
        ArrayList<ChoiceEnum> choices = new ArrayList<>(List.of(ChoiceEnum.PAPER, ChoiceEnum.ROCK, ChoiceEnum.SCISSORS));

        GameService gameService = new GameService();
        ChoiceEnum actual = gameService.getRandomChoice();

        Assertions.assertThat(choices).contains(actual);
    }

}