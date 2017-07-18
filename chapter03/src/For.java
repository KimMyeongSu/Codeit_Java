/**
 * Created by Administrator on 2017-07-18.
 */
public class For {

    public static void main (String [] args) {
        int sum=1;
        for (int i =1; i<=9; i++) {
            for (int j= 1; j <=9; j++) {
                sum = i *j;
                System.out.println( i + " * " + j +" = " +sum);
            }
        }

    }
}
