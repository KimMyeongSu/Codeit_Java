


public class BlackjackHand  <T extends Card>  extends Deck<BlackjackCard>{

    //Deck 는 기본생성자가 있기때문에 따로 작성해주지 않아도 된다 .


    public int getValue() {
        int value = 0;
        int ace =0;
        //Ace가 몃장있는지와 현재 value의 값 .

        for (BlackjackCard card : getCards()) {
            if (card.isAce()) {
                ace++;
            }

            value += card.getValue();
        }

        while (ace > 0 && value >21) {
            value -=10;
            ace--;
        }
        return value;
    }

    public boolean isBusted() {

        return getValue() > 21;
    }

    public boolean isBlackjack() {
        return getValue() ==21 && getCards().size()==2;
    }
}
