package de.joshuaebert.juno.util;

import de.joshuaebert.juno.cards.Card;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by joshua
 * in JUno
 * at 24.12.2020
 */
public class CardUtil {

    public static List<Card> generateCardList(int maxCards) {
        List<Card> cardList = new ArrayList<>();

        for (int i = 0; i < maxCards; i++) {

            Card card;
            do {
                int randomIndex = ThreadLocalRandom.current().nextInt(Card.values().length);
                card = Card.values()[randomIndex];

                System.out.println(card.getCardColor() + "  " + card.getCardNumber() + " |||||| " + card.getCardCount());
            } while (card.getCardCount() == 0);

            card.setCardCount(card.getCardCount() - 1);
            cardList.add(card);
        }
        return cardList;
    }
}
