package com.robinson.demetrious.rockpaperscissors.services;

import com.robinson.demetrious.rockpaperscissors.models.Game;
import org.springframework.stereotype.Service;

@Service
public class GameService {

    public String getWinner(Game game) {
        if (game.getPlayerOne().equalsIgnoreCase(game.getPlayerTwo())) {
            return "Draw";
        }
        if (game.getPlayerOne().equalsIgnoreCase("rock")) {
            if (game.getPlayerTwo().equalsIgnoreCase("scissors")){
                return "Player one wins";
            } else if (game.getPlayerTwo().equalsIgnoreCase("paper")) {
                return "Player two wins";
            }
        }
        if (game.getPlayerOne().equalsIgnoreCase("scissors")) {
            if (game.getPlayerTwo().equalsIgnoreCase("paper")) {
                return "Player one wins";
            } else if (game.getPlayerTwo().equalsIgnoreCase("rock")) {
                return "Player two wins";
            }
        }
        if (game.getPlayerOne().equalsIgnoreCase("paper")) {
            if (game.getPlayerTwo().equalsIgnoreCase("rock")) {
                return "Player one wins";
            } else if (game.getPlayerTwo().equalsIgnoreCase("scissors")) {
                return "Player two wins";
            }
        } else {
            return "Something went wrong";
        }
        return null;
    }

}
