package com.robinson.demetrious.rockpaperscissors.controllers;

import com.robinson.demetrious.rockpaperscissors.models.Game;
import com.robinson.demetrious.rockpaperscissors.services.GameService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/game")
@EnableAutoConfiguration
public class GameController {
    private final GameService gameService;

    @Autowired
    public GameController(GameService gameService) {
        this.gameService = gameService;
    }

    private final Logger log = LoggerFactory.getLogger(GameController.class);

    @GetMapping("/form")
    public String showForm(Game game) {
        return "form";
    }
    @PostMapping ("/submit")
    public String Submit(@Valid Game game) {
        System.out.println(game);
        log.info(String.valueOf(game));
        return gameService.getWinner(game);
    }
}
