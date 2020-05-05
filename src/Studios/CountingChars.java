package Studios;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountingChars {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //String hidden = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";

        System.out.println("Enter a string to parse: ");
        String hidden = input.nextLine();
        //System.out.println("Character Hash");
        HashMap<Character, Integer> charCount = new HashMap<>();
        char[] charsInHidden = hidden.toLowerCase().toCharArray();


        for (char i : charsInHidden) {
            if (!charCount.containsKey(i)) {
                charCount.put(i, 1);
            } else {
                charCount.put(i, charCount.get(i) + 1);
            }
        }
        for(Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }
}



