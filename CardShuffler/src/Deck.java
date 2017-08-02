import java.util.ArrayList;
import java.util.Random;

public class Deck<T>  {

    private ArrayList<T> cards = new ArrayList<>();
    //덱에 있는 카드를 보관하는 ArrayList.


    public ArrayList<T> getCards() {
        return cards;
    }


    public void addCard(T card) {
        cards.add(card);
    }


    public void print() {
//    카드 목록에 있는 모든 카드를 출력합니다. 출력할 때는 카드 인스턴스의 toString 메소드를 사용하세요.

        for (T card : cards) {
            System.out.println(card.toString());
        }

    }

    public void shuffle() {

        //cards의 순서를 뒤죽박죽 섞습니다. Random 클래스를 이용해서 완전히 랜덤하게 섞어주세요!


        T temp;
        Random random = new Random();

        for (int i = 0; i < cards.size(); i++) { //cards 의 ArrayList 크기만큼 반복
            int rv = random.nextInt(cards.size());  //랜덤값을 0부터 cards의 크기에 맞춤
            temp = cards.get(rv);  //값을 임시로 저장할 Card에 추가
            cards.set(i, cards.get(rv));
            cards.set(rv, temp);

        }

    }

    public Deck deal(int count) {
        //먼저 hand라는 새로운 Deck 인스턴스를 만드세요.
        //count가 5면 현재 덱의 cards의 마지막 다섯 장을 빼고,
        // 그 다섯 장을 hand의 cards에 넣어주세요. 그리고 hand를 리턴해주면 됩니다

        Deck hand = new Deck();

        for (int i = 0; i <count; i++){

            hand.addCard(cards.remove(0));

        }

        return hand;
    }

}