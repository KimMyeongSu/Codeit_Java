import java.util.Scanner;

/**
 * Created by Administrator on 2017-07-18.
 */
public class scanner {
    public static void main(String[] args) {
        System.out.println("입력을 넣으세요.");

        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();

        System.out.println("나이는" +  age);

        System.out.println("이름은 ?");
        String name = scanner.next();

        System.out.println("이름은 :" + name);
    }
}
