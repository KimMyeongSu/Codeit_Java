import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class CardShuffler {

    public static void main(String[] args) {




        Deck standardDeck = new Deck();

        for (int suit = 1; suit <= 4; suit++) {
            for (int rank = 1; rank <= 13; rank++) {
                Card newCard = new Card(suit, rank);

                standardDeck.addCard(newCard);
            }
        }

        // 카드 셔플
        standardDeck.shuffle();

        // 딜링
        Deck hand1 = standardDeck.deal(5);
        Deck hand2 = standardDeck.deal(5);

        // 각 핸드 출력
        hand1.print();
        System.out.println();

        System.out.println("----------");
        hand2.print();

    }
}


class Card {

    private final HashMap<Integer,String > cardShape = new HashMap<>(); //카드의 모양을 저장할 hachmap
    private final HashMap<String,String > cardNumber = new HashMap<>(); ////카드의 숫자를 저장할 hachmap

    public void initCardShape () {
        //카드의 첫번째 숫자가 가지고 있는 모양값.
        cardShape.put (1,"Clubs");
        cardShape.put(2,"Hearts");
        cardShape.put(3,"Diamonds");
        cardShape.put(4,"Spades");
    }

    public void initCardNumber () {
        //카드의 두번째 숫자가 가지고있는 숫자값.
        cardNumber.put("1","Ace");
        cardNumber.put("2","2");
        cardNumber.put("3","3");
        cardNumber.put("4","4");
        cardNumber.put("5","5");
        cardNumber.put("6","6");
        cardNumber.put("7","7");
        cardNumber.put("8","8");
        cardNumber.put("9","9");
        cardNumber.put("10","10");
        cardNumber.put("11","Jack");
        cardNumber.put("12","Queen");
        cardNumber.put("13","King");
    }

    //카드 모양에는 정수 1, 2, 3, 4로 표현되는 '클로버(Clubs)', '하트(Hearts)', '다이아몬드(Diamonds', '스페이드(Spades)'
    public final int suitNumber; // 카드 모양이 저장될 변수.

    //카드의 값을 뜻합니다. 1, 11, 12, 13은 각각 'Ace', 'Jack', 'Queen', 'King'로 표현되고, 2~10은 그 숫자 자체로 표현
    public final int rankNumber; //카드의 숫자가 저장될 변수


    public Card(int suitNumber, int rankNumber){ //카드를 생성해줄 생성자
        this.suitNumber =suitNumber; // 입력받은 카드의 첫번째 숫자 (모양)
        this.rankNumber =rankNumber; //입력받은 카드의 두번째 숫자 (번호)
        initCardShape(); // 카드모양을 가지고있는 hashmap 초기화
        initCardNumber(); //카드숫자를 가지고있는 hashmap 초기화

    }

    public String getSuit(){
        //변수 suit의 숫자 값에 해당하는 슈트(suit)를 리턴해줍니다.

        for (Integer number : cardShape.keySet()){ //모양을 가지고있는 hashmap을 돌면서 숫자가 일치하면 모양값 반환
            if (this.suitNumber == number) {return cardShape.get(number);}
        }
        return null;
    }

    public String getRank() {

        //변수 number의 숫자 값에 해당하는 카드 랭크를 리턴해줍니다.

        for (String key : cardNumber.keySet()) { //랭크를 가지고있는 hashmap을 돌면서 숫자가 일치하면 랭크값 반환
            if(String.valueOf(this.rankNumber).equals(key)){
                return cardNumber.get(key);
            }
        }
        return null;
    }

    public String toString() {  //출력문 반환
        String result;
        result = getRank() + " of " +getSuit();
        return result;
    }
}


class Deck {
    private ArrayList<Card> cards = new ArrayList<>();
    //덱에 있는 카드를 보관하는 ArrayList.


    public ArrayList<Card> getCards() {
        return cards;
    }


    public void addCard(Card card) {

        cards.add(card);
    }

    public void print() {
//    카드 목록에 있는 모든 카드를 출력합니다. 출력할 때는 카드 인스턴스의 toString 메소드를 사용하세요.
        for (int i = 0; i < cards.size(); i++) {
            System.out.println(cards.get(i).toString());
        }
    }

    public void shuffle() {

        //cards의 순서를 뒤죽박죽 섞습니다. Random 클래스를 이용해서 완전히 랜덤하게 섞어주세요!

        ArrayList<Card> tempList = new ArrayList<>(); //값을 잠시동안 보관할 ArrayList

        Random random = new Random();

        for (int i = 0; i < cards.size(); i++) { //cards 의 ArrayList 크기만큼 반복
            int rv = random.nextInt(cards.size());  //랜덤값을 0부터 cards의 크기에 맞춤
            tempList.add(cards.get(rv));  //값을 임시로 저장할 ArrayList에 추가
            cards.remove(cards.get(rv));  //기존의 ArrayList에서는 제거

        }
        cards = tempList; //임시 저장된 ArrayList의 값을 다시 넘겨줌 .

    }

    public Deck deal(int count) {
        //먼저 hand라는 새로운 Deck 인스턴스를 만드세요.
        //count가 5면 현재 덱의 cards의 마지막 다섯 장을 빼고,
        // 그 다섯 장을 hand의 cards에 넣어주세요. 그리고 hand를 리턴해주면 됩니다

        Deck hand = new Deck();
        System.out.println(cards);
        for (int i = 0; i <count ; i++){
            hand.cards.add(cards.get(cards.size()-1));
            cards.remove(cards.size()-1);

        }
        System.out.println(cards);

        return hand;
    }


}
