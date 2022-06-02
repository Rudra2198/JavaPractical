import java.util.*;

class volume {

    Double r, h, v;

    public volume(Double r, Double h) {

        this.r = r;
        this.h = h;

    }

    public Double getVolume() {

        v = (Math.PI * r * r * h) / 3;
        return v;

    }

    public Double getArea() {

        Double a = (Math.PI * r * r) + (2 * Math.PI * r * h);
        return a;

    }

}

public class cone {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a radius: ");
        Double r = sc.nextDouble();

        System.out.print("Enter a height: ");
        Double h = sc.nextDouble();

        volume v = new volume(r, h);

        System.out.println("The volume of the cone is: " + v.getVolume());
        System.out.println("The area of the cone is: " + v.getArea());

        sc.close();

    }
}