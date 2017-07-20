public class Pyramid {




       public void printPyramid(int height) {



        for (int i=1; i <= height; i++) {  //1번루프 1부터 1씩 증가하면서 height 까지 반복

                 for (int k = 1; k <= height-i; k++){  //1번루프 안에서 1씩증가하며 (height -1)  까지 반복
                                                         //공백이 양쪽에 height -1 개씩 필요 .
                                                        //i가 증가하는거만큼 공백 감소
                      System.out.print("@");
                  }

                 for(int j=2; j <= i; j++) {  //1번루프 안에서 2부터 1씩 증가하며 1번루프 반복횟수까지 반복
                                              //i가 1부터 시작하기때문에 두번째부터 연산
                     System.out.print("1");
                 }
            System.out.print("*");

                 for(int l =2; l <= i; l++){
                        System.out.print("*");
                 }
            System.out.println();
        }
    }




    public static void main(String[] args) {

        Pyramid printer = new Pyramid();

        // 테스트

        //printer.printPyramid(3);
        System.out.println("----------");
        printer.printPyramid(5);
        System.out.println("----------");
       // printer.printPyramid(10);
    }


}


