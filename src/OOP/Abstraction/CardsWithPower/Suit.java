package OOP.Abstraction.CardsWithPower;

public enum Suit {

    CLUBS(0), DIAMONDS(13), HEARTS(26), SPADES(39);

    private final int suit;

    Suit(int suit) {
        this.suit = suit;
    }

    public int getSuit() {
        return suit;
    }
}
