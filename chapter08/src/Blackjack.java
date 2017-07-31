import java.util.ArrayList;
import java.util.Random;

public class Blackjack {
    public static void main(String[] args) {
        BlackjackHand hand1 = new BlackjackHand();

        hand1.addCard(new BlackjackCard(3, 1));
        hand1.addCard(new BlackjackCard(4, 11));
        System.out.println(hand1.getValue());
        System.out.println(hand1.isBlackjack());
        System.out.println(hand1.isBusted());


        BlackjackHand hand2 = new BlackjackHand();
        hand2.addCard(new BlackjackCard(1, 4));
        hand2.addCard(new BlackjackCard(2, 8));
        hand2.addCard(new BlackjackCard(2, 9));
        System.out.println(hand2.getValue());
        System.out.println(hand2.isBlackjack());
        System.out.println(hand2.isBusted());

        BlackjackHand hand3 = new BlackjackHand();
        hand3.addCard(new BlackjackCard(2, 5));
        hand3.addCard(new BlackjackCard(4, 9));
        hand3.addCard(new BlackjackCard(2, 13));
        System.out.println(hand3.getValue());
        System.out.println(hand3.isBlackjack());
        System.out.println(hand3.isBusted());

        BlackjackHand hand4 = new BlackjackHand();
        hand4.addCard(new BlackjackCard(2, 8));
        hand4.addCard(new BlackjackCard(1, 1));
        System.out.println(hand4.getValue());
        System.out.println(hand4.isBlackjack());
        System.out.println(hand4.isBusted());

        BlackjackHand hand5 = new BlackjackHand();
        hand5.addCard(new BlackjackCard(1, 7));
        hand5.addCard(new BlackjackCard(1, 9));
        hand5.addCard(new BlackjackCard(3, 1));
        System.out.println(hand5.getValue());
        System.out.println(hand5.isBlackjack());
        System.out.println(hand5.isBusted());

        BlackjackHand hand6 = new BlackjackHand();
        hand6.addCard(new BlackjackCard(2, 1));
        hand6.addCard(new BlackjackCard(1, 1));
        System.out.println(hand6.getValue());
        System.out.println(hand6.isBlackjack());
        System.out.println(hand6.isBusted());

    }

}


class BlackjackCard extends Card{


    public BlackjackCard(int suitNumber, int rankNumber) {
        super(suitNumber, rankNumber);
    }

    public int getValue() {
        //블랙잭 카드의 가치를 'value'라 칭하고 getValue 메소드를 통해서 가져올 수 있도록 하겠습니다.
        if (rankNumber == 1) {return 11;}
        if (rankNumber >= 10) {return 10;}
        return rankNumber;
    }

    public boolean isAce() {
        // Ace는 두 가지 값을 가질 수 있는 특별한 카드 입니다.
        // 따라서 해당 카드가 Ace인지 아닌지 확인하는 isAce 메소드를 쓰겠습니다.
      return rankNumber ==1;
    }

}

class BlackjackHand extends Deck {

BlackjackCard blackjackCard;


    public int getValue() {
        //블랙잭의 룰에 맞게 핸드의 가치를 리턴
        int resulet =0;
        int ace=0;
        for (int i=0; i < this.getCards().size(); i++) {
          //  resulet = blackjackCard.getValue();

            blackjackCard = new BlackjackCard(this.getCards().get(i).suitNumber ,this.getCards().get(i).rankNumber);
            if(blackjackCard.isAce()) {
                ace++;
            }

            resulet += blackjackCard.getValue();

            if(resulet > 21 && ace != 0) {
                    resulet = resulet - 10;
                    ace--;
                }

              }

        return  resulet;
    }

    public boolean isBusted() {
        //핸드의 가치가 21을 넘으면 '파산(Busted)'입니다. 현재 핸드가 파산했는지 리턴해주는 메소드

        if (getValue() > 21) {
                return true;

        }
        return false;
    }


    public boolean isBlackjack() {
        // 핸드가 두 장의 카드만 가지고 있고 가치가 21이면 '블랙잭'입니다. 현재 핸드가 블랙잭인지 리턴해주는 메소드
        if(this.getCards().size()==2  && getValue() ==21) {

            return true;
        }
        return false;
    }
}





class Card {

    public final int suitNumber;
    public final int rankNumber;

    public Card(int suitNumber, int rankNumber) {
        this.suitNumber = suitNumber;
        this.rankNumber = rankNumber;
    }

    public String getSuit() {
        switch (suitNumber) {
            case 1:
                return "Clubs";
            case 2:
                return "Diamonds";
            case 3:
                return "Hearts";
            case 4:
                return "Spades";
            default:
                return "";
        }
    }

    public String getRank() {
        switch (rankNumber) {
            case 1:
                return "Ace";
            case 11:
                return "Jack";
            case 12:
                return "Queen";
            case 13:
                return "King";
            default:
                return String.valueOf(rankNumber);
        }
    }

    public String toString() {
        return getRank() + " of " + getSuit();
    }
}




class Deck {

    private ArrayList<Card> cards;

    public Deck() {
        cards = new ArrayList<Card>();
    }


    public void addCard(Card card) {
        cards.add(card);
    }


    public ArrayList<Card> getCards() {
        return cards;
    }

    public void print() {
        for (Card card : cards) {
            System.out.println(card.toString());
        }
    }


    public void shuffle() {
        Random random = new Random();

        for (int i = 0; i < cards.size(); i++) {
            int randIndex = random.nextInt(cards.size());
            Card temp = cards.get(i);
            cards.set(i, cards.get(randIndex));
            cards.set(randIndex, temp);
        }
    }

    public Deck deal(int count) {
        Deck hand = new Deck();

        for (int i = 0; i < count; i++) {
            hand.addCard(cards.remove(0));
        }

        return hand;
    }
}