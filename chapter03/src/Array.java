/**
 * Created by Administrator on 2017-07-18.
 */

/*
(1) 크기가 30인 정수형 배열 intArray를 만들어 주세요.

(2) 배열의 첫 번째(0번 인덱스) 칸부터 1001, 1002, 1003, ..., 1029, 1030을 순서대로 넣어주세요.

(3) 크기가 4인 문자열형 배열 remainders를 만들어 "Zero", "One", "Two", "Three"를 순서대로 넣어주세요.

(4) 배열에 담긴 각 값을 4로 나눈 나머지를 영문으로 출력해주세요. 이 때 반드시 '배열 정리' 노트에 있는, for- each문을 활용해주세요!!

 */
public class Array {
    public static void main(String[] args) {
        int[] intArray = new int[30];
        String[] stringArray = {"Zero", "One", "Two", "Three"};
        for (int i=0; i < intArray.length; i++) {
            intArray[i] = 1001 +i;
           }
        for (int element : intArray) {
            System.out.println(stringArray[element % 4]);
        }
        }

}
