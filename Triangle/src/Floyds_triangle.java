



public class Floyds_triangle {

    public void printFloydsPyramid(int height) {
        // 코드를 입력하세요.
        int a = 1;
        int temp = 0;

        for (int x = 1; x <= height; x++) { //입력받은 최대값을 구하는 반복문
            temp = temp + x;
        }
        String stemp = Integer.toString(temp);


        String sa;

        for (int i = 1; i <= height; i++) { //행을 바꾸는 반복
            for (int j = 0; j < i; j++) {   // 열을 바꾸는 반복
                    sa = Integer.toString(a);

                for (int x = sa.length(); x <stemp.length(); x++ ) { //자기의 길이가 최대값보다 작다면 공백 출력반복
                    System.out.print(" ");
                }
                       //System.out.print("@");
                        System.out.print(a +" ");
                    a++;
            }
            System.out.println();
        }
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
