package de.joshuaebert.juno.player;

import de.joshuaebert.juno.cards.Card;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by joshua
 * in JUno
 * at 24.12.2020
 */
public class Player {

    @Getter
    private final String playerName;

    @Getter
    private final List<Card> cardList = new ArrayList<>();

    public Player(String playerName) {
        this.playerName = playerName;
    }
}
