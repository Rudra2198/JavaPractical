import java.util.*;

class Area {

    Double r;

    public Area(Double r) {

        this.r = r;

    }

    public Double getArea() {

        Double a = (Math.PI * r * r);
        return a;

    }

    public Double getCircumference() {

        Double c = (2 * Math.PI * r);
        return c;

    }

}

public class circle {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a radius: ");
        Double r = sc.nextDouble();

        Area a = new Area(r);

        System.out.println("The area of the circle is: " + a.getArea());
        System.out.println("The circumference of the circle is: " + a.getCircumference());

        sc.close();

    }

}
