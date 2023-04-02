package org.launchcode.java.studios.countingcharacters;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Bonus {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // Prompt the user to enter the string in the command line.
        System.out.println("Enter a string to count its characters: ");
        String userString = input.nextLine();
        //Exclude non-alphabetic characters
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUWXYZ";
        //Make the character counts case-insensitive.
        char[] charArray = userString.toUpperCase().toCharArray();
        HashMap<Character, Integer> counts = new HashMap<>();

        for (char letter : charArray) {
            if (alphabet.indexOf(letter) >= 0) {
                if (counts.containsKey(letter)) {
                    counts.put(letter, counts.get(letter) + 1);
                } else {
                    counts.put(letter, 1);
                }
            }
        }
        for (Map.Entry<Character, Integer> count : counts.entrySet()) {
            System.out.println(count.getKey() + ": " + count.getValue());
        }

    }
}

