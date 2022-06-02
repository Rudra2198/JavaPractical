import java.util.*;

public class vowelconcat {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String str = sc.nextLine();

        int vowelCounter = 0;

        for (int i = 0; i < str.length(); i++) {
            char v = str.charAt(i);
            if (v == 'a' || v == 'e' || v == 'i' || v == 'o' || v == 'u') {
                vowelCounter++;
            }
        }

        System.out.println("Number of vowels in the string is " + vowelCounter);

        System.out.println("Enter another string to concatenate: ");
        String str2 = sc.nextLine();

        String concat = str + str2;

        System.out.println("Concatenated string is " + concat);

        sc.close();
    }
}
