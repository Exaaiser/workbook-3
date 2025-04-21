package com.pluralsight;

import java.util.Scanner;

public class FamousQuotes {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);

            String[] favoriteQuotes = {"The greatest victory is to conquer yourself.", "Impossible is a word to be found only in the dictionary of fools.",
                    "If you want to stop me, you’ll have to kill me.", "Victory belongs to the most persevering.", "In war, the moral is to the physical as three is to one.",
                    "Appear weak when you are strong, and strong when you are weak.", "The supreme art of war is to subdue the enemy without fighting.", "Knowing yourself is the beginning of all wisdom.",
                    "We are what we repeatedly do. Excellence, then, is not an act, but a habit.", "The strength of a wall is neither greater nor less than the courage of the men who defend it."};

            System.out.println("Please select your Favorite Quote (Enter 0-10): ");
            int index = scanner.nextInt();
            System.out.println(favoriteQuotes[index]);

            switch (index) {
                case 1, 2, 3, 4, 5:
                    System.out.println("\n---Napoleon---");
                    break;
                case 6, 7:
                    System.out.println("\n---Sun Tzu---");
                    break;
                case 8, 9:
                    System.out.println("\n---Aristotle---");
                    break;
                case 0:
                    System.out.println("\n---Emir Timur---");

                    System.out.println(favoriteQuotes[index]);
            }
        } catch (Exception e) {
            System.out.println("Please choose on List!");
        }
    }
}






