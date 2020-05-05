package Studios;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double radius;
        do {
            System.out.println("Please enter the radius of your circle: ");
            radius = input.nextDouble();

            if (radius < 0 ) {
                System.err.println("Error: Value is negative");
            }
        } while(radius <= 0);

        double area = Circle.getArea(radius);
        System.out.println("The area of your circle is " + area);
        input.close();
    }
}
