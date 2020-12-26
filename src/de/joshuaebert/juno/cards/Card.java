package de.joshuaebert.juno.cards;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by joshua
 * in JUno
 * at 24.12.2020
 */

public enum Card {

    RED_ZERO(Color.RED, 0, "r0.png", 1),
    RED_ONE(Color.RED, 1, "r1.png", 1),
    RED_TWO(Color.RED, 2, "r2.png", 1),
    RED_THREE(Color.RED, 3, "r3.png", 1),
    RED_FOUR(Color.RED, 4, "r4.png", 1),
    RED_FIVE(Color.RED, 5, "r5.png", 1),
    RED_SIX(Color.RED, 6, "r6.png", 1),
    RED_SEVEN(Color.RED, 7, "r7.png", 1),
    RED_EIGHT(Color.RED, 8, "r8.png", 1),
    RED_NINE(Color.RED, 9, "r9.png", 1),
    RED_REVERSE(Color.RED, -1, "rr.png", 1),
    RED_PLUS_2(Color.RED, -1, "rp2.png", 1),
    RED_SKIP(Color.RED, -1, "rs.png", 1),

    GREEN_ZERO(Color.GREEN, 0, "", 1),
    GREEN_ONE(Color.GREEN, 1, "", 1),
    GREEN_TWO(Color.GREEN, 2, "", 1),
    GREEN_THREE(Color.GREEN, 3, "", 1),
    GREEN_FOUR(Color.GREEN, 4, "", 1),
    GREEN_FIVE(Color.GREEN, 5, "", 1),
    GREEN_SIX(Color.GREEN, 6, "", 1),
    GREEN_SEVEN(Color.GREEN, 7, "", 1),
    GREEN_EIGHT(Color.GREEN, 8, "", 1),
    GREEN_NINE(Color.GREEN, 9, "", 1),
    GREEN_REVERSE(Color.GREEN, -1, "", 1),
    GREEN_PLUS_2(Color.GREEN, -1, "", 1),
    GREEN_SKIP(Color.GREEN, -1, "", 1),

    BLUE_ZERO(Color.BLUE, 0, "", 1),
    BLUE_ONE(Color.BLUE, 1, "", 1),
    BLUE_TWO(Color.BLUE, 2, "", 1),
    BLUE_THREE(Color.BLUE, 3, "", 1),
    BLUE_FOUR(Color.BLUE, 4, "", 1),
    BLUE_FIVE(Color.BLUE, 5, "", 1),
    BLUE_SIX(Color.BLUE, 6, "", 1),
    BLUE_SEVEN(Color.BLUE, 7, "", 1),
    BLUE_EIGHT(Color.BLUE, 8, "", 1),
    BLUE_NINE(Color.BLUE, 9, "", 1),
    BLUE_REVERSE(Color.BLUE, -1, "", 1),
    BLUE_PLUS_2(Color.BLUE, -1, "", 1),
    BLUE_SKIP(Color.BLUE, -1, "", 1),

    YELLOW_ZERO(Color.YELLOW, 0, "", 1),
    YELLOW_ONE(Color.YELLOW, 1, "", 1),
    YELLOW_TWO(Color.YELLOW, 2, "", 1),
    YELLOW_THREE(Color.YELLOW, 3, "", 1),
    YELLOW_FOUR(Color.YELLOW, 4, "", 1),
    YELLOW_FIVE(Color.YELLOW, 5, "", 1),
    YELLOW_SIX(Color.YELLOW, 6, "", 1),
    YELLOW_SEVEN(Color.YELLOW, 7, "", 1),
    YELLOW_EIGHT(Color.YELLOW, 8, "", 1),
    YELLOW_NINE(Color.YELLOW, 9, "", 1),
    YELLOW_REVERSE(Color.YELLOW, -1, "", 1),
    YELLOW_PLUS_2(Color.YELLOW, -1, "", 1),
    YELLOW_SKIP(Color.YELLOW, -1, "", 1),

    BLACK_PLUS_FOUR(Color.BLACK, 0, "", 4),
    BLACK_CHOOSE_COLOR(Color.BLACK, 1, "", 4);

    @Getter
    private final Color cardColor;
    @Getter
    private final int cardNumber;
    @Getter
    private final String cardResource;
    @Getter @Setter
    private int cardCount;

    Card(Color cardColor, int cardNumber, String cardResource, int cardCount) {
        this.cardColor = cardColor;
        this.cardNumber = cardNumber;
        this.cardResource = cardResource;
        this.cardCount = cardCount;
    }

    private enum Color {
        RED, GREEN, BLUE, YELLOW, BLACK;
    }
}
