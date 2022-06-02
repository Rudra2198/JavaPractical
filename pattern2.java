import java.util.*;

public class pattern2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int count = 1;

        System.out.print("Enter height of pyramid: ");
        int height = sc.nextInt();

        for (int i = 1; i <= height; i++) {
            System.out.print(count);

            for (int j = 1; j <= i; j++) {

                System.out.print("* ");

            }
            count++;

            System.out.println();

            sc.close();
        }
    }
}
