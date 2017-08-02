import java.util.HashMap;

public class Card {

    //카드 모양에는 정수 1, 2, 3, 4로 표현되는 '클로버(Clubs)', '하트(Hearts)', '다이아몬드(Diamonds', '스페이드(Spades)'
    public final int suitNumber; // 카드 모양이 저장될 변수.

    //카드의 값을 뜻합니다. 1, 11, 12, 13은 각각 'Ace', 'Jack', 'Queen', 'King'로 표현되고, 2~10은 그 숫자 자체로 표현
    public final int rankNumber; //카드의 숫자가 저장될 변수


    public Card(int suitNumber, int rankNumber){ //카드를 생성해줄 생성자
        this.suitNumber =suitNumber; // 입력받은 카드의 첫번째 숫자 (모양)
        this.rankNumber =rankNumber; //입력받은 카드의 두번째 숫자 (번호)
    }


public String getSuit() {    //입력받은 숫자를 모양값으로 변환해주는 메소드
            switch (suitNumber) {
                case 1:
                    return "Clubs";
                case 2:
                    return "Diamonds";
                case 3:
                    return "Hearts";
                case 4:
                    return "Spades";
                default: return "";
            }
   }

    public String getRank() { //랭크 값을 받아서 변환해줘야할 랭크가 들어오면 변환하여 반환
            switch (rankNumber) {
                case 1 :
                    return "ace";
                case 11 :
                    return "Jack";
                case 12 :
                    return "Queen";
                case 13:
                    return "King";
                    default:
                        return String.valueOf(rankNumber);
            }
    }

    @Override
    public String toString() {  //출력문 반환
        return  getRank() + " of " +getSuit();
    }


}