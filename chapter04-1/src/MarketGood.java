/*
* 인스턴스 변수

MarketGood 클래스는 아래와 같은 인스턴스 변수들을 포함합니다:

(1) String name (상품의 이름)

(2) int retailPrice (상품의 출시 가격)

(3) int discountRate (상품의 할인율. 단위: %)

모두 private으로 설정해주세요!

생성자

MarketGood 클래스는 두 개의 생성자를 가지고 있습니다:
(1) public MarketGood(String name, int retailPrice, int discountRate)
생성자의 파라미터로 받은 값들을 인스턴스 변수에 지정해줍니다.
discountRate가 0%보다 작거나 100%보다 큰 경우, 0으로 지정해줍니다.
(2) public MarketGood(String name, int retailPrice)
두 번째 생성자는 discountRate의 기본값으로 0을 넣어줍니다.


Getter / Setter 메소드

(1) name, retailPrice는 getter 메소드만 만들어줍니다. 값을 지정해주는 것은 생성자에서 완료되었기 때문에 setter 메소드는 따로 만들 필요가 없습니다.
(2) discountRate는 바뀔 수 있기 때문에 getter과 setter 메소드를 모두 만들어줍니다.
public int getDiscountedPrice()
할인가를 리턴하는 메소드를 만듭니다. 예를 들어서 retailPrice가 10000이고 discountRate가 20이면, 8000을 리턴하는 것이죠.
* */

public class MarketGood {

    private String name;        //상품명
    private int  retailPrice;   //상품의 원가
    private int discountRate;   //상품의 할인률

    public MarketGood(String name,int retailPrice,int discountRate) {

           this.name = name;
           this.retailPrice =retailPrice;
           if(discountRate <= 0 || discountRate >100) {
               discountRate =0;
           }
           this.discountRate = discountRate;
    }

    public MarketGood(String name, int retailPrice){
        this(name,retailPrice,0);
    }

    public String getName() {
        return name;
    }
    public int getRetailPrice() {
        return retailPrice;
    }

    public void setDiscountRate(int discountRate){
        this.discountRate = discountRate;
    }
    public int getDiscountRate() {
        return discountRate;
    }

    public int getDiscountedPrice() { //할인률을 적용시키는 메소드

        return  this.retailPrice - ((this.retailPrice / 100 )*discountRate);
    }


}
