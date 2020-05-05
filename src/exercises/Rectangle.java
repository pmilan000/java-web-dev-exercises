package exercises;

import java.util.Scanner;

public class Rectangle {
    public static void main (String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please provide length and width:");
        double rectLength = input.nextDouble();
        double rectWidth = input.nextDouble();
        input.close();

        System.out.println("The area of your rectangle is: " + rectLength * rectWidth);
    }
}
