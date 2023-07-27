package OOP.Enum.CardsWithPower;

public class Card {

    private final Rank rank;

    private final Suit suit;

    public Card(Rank rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public String getCardNane(){
        return rank.name();
    }

    public String getSuitName(){
        return suit.name();
    }

    public int getPower(){
        return rank.getPower() + suit.getSuit();
    }

    @Override
    public String toString() {
        return "Card name: " + getCardNane() + " of " + getSuitName() + "; Card power: " + getPower();
    }
}
