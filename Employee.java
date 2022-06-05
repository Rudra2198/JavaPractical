import java.util.*;

class Manager extends Employee {

    Scanner s = new Scanner(System.in);

    public void teller() {
        System.out.print(" Enter you salary : ");
        int sal = s.nextInt();

        if (sal > 25000) {
            System.out.print(" You are eligible for loans, RSUs and health benefits");
        } else {
            System.out.print(" Basic privileges are available ");
        }

    }

    public void teller(int a) {

        if (a > 10) {
            System.out.println(" You have used up all of your leaves ");
        } else {
            System.out.println(" You have " + (10 - a) + " leaves left!");
        }

    }

    public void identifier() {
        System.out.println(" This is the Manager class ");
    }

    class Details {

        public void identifier() {
            System.out.println(" This is the nested class Details ");
        }

    }
}

public class Employee {
    public static void main(String[] args) {

        Manager m = new Manager();

        Manager.Details dep = m.new Details();

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name : ");
        String name = sc.nextLine();

        System.out.print("Enter your address : ");
        String address = sc.nextLine();

        System.out.print("Enter yor designation : ");
        String designation = sc.nextLine();

        m.teller();

        System.out.print(" Enter  leaves taken : ");
        int b = sc.nextInt();

        System.out.println("");
        m.teller(b);

        m.identifier();
        System.out.println("");
        dep.identifier();

    }
}