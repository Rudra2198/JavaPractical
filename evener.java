import java.util.*;

public class evener {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a starting number: ");
        int start = sc.nextInt();

        System.out.print("Enter an ending number: ");
        int end = sc.nextInt();

        int temp;

        if (start > end) {
            temp = start;
            start = end;
            end = temp;
        }

        System.out.println();

        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }

        sc.close();
    }
}
