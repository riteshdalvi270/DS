package OOP.blackjack;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ritesh on 4/25/17.
 */
public class BlackJack {
}

class Suits {

    private final String[] suits = new String[]{"2","3","4","5","6","7","8","9","10","J", "K", "Q","A"};

    public String[] getSuits() {
        return suits;
    }
}

class Ranks {

    private final String[] ranks = new String[] {"hearts","diamonds","spade","club"};

    public String[] getRanks() {
        return ranks;
    }
}

class Card {

    private final String suit;
    private final String rank;

    public Card(final String suit, final String rank) {
        this.rank = rank;
        this.suit = suit;
    }
}

class Deck{

    final List<Card> cards;

    public Deck() {

        cards = new ArrayList<>();
    }

    public List<Card> initializeCards() {

        final String[] suits = new Suits().getSuits();
        final String[] ranks = new Ranks().getRanks();

        for(String suit : suits) {

            for(String rank : ranks) {

                cards.add(new Card(suit,rank));
            }
        }

        return cards;
    }

    // get the rules of black jack. and make it generic.
}
