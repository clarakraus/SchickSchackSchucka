package com.github.clarakraus.game;


import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/game")
@RequiredArgsConstructor
public class GameController {

    private final GameService gameService;

    @PostMapping("/bot/{player1Choice}")
    public ResponseEntity<ResultDTO> playAgainstBot(@PathVariable String player1Choice) {
        try {
            return ResponseEntity.ok(gameService.playAgainstBot(player1Choice));
        } catch(IllegalArgumentException e) {
            return ResponseEntity.badRequest().build();
        }
    }
}
