

/*

파라미터로 정수 배열 intArray를 받고, 두 원소의 차이 중 가장 큰 값을 리턴해주는 메소드 greatestDifference를 쓰세요.
리턴값의 자료형은 int입니다.

만약 원소 개수가 2개보다 작으면 0을 리턴해줍니다.
 */
public class GreatestDifferenceFinder {

    int greatestDifference(int[] intArray) {


        if(intArray.length < 2) {
            return 0;
        }


        int max = intArray[0];
        int min = intArray[0];

        for(int i=0; i< intArray.length; i++) {
               if(max < intArray[i]) {
                max = intArray[i];
                }
                if (min > intArray[i]) {
                    min = intArray[i];
                }
        }



        return max -min;
    }
}