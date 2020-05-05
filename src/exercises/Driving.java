package exercises;

import java.util.Scanner;

public class Driving {
    public static void main (String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the amount of miles you've driven: ");
        double Miles = input.nextDouble();
        System.out.println("Please enter gallons consumed: ");
        double Gas = input.nextDouble();
        input.close();

        System.out.println("Your miles-per-gallon usage is: " + Miles / Gas);
    }
}
