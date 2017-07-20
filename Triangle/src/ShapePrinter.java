



public class ShapePrinter {
        public void printTriangle(int height) {


            for (int i =0; i <height; i++){
                for (int j = 0; j <=i; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }

    }



    public static void main(String[] args) {
        ShapePrinter printer = new ShapePrinter();

        // 테스트
        printer.printTriangle(3);
        System.out.println("----------");
        printer.printTriangle(5);
        System.out.println("----------");
        printer.printTriangle(10);
    }


}





