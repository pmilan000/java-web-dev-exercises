package exercises;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int[] numArray = {1,1,2,3,5,8};
        String greenEggs = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";

        for (int i : numArray) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
        String[] eggSplit = greenEggs.split(" ");
        System.out.println(Arrays.toString(eggSplit));

        String[] eggSplit3 = greenEggs.split("\\,");
        System.out.println(Arrays.toString(eggSplit3));

        String[] eggSplit2 = greenEggs.split("\\.");
        System.out.println(Arrays.toString(eggSplit2));
    }
}
