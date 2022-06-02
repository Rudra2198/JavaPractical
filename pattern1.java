import java.util.*;

public class pattern1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter height of the triangle: ");
        int height = sc.nextInt();

        for (int i = height; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("1");
            }
            System.out.println();
        }
        sc.close();
    }
}
