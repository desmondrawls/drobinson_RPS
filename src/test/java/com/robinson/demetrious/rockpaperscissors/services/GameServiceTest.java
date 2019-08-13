package com.robinson.demetrious.rockpaperscissors.services;

import com.robinson.demetrious.rockpaperscissors.models.Game;
import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.assertEquals;


public class GameServiceTest {
    Game game;
    @Before
    public void setUp() throws Exception {
        game = new Game();


    }

    @Test
    public void playerOneWins() throws Exception {
        game.setPlayerOne("rock");
        game.setPlayerTwo("scissors");
        GameService gameService = new GameService();
        assertEquals(gameService.getWinner(game), "Player one wins");
    }

    @Test
    public void playerTwoWins() throws Exception {
        game.setPlayerOne("paper");
        game.setPlayerTwo("scissors");
        GameService gameService = new GameService();
        assertEquals(gameService.getWinner(game), "Player two wins");
    }

    @Test
    public void draw() throws Exception {
        game.setPlayerOne("rock");
        game.setPlayerTwo("rock");
        GameService gameService = new GameService();
        assertEquals(gameService.getWinner(game), "Draw");
    }

    @Test
    public void invalidEntry() throws Exception {
        game.setPlayerOne("rocks");
        game.setPlayerTwo("verify");
        GameService gameService = new GameService();
        assertEquals(gameService.getWinner(game), "Something went wrong");
    }

}
