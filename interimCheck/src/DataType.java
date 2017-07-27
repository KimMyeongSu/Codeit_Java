public class DataType {

    public static void main(String[] args) {



/**

        to \ from	byte	short  int	long	float	double
        byte	    -	      X    	X	  X       X	      X
        short	    O	      - 	X	  X    	  X	      X
        int	        O	      O	    -	  X	      X       X
        long	    O	      O	    O	  -	      X	      X
        float	    O	      O	    O	  O	      -	      X
        double	    O	      O	    O	  O	      O	      -

**/
        int a = 36;
        double b = a;     // int to double

        short c = 17;
        long d = c;       // short to long

        float e = 3.14f;
        double f = e;     // float to double

        double pi = 3.14;
        int myInt = (int) pi; // 데이터 손실 (소수 부분)
        System.out.println(myInt);


        System.out.println();System.out.println();
        System.out.println("정수형 4개 평균 실수형 출력 ");
        int koreanScore=86, mathScore = 94, scienceScore=87,computerScore =100;
        double average = (koreanScore + mathScore + scienceScore + computerScore) /4.0;
        System.out.println(average);

    }
}
