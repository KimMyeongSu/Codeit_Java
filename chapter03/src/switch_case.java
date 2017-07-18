/**
 * Created by Administrator on 2017-07-18.
 */



/*정수 134354를 7로 나눈 나머지를 영어로 출력하세요. 예를 들어서 134354를 7로 나누었을 때 나머지가 0이면 콘솔에 "Zero"가 출력되어야 하고,
 1 이면 콘솔에 "One"이 출력되어야 하고, 2이면 "Two"가 출력되어야 하고, 6이면 "Six"이 출력되어야 합니다.
 (어떤 수를 7로 나누었을 때, 나올 수 있는 나머지의 최솟값은 0이고, 최댓값은 6입니다.)  */

public class switch_case {
    public static void main(String[] args) {
        int number = 134354;
        switch (number % 7 ) {
            case 0:
                System.out.println("Zero");
                break;

            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 5:
                System.out.println("Five");
                break;
            case 6:
                System.out.println("Six");
                break;
            case 7:
                System.out.println("Seven");
                break;
            case 8:
                System.out.println("Eight");
                break;
            case 9:
                System.out.println("Nine");
                break;
            default:
                System.out.println("값을 알수 없습니다.");
        }

    }
}
