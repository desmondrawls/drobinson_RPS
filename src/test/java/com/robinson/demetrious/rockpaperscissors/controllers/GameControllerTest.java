package com.robinson.demetrious.rockpaperscissors.controllers;

import com.robinson.demetrious.rockpaperscissors.models.Game;
import com.robinson.demetrious.rockpaperscissors.services.GameService;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.hamcrest.Matchers.*;
import static org.mockito.ArgumentMatchers.any;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

public class GameControllerTest {

    @Mock
    private GameService gameService;

    @InjectMocks
    private GameController gameController;
    private MockMvc mockMvc;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        this.mockMvc = MockMvcBuilders.standaloneSetup(gameController).build();
    }

    @Test
    public void HappyPath() throws Exception {
        when(gameService.getWinner(any(Game.class))).thenReturn("Winner");

        this.mockMvc.perform(post("/game/submit")
            .param("playerOne", "rock")
            .param("playerTwo", "scissors"))
            .andExpect(status().isOk())
                .andExpect(jsonPath("$", is("Winner")));

    }
}
