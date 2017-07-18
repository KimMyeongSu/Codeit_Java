/**
 * Created by Administrator on 2017-07-17.
 */
public class IfElse {
 /*

 정수형 변수 a, b에 대하여 다음의 조건들을 만족하는 코드를 작성해 봅시다.

    a와 b가 같으면 "a와 b가 같습니다. a = b = [a의 값]"를 출력합니다.
    a와 b가 같지 않으면 "a와 b는 같지 않습니다"를 출력합니다.
    조건 (2)의 출력문 이후에, a가 b보다 더 큰 경우 "a가 b보다 [a, b의 차]만큼 더 큽니다."를 출력합니다.
    조건 (2)의 출력문 이후에, b가 a보다 더 큰 경우 "b가 a보다 [a, b의 차]만큼 더 큽니다."를 출력합니다.
    예를 들어서 a는 3, b는 7인 경우, 아래의 출력값이 나와야합니다.
 */
    public static void main (String[] args)  {
        int a = 38, b = 27;

            if (a == b)
            {
                System.out.println("a와 b가 같습니다. a = b "+a);
            }

            else if (a != b)
            {
            System.out.println("a와 b는 같지 않습니다.");
            if (a > b )
            {
                System.out.println("a가 b보다 " + (a- b)+ "만큼 더 큽니다.");
            }
            else System.out.println("b가 a보다 " + (b -a)+ "만큼 더 큽니다.");

        }


    }

}
