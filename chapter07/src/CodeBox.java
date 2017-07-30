public class CodeBox {
    public static void main(String[] args) {
        // Theater 생성
        Theater t = new Theater(5, 9);

        // 좌석 예약
        System.out.println("김신의님 이름으로 A5부터 2개의 좌석 예약: " + (t.reserve("김신의", 'A', 5, 2) ? "성공" : "실패"));
        System.out.println("이윤수님 이름으로 C1부터 3개의 좌석 예약: " + (t.reserve("이윤수", 'C', 1, 3) ? "성공" : "실패"));
        System.out.println("강영훈님 이름으로 D4부터 7개의 좌석 예약: " + (t.reserve("강영훈", 'D', 4, 7) ? "성공" : "실패"));
        System.out.println("문종모님 이름으로 C7부터 3개의 좌석 예약: " + (t.reserve("강영훈", 'C', 7, 3) ? "성공" : "실패"));

        // 좌석 취소
        System.out.println("A6부터 좌석 3개 취소: 총 " + t.cancel('A', 6, 3) + "개의 좌석이 취소되었습니다.");
        System.out.println("이윤수님의 좌석 취소: 총 " + t.cancel("이윤수") + "개의 좌석이 취소되었습니다.");

        // 결과 출력
        System.out.println();
        t.printSeatMatrix();
        System.out.println("총 " + t.getNumberOfReservedSeat() + "개의 좌석이 예약되었습니다.");
    }
}


 class Theater {

     private Seat[][] seats ;
     //전체 좌석을 표현하는 2차원 Seat 배열
     private int rowCount, colCount;
     //전체 좌석의 행(row)과 열(col)의 수를 담는 변수

     public void setRowCount(int rowCount) {
         this.rowCount = rowCount;
     }

     public void setColCount(int colCount) {
         this.colCount = colCount;
     }


     public Theater(int rowCount, int colCount) {
         //Theater 클래스의 생성자
         //파라미터로 받은 열과 행의 수에 해당하는 2차원 배열생성

         seats = new Seat[rowCount][colCount];
         //Seat 클래스의 인스턴스들로 배열을 채워줍니다.
         //모든 Seat 인스턴스는 서로 달라야 합니다. 총 rowCount * colCount개의 인스턴스가 필요


         for (int i = 0; i < rowCount; i++) {
             for (int j = 0; j < colCount; j++) {
              seats [i][j] = new Seat();
                 seats [i][j].reserve(null);
             }

         }

         // /파라미터로 받은 변수들의 값을 각각 동일한 이름의 내부 인스턴스 변수에 넣어줍니다.
         // 예를 들어서 rowCount는 this.rowCount
         setRowCount(rowCount);
         setColCount(colCount);

     }


     public void printSeatMatrix() {
         System.out.print("  ");
         for (int i = 1; i <= 9; i++) {
             System.out.print("  " + i);
         }
         System.out.println();


         for (int i = 0; i < rowCount; i++) {

             System.out.print((char) ('A' + i) + ": ");

             for (int j = 0; j < colCount; j++) {
                 Seat s = seats[i][j];
                 if (s.isOccupied()) {
                     System.out.print("[O]");
                 } else {
                     System.out.print("[ ]");
                 }
             }
             System.out.println();
         }
     }

     public boolean reserve(String name, char rowChar, int col, int numSeat){
         //예약 정보(이름, 열, 행, 예약 좌석 수)를 파라미터로 받아 예약하는 메소드입니다.


         //존재하지 않는 행 또는 열을 입력하면 false를 리턴하고 메소드를 종료
         if (rowChar >= 'F' || col  >= 10) {return false;}

         //만약 1열부터 9열까지밖에 없는데,
         // D7부터 네 좌석을 예약하면 false를 리턴하고 메소드를 종료합니다. 아무 좌석도 예약되면 안 됩니다!

         if ( col+numSeat  > 10 ) {return false;}


         //D3부터 네 좌석(D3, D4, D5, D6)을 예약 하려고 하는데 D6가 이미 예약된 자리라면,
         // 나머지 좌석들(D3, D4, D5)도 예약되면 안 됩니다

         for (int i = col-1; i < (col-1+numSeat); i++) {
             if (seats[getRowIndex(rowChar)-1][i].isOccupied()) {return false;}
         }




         //문제가 없는 경우, 실제로 예약을 하고 true를 리턴


         for (int i = col-1; i < (col-1)+numSeat; i++){
               seats[getRowIndex(rowChar)-1][i].reserve(name);

            }



         return true;
     }

     public int getRowIndex(char uppercaseChar) {
         return (int)uppercaseChar - 64;
     }


     public int cancel(String name) {
         //이름 name으로 예약된 자리를 취소
        int temp =0;
        for (int i=0; i < seats.length; i++){
            for (int j=0; j< seats[i].length; j++) {

                if (seats[i][j].getName() != null && seats[i][j].getName().equals(name)) {
                        seats[i][j].cancel();
                        temp++;
                }
            }
        }
        return temp;
     }

     public int cancel(char rowChar, int col, int numSeat) {
        //파라미터로 받는 '열', '행', '좌석 수'에 해당되는 모든 좌석의 예약을 취소


         int temp =0;

         for (int i = col-1; i < (col-1+numSeat); i++){
            if(seats[getRowIndex(rowChar)-1][i].getName() != null) {
                seats[getRowIndex(rowChar) - 1][i].cancel();
                temp++;
            }
         }

        return temp;
     }


     public int getNumberOfReservedSeat() {
        int temp=0;

         for (int i=0; i < seats.length; i++){
             for (int j=0; j< seats[i].length; j++) {

                 if (seats[i][j].getName() != null) {

                     temp++;
                 }
             }
         }
         return temp;
     }

}



class Seat {

    private String name; //예약자의 이름

    public String getName() {

        return this.name;
    }

    public void reserve(String name) {
        this.name = name;
    }


    public void cancel() {
        // 예약자 이름을 취소
        this.name = null;
    }


    public boolean isOccupied() {


        return this.name != null;
    }

    public boolean match(String checkName) {
        //checkName이라는 이름으로 예약된 자리인지 확인
        return this.name.equals(checkName);


    }
}