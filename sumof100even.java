import java.util.*;

public class sumof100even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sumOfEven = 0;
        int sumOfOdd = 0;

        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                sumOfEven += i;
            }
        }

        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 1) {
                sumOfOdd += i;
            }
        }

        System.out.println("Sum of even numbers from 0 to 100 is " + sumOfEven);
        System.out.println("Sum of odd numbers from 0 to 100 is " + sumOfOdd);
        sc.close();
    }
}
