package exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class ArrayListPractice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<Integer> someInts = new ArrayList<>(Arrays.asList(1, 2, 4, 8, 10, 12, 15, 20, 33, 50));
        ArrayList<String> randomWords = new ArrayList<>(Arrays.asList("space", "memes", "lysol", "signs", "graph"));
        System.out.println(sumEven(someInts));

        System.out.println("Enter a word length: ");
        int length = input.nextInt();
        input.close();

        fiveLetters(randomWords, length);

    }
    public static int sumEven(ArrayList<Integer> arr) {
        int total = 0;

        for (int i : arr) {
            if (i % 2 == 0) {
                total += i;
            }
        }
        return total;
    }
    public static void fiveLetters(ArrayList<String> arr, int length) {
        for (String word : arr) {
            if (word.length() == length) {
                System.out.println(word);
            }
        }
    }

}
