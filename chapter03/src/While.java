/**
 * Created by Administrator on 2017-07-18.
 */
public class While {
// 10000 미만의 정수 중에서, 153의 배수중 가장 큰 값을 찾아 출력하세요.
    public static void main(String[] aegs) {
        int num = 10000;
        int key = 153;

        while (num % key > 0)
        {
            num--;

        }
        System.out.println(num);
    }
}
