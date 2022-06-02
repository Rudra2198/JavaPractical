import java.util.*;

public class studentgrade {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student name: ");
        String name = sc.nextLine();

        System.out.print("Enter Science marks: ");
        int science = sc.nextInt();

        System.out.print("Enter Math marks: ");
        int math = sc.nextInt();

        System.out.print("Enter English marks: ");
        int english = sc.nextInt();

        System.out.print("Enter Computer Science marks: ");
        int computer = sc.nextInt();

        int totalObtained = science + math + english + computer;
        int totalMarks = 400;
        int percentage = (totalObtained * 100) / totalMarks;

        System.out.println(name + "has secured " + percentage + "%");

        if (percentage >= 80) {
            System.out.print("Grade: A");
        } else if (percentage >= 70) {
            System.out.print("Grade: B");
        } else if (percentage >= 60) {
            System.out.print("Grade: C");
        } else if (percentage >= 50) {
            System.out.print("Grade: D");
        } else {
            System.out.print("Grade: F");
        }

        sc.close();
    }
}
