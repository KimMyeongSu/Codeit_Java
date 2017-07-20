



public class Floyds_triangle {

    public void printFloydsPyramid(int height) {
        // 코드를 입력하세요.
        int a = 1;
        int temp = 0;
        int test;
        for (int x = 1; x <= height; x++) {
            temp = temp + x;
        }

        String stemp = Integer.toString(temp);
        //stemp.length() 가 최대값의 길이
        String sa;
        for (int i = 1; i <= height; i++) {

            for (int j = 0; j < i; j++) {


                    sa = Integer.toString(a);
                    test = sa.length();


                       //System.out.print("@");
                        System.out.print(test +" ");

                    a++;



            }

            System.out.println();
        }



        System.out.println(stemp.length());

    }


    public static void main(String[] args) {

        Floyds_triangle printer = new Floyds_triangle();

        // 테스트
        printer.printFloydsPyramid(3);
        System.out.println("----------");
        printer.printFloydsPyramid(5);
        System.out.println("----------");
        printer.printFloydsPyramid(15);

    }
}
