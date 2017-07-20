



/*
파라미터로 정수 배열 intArray를 받고 배열의 모든 값의 평균을 리턴해주는 메소드
computeAverage를 쓰세요. 리턴값의 자료형은 double입니다.
 */





public class AverageFinder {
    public double computeAverage(int[] intArray) {


        int total = 0;

/*
        //-------------for문 이용 --------------------
        for(int i=0; i < intArray.length; i++){
            total += intArray[i];
          }
          return (double)(total)/intArray.length;
*/

/*
        //-------------while문 이용 --------------------

        int i = 0;
        while (i < intArray.length) {
            total += intArray[i];
            i++;

        }
        return (double) total / intArray.length;
 */

        //for -each 이용

        for (int num :intArray) {
            total +=num;
        }
        return (double) total / intArray.length;
    }
}