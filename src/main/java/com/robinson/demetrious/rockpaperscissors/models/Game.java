package com.robinson.demetrious.rockpaperscissors.models;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Game {

    private String playerOne;

    private String playerTwo;

    public String getPlayerOne() {
        return playerOne;
    }

    public void  setPlayerOne(String playerOne) {
        this.playerOne = playerOne;
    }

    public String getPlayerTwo() {
        return playerTwo;
    }

    public void  setPlayerTwo(String playerTwo) {
        this.playerTwo =  playerTwo;
    }


}
