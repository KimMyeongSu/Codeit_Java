public class Driver {
    public static void main(String[] args) {


        ShapePrinter printer = new ShapePrinter();

        printer.printPyramid(3);
        System.out.println("----------");
        printer.printPyramid(5);
        System.out.println("----------");
        printer.printPyramid(10);
    }

}


 class ShapePrinter {
     public void printTriangle(int height) {
         for (int i = 1; i <= height; i++) {
             for (int j = 0; j < i; j++) {
                 System.out.print("* ");
             }
             System.out.println();
         }
     }

     public void printPyramid(int height) {
         for (int i=1; i <= height; i++) {

             for (int k = 1; k <= height - i; k++){
                 System.out.print(" ");
             }
             for(int j=2; j <= i; j++) {
                 System.out.print("*");
             }
             System.out.print("*");
             for(int l =2; l <= i; l++){
                 System.out.print("*");
             }
             System.out.println();
         }

     }
 }


     class AverageFinder {

    /*
    파라미터로 정수 배열
     intArray를 받고 배열의 모든 값의 평균을 리턴해주는 메소드
     computeAverage를 쓰세요. 리턴값의 자료형은 double입니다.
     */

         double computeAverage(int[] intArray) {
             int sum = 0;
             for (int num : intArray) {
                 sum += num;
             }
             return (double) sum / intArray.length;

         }
     }

     class GreatestDifferenceFinder {
         int greatestDifference(int[] intArray) {
        /*
         파라미터로 정수 배열 intArray를 받고,
         두 원소의 차이 중 가장 큰 값을 리턴해주는
         메소드 greatestDifference를 쓰세요. 리턴값의 자료형은 int입니다.
         만약 원소 개수가 2개보다 작으면 0을 리턴해줍니다.
         */
             if (intArray.length < 2) {
                 return 0;
             }

/**  두 원소의 차이 중 가장 큰 값 == 최대값 - 최소값  **/
             int max = intArray[0];
             int min = intArray[0];

             for (int num : intArray) {
                 if (num > max) {
                     max = num;
                 }

                 if (num < min) {
                     min = num;
                 }
             }
             return (max - min);
         }

     }



